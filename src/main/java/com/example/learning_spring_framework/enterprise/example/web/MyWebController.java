package com.example.learning_spring_framework.enterprise.example.web;

import com.example.learning_spring_framework.enterprise.example.business.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class MyWebController {
    @Autowired
    private BusinessService businessService;
    public long returnValueFromBussinesService(){
        return businessService.calculateSum();
    }
}

