package com.spring.pojo;

public class Studnet {
    /**
     *编号
     */
    private  Integer id;
    /**
     *名称
     */
    private  String name;
    /**
     *钱
     */
    private  float  monery ;


    @Override
    public String toString() {
        return "Studnet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", monery=" + monery +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMonery() {
        return monery;
    }

    public void setMonery(float monery) {
        this.monery = monery;
    }
}
