package com5.myException2;

public class Teacher {
    //将来告诉别人，你调我这个方法要注意，这里是有一个异常的，而这个异常是一个编译时异常
    public void checkScore(int score) throws ScoreException{//这里也要加异常
        if(score<0 || score>100){
            //无参构造方法，最后不能输出具体原因，所以要传一个带参的构造方法
//            throw new ScoreException();//自定义的异常要手动去抛new ScoreException()
            throw new ScoreException("你给的分数有误，分数应该在0-100之间");
        }else{
            System.out.println("正常");
        }
    }
}
