package com.zs.c_018_templatemethod;

/**
 * @author zhangsan
 * @date 2021/1/14 20:37
 */
public class Main {

    public static void main(String[] args) {
        Game g = new Cricket();
        g.play();
    }

}

abstract class Game {
    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    //模板
    public final void play() {

        //初始化游戏
        initialize();

        //开始游戏
        startPlay();

        //结束游戏
        endPlay();
    }
}

class Cricket extends Game {

    @Override
    void endPlay() {
        System.out.println("游戏结束!");
    }

    @Override
    void initialize() {
        System.out.println("初始化.");
    }

    @Override
    void startPlay() {
        System.out.println("开始游戏!");
    }
}
