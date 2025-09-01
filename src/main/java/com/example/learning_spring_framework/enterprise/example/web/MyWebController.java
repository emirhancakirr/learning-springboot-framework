package com.example.learning_spring_framework.enterprise.example.web;

import com.example.learning_spring_framework.enterprise.example.business.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class MyWebController {
    private BusinessService businessService;

    public MyWebController(BusinessService businessService){
        System.out.println("BusinessService is injected via cosntruction based method ");
        this.businessService = businessService;
    }

    public long returnValueFromBussinesService(){
        return businessService.calculateSum();
    }
}

