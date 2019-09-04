package com.spring.pojo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Person {

   private   Object[]  obj;

   private List list;


   private Map  map;

    @Override
    public String toString() {
        return "Person{" +
                "obj=" + Arrays.toString(obj) +
                ", list=" + list +
                ", map=" + map +
                '}';
    }

    public Object[] getObj() {
        return obj;
    }

    public void setObj(Object[] obj) {
        this.obj = obj;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }
}
