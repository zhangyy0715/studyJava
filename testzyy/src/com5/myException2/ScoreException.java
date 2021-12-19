package com5.myException2;

public class ScoreException extends Exception{
    //无参构造方法
    public ScoreException() {
    }
    //带参构造方法
    public ScoreException(String message) {
        super(message);
    }
}
