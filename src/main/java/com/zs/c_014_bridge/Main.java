package com.zs.c_014_bridge;

/**
 * @author zhangsan
 * @date 2021/1/14 16:37
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(new HandBag(new Red()).getName());
    }

}
//实现化角色：颜色
interface Color {
    String getColor();
}
//具体实现化角色：黄色
class Yellow implements Color {
    public String getColor() {
        return "yellow";
    }
}
//具体实现化角色：红色
class Red implements Color {
    public String getColor() {
        return "red";
    }
}
//抽象化角色：包
abstract class Bag {
    protected Color color;
    public Bag(Color color) {
        this.color = color;
    }
    public abstract String getName();
}
//扩展抽象化角色：挎包
class HandBag extends Bag {
    public HandBag(Color color) {
        super(color);
    }

    public String getName() {
        return color.getColor() + "HandBag";
    }
}
//扩展抽象化角色：钱包
class Wallet extends Bag {
    public Wallet(Color color) {
        super(color);
    }

    public String getName() {
        return color.getColor() + "Wallet";
    }
}
