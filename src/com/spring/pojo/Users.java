package com.spring.pojo;

public class Users {


    public Users(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    public Users() {
    }
    /**
     *姓名
     */
    private  String name;

    /**
     *年龄
     */
    private  Integer age;


    private  Car  car;


    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                '}';
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }



    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
