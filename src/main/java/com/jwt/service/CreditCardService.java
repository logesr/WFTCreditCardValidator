package com.jwt.service;



import com.jwt.model.CreditCard;

public interface CreditCardService {

    public CreditCard validateCreditScore(String pannumber);
}