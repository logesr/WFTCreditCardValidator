package com.jwt.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.CreditCardDAO;
import com.jwt.model.CreditCard;

@Service
@Transactional
public class CreditCardServiceImpl implements CreditCardService {

    @Autowired
    private CreditCardDAO creditCardDAO;


    public CreditCard validateCreditScore(String pannumber) {
        return creditCardDAO.validateCreditScore(pannumber);
    }


    public void setCreditCardDAO(CreditCardDAO creditCardDAO) {
        this.creditCardDAO = creditCardDAO;
    }

}
