package com.luisvicent.javaglobant.topic1.exercises.creationals.singleton;

public class DbSingleton {
    private static volatile DbSingleton instance = null;
    public String s;

    private DbSingleton(String s){
        this.s = s;
    }

    public static DbSingleton getInstance(String s){
        if (instance == null){
            synchronized(DbSingleton.class){
                if (instance == null){
                    instance = new DbSingleton(s);
                }
            }
        }
        return instance;
    }
}
