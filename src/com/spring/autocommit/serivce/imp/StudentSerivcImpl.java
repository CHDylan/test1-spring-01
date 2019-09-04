package com.spring.autocommit.serivce.imp;

import com.spring.autocommit.dao.IStudent;
import com.spring.autocommit.serivce.IStudentSerivce;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

@Transactional(isolation= Isolation.REPEATABLE_READ, propagation= Propagation.REQUIRED,readOnly = false)
public class StudentSerivcImpl  implements IStudentSerivce {

/*    private TransactionTemplate  tt;*/

    private IStudent  iStudent;

    @Override
    public void testUpdateAndAdd(Integer addid, Integer updateID, float monery) {
/*      tt.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {


            }
        });*/
        iStudent.updateMonery(updateID,monery);
  //   System.out.println(1 / 0);
        iStudent.addMonery(addid,monery);
        }


 /*   public TransactionTemplate getTt() {
        return tt;
    }

    public void setTt(TransactionTemplate tt) {
        this.tt = tt;
    }*/

    public IStudent getiStudent() {
        return iStudent;
    }

    public void setiStudent(IStudent iStudent) {
        this.iStudent = iStudent;
    }


}