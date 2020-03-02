package com.jwt.dao;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwt.model.CreditCard;

@Repository
public class CreditCardDAOImpl implements CreditCardDAO {

    @Autowired
    private SessionFactory sessionFactory;



    public CreditCard validateCreditScore(String pannumber) {
        return (CreditCard) sessionFactory.getCurrentSession().get(
                CreditCard.class, pannumber);
    }


}
