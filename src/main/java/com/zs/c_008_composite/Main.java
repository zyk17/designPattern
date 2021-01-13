package com.zs.c_008_composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangsan
 * @date 2021/1/13 21:00
 */
public class Main {

    public static void main(String[] args) {
        Node tree = createTree();

        tree(tree, 0);
    }

    private static void tree(Node tree, int level) {
        if(!tree.isDirectory()) {
            tree.console(level);
            return;
        }
        tree.console(level);
        level++;
        for (Node node : tree.getSonList()) {
            tree(node, level);
        }
//        tree.getSonList().forEach(Main::tree);
    }

    private static Node createTree() {
        Node root = new Node("C", true);

        Node windows = new Node("Windows", true);
        Node user = new Node("user", true);
        root.add(windows).add(user);

        Node hh = new Node("hh.exe", false);
        Node zhCN = new Node("zh-cn", true);
        Node winhlp32 = new Node("winhlp32.exe.mui", false);
        zhCN.add(winhlp32);
        windows.add(hh).add(zhCN);

        Node zhangsan = new Node("zhangsan", true);
        Node gitconfig = new Node(".gitconfig", false);
        Node npmrc = new Node(".npmrc", false);
        Node ssh = new Node(".ssh", true);
        user.add(zhangsan);
        zhangsan.add(gitconfig).add(npmrc).add(ssh);
        return root;
    }

}

class Node {
    private boolean isDirectory;
    private String name;
    private List<Node> sonList = new ArrayList<>();

    public Node(String name, boolean isDirectory) {
        this.name = name;
        this.isDirectory = isDirectory;
    }

    public void console(int level) {
        String delimiter = "";
        for (int i = 0; i < level; i++) {
            delimiter += "\t";
        }
        delimiter = delimiter += "|";
        if(isDirectory){
            System.out.println("\033[32;1m" + delimiter + name + "\033[0m");
        } else {
            System.out.println("\033[33;1m" + delimiter +name + "\033[0m");
        }
    }
    public boolean isDirectory(){
        return isDirectory;
    }

    public Node add(Node n) {
        if(!isDirectory){
            throw new RuntimeException("当前不是文件夹类型不能有子文件。。");
        }
        this.sonList.add(n);
        return this;
    }

    public List<Node> getSonList(){
        return sonList;
    }

}
