package com.ksbhat.funprojecton3layers.business;

import com.ksbhat.funprojecton3layers.data.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BusinessService {

    @Autowired
    private DataService dataService;
    public long getSum(){

        List<Integer> data = dataService.data();

        return data.stream().reduce(0, Integer::sum).longValue();
    }
}
