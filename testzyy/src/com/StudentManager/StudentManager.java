package com.StudentManager;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        //创建集合对象，用于存储学生数据
        ArrayList<Student> array=new ArrayList<Student>();
        while (true) {
            System.out.println("--------欢迎来到学生管理系统-------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("请输出你的选择：");

            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            switch (line) {
                case "1" -> addStudent(array);
                case "2" -> deleteStudent(array);
                case "3" -> updateStudent(array);
                case "4" -> findStudent(array);
                case "5" -> {
                    System.out.println("退出");
                    //return; //也可以
                    System.exit(0);//JVM退出
                }
            }
        }

    }

//    public static void addStudent(ArrayList<Student> array) {
//        //键盘录入学生对象需要的信息
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入学生学号：");
//        String sid = sc.nextLine();
//        System.out.println("请输入学生姓名：");
//        String name = sc.nextLine();
//        System.out.println("请输入学生年龄：");
//        String age = sc.nextLine();
//        System.out.println("请输入学生居住地：");
//        String address = sc.nextLine();
//        //创建学生对象，把键盘录入的信息赋值给学生对象的成员变量
//        Student s = new Student();
//        s.setSid(sid);
//        s.setName(name);
//        s.setAge(age);
//        s.setAddress(address);
//        //将学生对象添加到集合中
//        array.add(s);
//        //给出提示
//        System.out.println("添加学生成功");
//    }
    //增加学号是否重复的判断
    public static void addStudent(ArrayList<Student> array) {
        //键盘录入学生对象需要的信息
        Scanner sc = new Scanner(System.in);
        //为了sid在while循环外访问到，我们就把他定义到循环外
        String sid;
        //为了让程序能够回到这里，我们使用循环实现
        while(true){
            System.out.println("请输入学生学号：");
            sid = sc.nextLine();

            boolean flag = isUsed(array, sid);
            if(flag){
                System.out.println("你输入的学号重复了，请重新输入");
            }else{
                break;
            }
        }
        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生居住地：");
        String address = sc.nextLine();
        //创建学生对象，把键盘录入的信息赋值给学生对象的成员变量
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);
        //将学生对象添加到集合中
        array.add(s);
        //给出提示
        System.out.println("添加学生成功");
}
    public static boolean isUsed(ArrayList<Student> array, String sid){
        boolean flag=false;
        for(int i=0;i<array.size();i++){
            Student student = array.get(i);
            if(student.getSid().equals(sid)){
                flag=true;
                break;
            }
        }
        return flag;
    }
    public static void findStudent(ArrayList<Student> array){
        //先做集合中是否有数据的方法
        if(array.size()==0){
            System.out.println("无信息，请先添加信息再查询");
            return;
        }
        System.out.println("学号\t\t\t姓名\t\t年龄\t\t居住地");
        for(int i=0;i<array.size();i++){
            Student s = array.get(i);
            System.out.println(s.getSid()+"\t"+s.getName()+"\t"+s.getAge()+"岁\t\t"+s.getAddress());
        }
    }
    public static void deleteStudent(ArrayList<Student> array) {
        System.out.println("请输入要删除学生的学号：");
        Scanner sc=new Scanner(System.in);
        String sid = sc.nextLine();
        int index=-1;//索引不可能为负数，所以先定义一个-1
        for(int i=0;i<array.size();i++){
            //拿到学生对象
            Student s=array.get(i);
            //比较从学生对象获取到的学号和输入的学号是否一致，一致则将该学生对象对应的索引从集合中删除
            if(s.getSid().equals(sid)){
                //array.remove(i);
                index=i;//记录一下索引，下面判断
                break;
            }
        }
        //判断索引是否还是-1没变，如果没变，那么说明不存在这个学号；如果变了那么就存在，可以删除了
        if(index == -1){
            System.out.println("该信息不存在，请重新输入");
        }else{
            array.remove(index);
            System.out.println("删除学生成功");
        }
    }
//    public static void updateStudent(ArrayList<Student> array){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入学生学号：");
//        String sid = sc.nextLine();
//        //输入要修改的学生信息
//        System.out.println("请输入学生姓名：");
//        String name = sc.nextLine();
//        System.out.println("请输入学生年龄：");
//        String age = sc.nextLine();
//        System.out.println("请输入学生居住地：");
//        String address = sc.nextLine();
//        //创建学生对象
//        Student s=new Student();
//        s.setSid(sid);
//        s.setName(name);
//        s.setAge(age);
//        s.setAddress(address);
//        //遍历集合修改对应信息
//        for(int i=0;i<array.size();i++){
//            Student student = array.get(i);
//            if(student.getSid().equals(sid)){
//                array.set(i,s);//通过array的方法set，直接传入索引和新对象进行替换
//            }
//        }
//        System.out.println("修改学生成功");
//    }
    public static void updateStudent(ArrayList<Student> array){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生学号：");
        String sid = sc.nextLine();
        int index = -1;
        for(int i=0;i<array.size();i++){
            Student student = array.get(i);
            if(student.getSid().equals(sid)){
                index=i;
                System.out.println("index="+i);
                break;
            }
        }
        if(index == -1){
            System.out.println("输入学号不存在，请重新输入");
        }else{
            //输入要修改的学生信息
            System.out.println("请输入学生姓名：");
            String name = sc.nextLine();
            System.out.println("请输入学生年龄：");
            String age = sc.nextLine();
            System.out.println("请输入学生居住地：");
            String address = sc.nextLine();
            Student s=new Student();
            s.setSid(sid);
            s.setName(name);
            s.setAge(age);
            s.setAddress(address);
            array.set(index,s);
            System.out.println("修改学生信息成功");
        }
    }
}
