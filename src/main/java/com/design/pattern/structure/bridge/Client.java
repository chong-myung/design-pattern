package com.design.pattern.structure.bridge;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        // 이용자 수신여부에 따른 알림 우선순위
        // 1. 푸시 2. sms 3. emails
        List<User> users = new ArrayList<>();
        users.add(new User("alice", "Y", "N", "Y"));
        users.add(new User("bob", "N", "Y", "Y"));
        users.add(new User("charlie", "Y", "Y", "N"));
        users.add(new User("diana", "N", "N", "Y"));
        users.add(new User("edward", "Y", "Y", "Y"));
        users.add(new User("frank", "N", "N", "N"));
        users.add(new User("grace", "Y", "N", "N"));
        users.add(new User("hannah", "N", "Y", "N"));
        users.add(new User("ivan", "Y", "Y", "N"));
        users.add(new User("julia", "N", "Y", "Y"));

        // 일반 알림 요청
        NormalAlert normalAlert = new NormalAlert(null);
        for (User user : users) {
            //이용자 알림 여부에 따른 sender 생성
            MessageSender sender = getSender(user);
            if(sender == null) continue;

            normalAlert.setSender(sender);
            normalAlert.notify(user.getUsername() + " 에게 알림 전송");
        }
    }

    private static MessageSender getSender(User user){

        if("Y".equals(user.getPushYn())){
            return new PushSender();
        }else if("Y".equals(user.getSmsYn())){
            return new SmsSender();
        }else if("Y".equals(user.getEmailYn())){
            return new EmailSender();
        }else{
            return null;
        }
    }

    public static class User{
        String username;
        String pushYn;
        String smsYn;
        String emailYn;

        public User(String username, String pushYn, String smsYn, String emailYn) {
            this.username = username;
            this.pushYn = pushYn;
            this.smsYn = smsYn;
            this.emailYn = emailYn;
        }

        public String getUsername() {
            return username;
        }

        public String getPushYn() {
            return pushYn;
        }

        public String getSmsYn() {
            return smsYn;
        }

        public String getEmailYn() {
            return emailYn;
        }
    }
}
