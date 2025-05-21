package com.design.pattern.create.builder;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class JsonBuilder {
    private final Map<String, Object> map = new LinkedHashMap<>();

    public JsonBuilder add(String key, String value) {
        map.put(key, value);
        return this;
    }

    public JsonBuilder add(String key, boolean value) {
        map.put(key, value);
        return this;
    }

    public JsonBuilder add(String key, Number value) {
        map.put(key, value);
        return this;
    }

    public JsonBuilder add(String key, List<Object> list) {
        map.put(key, list);
        return this;
    }

    public JsonBuilder add(String key, JsonBuilder nestedBuilder) {
        map.put(key, nestedBuilder.map);
        return this;
    }

    public String build(){
        return toJson(map);
    }

    private String toJson(Object obj){
        if (obj instanceof Map) {
            StringBuilder sb = new StringBuilder("{");
            boolean first = true;
            for (var entry : ((Map<String, Object>) obj).entrySet()) {
                if (!first) sb.append(",");
                sb.append("\"").append(entry.getKey()).append("\":").append(toJson(entry.getValue()));
                first = false;
            }
            sb.append("}");
            return sb.toString();
        } else if (obj instanceof List) {
            StringBuilder sb = new StringBuilder("[");
            boolean first = true;
            for (var item : (List<?>) obj) {
                if (!first) sb.append(",");
                sb.append(toJson(item));
                first = false;
            }
            sb.append("]");
            return sb.toString();
        } else if (obj instanceof String) {
            return "\"" + obj + "\"";
        } else {
            return String.valueOf(obj);
        }
    }


}
