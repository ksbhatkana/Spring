package com.ksbhat.funprojecton3layers.controller;

import com.ksbhat.funprojecton3layers.business.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @Autowired
    private BusinessService businessService;
    @GetMapping("/sum")
    public long displaySum(){

        return businessService.getSum();

    }
}
