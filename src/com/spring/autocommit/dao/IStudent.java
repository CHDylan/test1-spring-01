package com.spring.autocommit.dao;

public interface IStudent {
    /**
     *加钱
     */
    public   void addMonery(Integer id,Float monery);

    /**
     * 减
     */
    public   void updateMonery(Integer id,Float monery);
}
