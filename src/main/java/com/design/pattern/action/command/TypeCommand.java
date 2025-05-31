package com.design.pattern.action.command;

public class TypeCommand implements Command{

    private TextEditor textEditor;
    private String text;

    public TypeCommand(TextEditor textEditor, String text) {
        this.textEditor = textEditor;
        this.text = text;
    }

    @Override
    public void execute() {
        textEditor.addText(text);
    }

    @Override
    public void undo() {
        int length = text.length();
        textEditor.deleteLast(length);
    }
}
