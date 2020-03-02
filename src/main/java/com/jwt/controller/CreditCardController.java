package com.jwt.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.jwt.model.CreditCard;
import com.jwt.service.CreditCardService;

@Controller
public class CreditCardController {

    private static final Logger logger = Logger
            .getLogger(CreditCardController.class);

    public CreditCardController() {
        System.out.println("CreditCardController()");
    }

    @Autowired
    private CreditCardService creditCardService;

    @RequestMapping(value = "/")
    public ModelAndView getHome(HttpServletRequest request) throws IOException {
        ModelAndView model = new ModelAndView("index");
        return model;
    }



    @RequestMapping(value = "/CreditCardValidation", method = RequestMethod.GET)
    public ModelAndView checkCreditScore(HttpServletRequest request) {
        String pannumber = request.getParameter("PAN_No");
        String validity = "";
        if(creditCardService.validateCreditScore(pannumber)==null){
            validity = "invalid";
        }else if(creditCardService.validateCreditScore(pannumber).getCreditscore() > 5){
            validity= "eligible";
        }else{
            validity= "ineligible";
        }
        ModelAndView model = new ModelAndView(validity);


        return model;
    }

}