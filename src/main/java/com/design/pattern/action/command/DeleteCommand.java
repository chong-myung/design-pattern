package com.design.pattern.action.command;

public class DeleteCommand implements Command{
    private TextEditor editor;
    private String deletedText;

    public DeleteCommand(TextEditor editor, int length) {
        String fullText = editor.getText();
        this.deletedText = fullText.substring(Math.max(0, fullText.length() - length));
        this.editor = editor;
    }

    public void execute() {
        editor.deleteLast(deletedText.length());
    }

    public void undo() {
        editor.addText(deletedText);
    }
}
