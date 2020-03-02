package com.jwt.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CRED_SCORE")
public class CreditCard implements Serializable {

    private static final long serialVersionUID = -3465813074586302847L;


    @Id
    @Column
    private String pannumber;

    @Column
    private double creditscore;


    public double getCreditscore() {
        return creditscore;
    }

    public void setCreditscore(double creditscore) {
        this.creditscore = creditscore;
    }

    public String getPanNumber() {
        return pannumber;
    }

    public void setPanNumber(String pannumber) {
        this.pannumber = pannumber;
    }


}