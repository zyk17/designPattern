package com.zs.c_015_command;

/**
 * @author zhangsan
 * @date 2021/1/14 16:54
 */
public class Main {
    public static void main(String[] args) {
        Content content = new Content("hi, ");
        System.out.println("原始内容: " + content.str);

        Command copyCommand = new CopyCommand(content);
        Chain chain = new Chain();
        chain.addCommand(new DeleteCommand(content));
        chain.addCommand(copyCommand);
        chain.addCommand(new DeleteCommand(content));
        chain.addCommand(copyCommand);
        chain.addCommand(copyCommand);
        chain.addCommand(copyCommand);
        chain.execute();
        System.out.println("===============执行完成==================");
        chain.undo();
        System.out.println("===============撤销完成==================");

        System.out.println("一系列操作完成后:" + content.str);
    }

}

interface Command {
    void execute(Chain chain);
    void undo(Chain chain);
}

class CopyCommand implements Command {
    private Content content;
    public CopyCommand(Content content) {
        this.content = content;
    }

    String s = "i'm zhangsan.";

    @Override
    public void execute(Chain chain) {
        content.str = content.str += s;
        System.out.println(content.str);
        chain.execute();
    }

    @Override
    public void undo(Chain chain) {
        content.str = content.str.substring(0, content.str.length()-s.length());
        System.out.println(content.str);
        chain.undo();
    }

    @Override
    public String toString() {
        return "复制命令";
    }
}

class DeleteCommand implements Command {
    private Content content;
    public DeleteCommand(Content content) {
        this.content = content;
    }

    String s = "";

    @Override
    public void execute(Chain chain) {
        if(content.str.length() > 0){
            s = content.str.substring(content.str.length()-2);
            content.str = content.str.substring(0, content.str.length()-2);
            System.out.println(content.str);
        }
        chain.execute();
    }

    @Override
    public void undo(Chain chain) {
        content.str += s;
        System.out.println(content.str);
        chain.undo();
    }

    @Override
    public String toString() {
        return "删除命令";
    }
}
