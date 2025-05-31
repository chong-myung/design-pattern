package com.design.pattern.action.command;

// 실행될 명령의 인터페이스 제공
public interface Command {

    void execute();
    void undo();
}
