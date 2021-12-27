package com6.myTreeSet;

public class Student implements Comparable<Student>{
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    //自然排序
    @Override
    public int compareTo(Student s) {
        //return 0; //0：s1和s2是同一个元素
        //return 1;//正数：升序; 负数：降序
        //主要条件：按照年龄从小到大，得有两个年龄比较，this是s2，s是s1
        int num = this.age -s.age;
        //次要条件：年龄相同按照name字母排序：
        // num==0为真则年龄相同，执行比较姓名this.name.compareTo(s.name)（姓名相同0，不同1或者-1）
        // num==0为假则年龄不相同，执行num，返回num赋值给num2
        int num2 = num==0?this.name.compareTo(s.name):num;
        return num2;
    }
}
