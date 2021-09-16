package com.oop;

/**
 * @ProjectName: WorkSpace
 * @author: ZhangBiBo
 * @description: 抽象类 员工
 * @data: 2021/9/2 14:55
 */
public abstract class Employee {
    private String name;
    private String address;
    private int number;

    public Employee(String name,String address,int number){
        System.out.println("Constructing an Employee");
        this.name = name;
        this.address = address;
        this.number = number;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;//this解决实例变量和局部变量的同名问题
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void mailCheck()
    {
        System.out.println("Mailing a check to " + this.name
                + " " + this.address);
    }
}
