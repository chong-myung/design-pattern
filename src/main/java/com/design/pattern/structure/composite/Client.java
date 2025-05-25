package com.design.pattern.structure.composite;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Client {

    static Map<String,MenuComponent> menuItemList = new ConcurrentHashMap<>();

    public static void main(String[] args) throws Exception {
        MenuComponent root = loadMenuTree();
        root.printMenuTree(0);
        String menuId = "ROLE_USER_LIST";
        String buttonId = "ROLE_USER_EDIT";
        String inaccessibleId = "ROLE_USER_DELETE";
        String requiresRole = "ROLE_USER_LIST";
        String userRole = "ROLE_ADMIN_CONFIG,ROLE_USER_MANAGE,ROLE_USER_LIST,ROLE_USER_VIEW,ROLE_USER_EDIT";

        User user = new User(userRole.split(","));

        // 버튼 권한 확인
        MenuComponent menu = menuItemList.getOrDefault("ROLE_USER_LIST", null);

        boolean flag = menu.hasAccessAtButton(user, buttonId);
        System.out.println("Flag : "+ flag);

        boolean inaccessible = menu.hasAccessAtButton(user, inaccessibleId);
        System.out.println("inaccessible : "+ inaccessible);

        boolean menuAccess = menu.hasFullAccess(user);
        System.out.println("menuAccess :"+menuAccess);

    }

        public static MenuComponent loadMenuTree() throws Exception {
            ObjectMapper mapper = new ObjectMapper();
        InputStream is = Client.class.getClassLoader()
                .getResourceAsStream("structure/composite/menu.json");

        if (is == null) throw new RuntimeException("menu.json 파일을 찾을 수 없습니다.");

        JsonNode rootArray = mapper.readTree(is);
        MenuGroup root = new MenuGroup("ROOT", null, null); // 최상위 루트 그룹

        for (JsonNode node : rootArray) {
            MenuGroup group = parseGroup(node, null);
            root.addChild(group);
        }

        return root;
    }

    private static MenuGroup parseGroup(JsonNode node, MenuComponent parent) {
        String name = node.path("name").asText();
        String role = node.path("requiredRole").asText(null);
        MenuGroup group = new MenuGroup(name, role, parent);

        JsonNode children = node.path("children");
        if (children.isArray()) {
            for (JsonNode child : children) {
                String type = child.path("type").asText();
                if ("MENU_ITEM".equals(type) || "SUB_MENU_ITEM".equals(type)) {
                    MenuItem item = parseItem(child, group);
                    menuItemList.put(child.path("requiredRole").asText(),item);
                    group.addChild(item);
                } else if ("MENU_GROUP".equals(type)) {
                    MenuGroup subgroup = parseGroup(child, group);
                    group.addChild(subgroup);
                }
            }
        }

        return group;
    }

    private static MenuItem parseItem(JsonNode node, MenuComponent parent) {
        String name = node.path("name").asText();
        String role = node.path("requiredRole").asText(null);
        MenuItem item = new MenuItem(name, role, parent);

        JsonNode buttons = node.path("buttons");
        if (buttons.isArray()) {
            for (JsonNode btn : buttons) {
                String btnName = btn.path("name").asText();
                String btnRole = btn.path("requiredRole").asText();
                item.addButton(new Button(btnName, btnRole));
            }
        }
        return item;
    }



}
