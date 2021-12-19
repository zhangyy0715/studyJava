package com2.myObject;

public class Student {
    String name;
    int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        /*
        s1.equals(s2)
        this---s1
        o  ----s2
         */
        //比较地址是否相同，如果相同，直接返回true
        if (this == o) return true;
        //判断参数是否为null，如果为null，直接返回false
        //getClass判断两个对象是否来自于同一个类，如果来自不同类，则返回false
        if (o == null || getClass() != o.getClass()) return false;
        //把o强转为Student
        //向下转型
        Student student = (Student) o;//student=s2
        //s1的age和s2的age，比较年龄是否相同
        if (age != student.age) return false;
        //比较姓名是否相同，name是String类型的，equals比较的就是String的name是否相同
        //这是String的equals方法，不是Object的equals方法
        return name != null ? name.equals(student.name) : student.name == null;
    }
}
