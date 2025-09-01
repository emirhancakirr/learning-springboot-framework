package com.example.learning_spring_framework.enterprise.example.business;

import com.example.learning_spring_framework.enterprise.example.data.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.xml.crypto.Data;
import java.util.List;

@Component
public class BusinessService {
    private DataService dataService;

    @Autowired
    public BusinessService(DataService dataService){
        super();
        System.out.println("Constructor Injection");
        this.dataService = dataService;
    }

//    @Autowired
//    public void setDataService(DataService dataService){
//        System.out.println("Setter Injection");
//        this.dataService = dataService;
//    }
    public long calculateSum() {
        List<Integer> data = dataService.getData();
        return data.stream().reduce(Integer::sum).get();
    }
}

