package com.spring.pojo;

public class Car {

    /**
     *
     */
    private  String cname;

    /**
     *
     */
    private  String color;


    @Override
    public String toString() {
        return "Car{" +
                "cname='" + cname + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
