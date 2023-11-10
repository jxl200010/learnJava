package com.jli.test06;
/**
 * 为Person类创建测试类
 */
public class Test {
    // 为程序创建一个入口
    public static void main(String[] args) {
        // 创建一个Person类的对象, 名字为p1
        Person p1 = new Person(); // Class ObjectName = new Class();
        //对对象的属性进行赋值
        p1.age = 25;
        p1.name = "Kris Wu";
        p1.height = 183.5;
        //对对象的属性进行读取
        System.out.println(p1.age);
        System.out.println(p1.name);
        System.out.println(p1.height);
        //调用对象的方法
        p1.study();
    }
}
