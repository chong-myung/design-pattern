package com.design.pattern.action.command;

//리시버 - 명령을 수행하는 실제 비즈니스 로직
public class TextEditor {
    private StringBuilder content = new StringBuilder();

    public void addText(String text) {
        content.append(text);
    }

    public void deleteLast(int length){
        int start = content.length() - length;
        if (start >= 0) content.delete(start, content.length());

    }

    public String getText() {
        return content.toString();
    }
}
