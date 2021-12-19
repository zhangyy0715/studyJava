package com5.myException2;

import java.util.Scanner;

public class TeacherTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入分数");
        int score = sc.nextInt();

        Teacher teacher = new Teacher();
        try {
            teacher.checkScore(score);
        } catch (ScoreException e) {
            e.printStackTrace();
        }
    }
}
