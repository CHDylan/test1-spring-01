package com.spring.autocommit.dao.imp;

import com.spring.autocommit.dao.IStudent;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class StudentImp extends JdbcDaoSupport implements IStudent {





    @Override
    public void addMonery(Integer id, Float monery) {
       String sql="update  Studnet set monery=monery+?  where id=?";
       super.getJdbcTemplate().update(sql,monery,id);
    }

    @Override
    public void updateMonery(Integer id, Float monery) {
        String sql="update  Studnet set monery=monery-?  where id=?";
        super.getJdbcTemplate().update(sql,monery,id);
    }
}
