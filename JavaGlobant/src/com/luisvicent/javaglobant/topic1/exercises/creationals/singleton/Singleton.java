package com.luisvicent.javaglobant.topic1.exercises.creationals.singleton;

public class Singleton {
    public static void main(String[] args) {
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());

        threadFoo.start();
        threadBar.start();
    }
    static class ThreadFoo implements Runnable{
        @Override
        public void run() {
            DbSingleton singleton = DbSingleton.getInstance("FOO");
            System.out.println(singleton.s);
        }
    }

    static class ThreadBar implements Runnable{
        @Override
        public void run() {
            DbSingleton singleton = DbSingleton.getInstance("BAR");
            System.out.println(singleton.s);
        }
    }

}

