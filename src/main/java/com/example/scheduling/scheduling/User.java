package com.example.scheduling.scheduling;

import lombok.Data;

@Data
public class User {
    private int id;
    private String name;
    private int age;
    public  User(){
        System.out.println("调用无参构造函数");
    }
/*    public User(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
        System.out.println("调用有参构造函数");
    }*/
    public User(int id){
        this.id=id;
        System.out.println("调用有参构造函数");
    }
}
