package com.ksbhat.funprojecton3layers.data;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataService {

    public List<Integer> data(){
        return List.of(10,20,30,40,50);
    }
}
