package com.zs.c_001_singleton.testReflect;

public class SingletonClass {
//    private static final Boolean flag = Boolean.FALSE;
    private static ImmutableBoolean flag = new ImmutableBoolean();
    private SingletonClass() {
        if (flag.getCount() <= 0) {
            synchronized (SingletonClass.class) {
                if (flag.getCount() <= 0) {
                    flag.setCount();
                } else {
                    throw new RuntimeException("正在破坏单例模式1");
                }
            }
        } else {
            throw new RuntimeException("正在破坏单例模式2");
        }
    }
    private static SingletonClass singletonClass = null;

    public static SingletonClass getInstance() {
        if (singletonClass == null) {
            synchronized (SingletonClass.class) {
                if (singletonClass == null) {
                    singletonClass = new SingletonClass();
                }
            }
        }
        return singletonClass;
    }

    private static class ImmutableBoolean {
        private static int count = 0;
        public ImmutableBoolean() {

        }

        public void setCount() {
            synchronized (SingletonClass.class) {
                if (count <= 0) {
                    count ++;
                } else {
                    throw new RuntimeException("");
                }
            }
        }

        public int getCount(){
            return count;
        }
    }
}
