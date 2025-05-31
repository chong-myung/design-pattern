package com.design.pattern.action.command;

public class Client {

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        EditorInvoker invoker = new EditorInvoker();

        invoker.execute(new TypeCommand(editor, "Hello "));
        invoker.execute(new TypeCommand(editor, "World!"));

        System.out.println("현재 텍스트: " + editor.getText()); // Hello World!

        invoker.undo(); // World! 삭제
        System.out.println("Undo 후: " + editor.getText()); // Hello

        invoker.execute(new DeleteCommand(editor, 3)); // 'llo' 삭제
        System.out.println("삭제 후: " + editor.getText()); // He

        invoker.undo(); // 삭제 복원
        System.out.println("삭제 Undo 후: " + editor.getText()); // Hello
    }
}
