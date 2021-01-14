package com.zs.c_015_command;

import java.util.ArrayList;
import java.util.List;

/**
 * 加入责任链模式
 * @author zhangsan
 * @date 2021/1/14 17:02
 */
public class Chain {

    private List<Command> commandList = new ArrayList<>();
    int pos;

    public void execute() {
        if(pos < commandList.size()) {
            System.out.println("第" + (pos+1) + "个开始执行,当前执行的命令是: " + commandList.get(pos));
            commandList.get(pos++).execute(this);
        }
    }

    public void undo() {
        if(pos > 0) {
            System.out.println("第" + (pos) + "个开始撤销,当前执行的命令是: " + commandList.get(pos-1));
            commandList.get(--pos).undo(this);
        }
    }

    public void addCommand(Command command) {
        commandList.add(command);
    }

}
