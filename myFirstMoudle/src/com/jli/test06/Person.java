package com.jli.test06;

/**
 * 【1】万物皆为对象
 * 【2】类 （Class）: 对 对象 向上提取像的部分、公共的部分，以此形成类。类就相当于一个模板
 * 【3】对象 （Object）：模板下具体的一个一个实例
 * 【4】Java中先定义类，再定义对象
 */
public class Person {
    // 定义类的特点、属性、名词
    int age;
    String name;
    double height;

    // 定义类的行为、方法、动词
    public void study() { // 在面向对象编程里面，static修饰符可以省略
        System.out.println("Person loves study!");
    }

    // 显式定义一个构造器，如果没有显式定义，系统会默认分配一个隐式构造器
    // 构造器没有返回值，且要求类名作为方法名
    public Person() {
        System.out.println("You defined a constructor!");
    }

    // 既然构造器是一种方法，那么就可以对方法进行重载，即对构造器重载
    // 重载即定义一个相同名字的方法，但参数个数或参数种类或参数顺序不相同
    public Person(int age, String name, double height) {
        //age = age; // 如果参数名字和属性名字重复，那么发生就近原则，等号两边的 age 都是参数，相当于白赋值，没用
        this.age = age;// 如果想为属性赋值，那么在表达属性的值加 this. 来修饰
        this.name = name;
        this.height = height;


    }
}

