package com.jwt.dao;


import com.jwt.model.CreditCard;

public interface CreditCardDAO {

    public CreditCard validateCreditScore(String pannumber);
}