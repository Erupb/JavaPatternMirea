package com.example.task10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Programmer{
    private IProgrammer programmer;


    public void doPrint() {
        System.out.println(programmer.doPrint());
    }

    @Autowired
    public void setProgrammer(IProgrammer programmer){
        this.programmer=programmer;
    }
}