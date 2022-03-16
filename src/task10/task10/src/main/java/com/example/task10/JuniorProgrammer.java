package com.example.task10;

import org.springframework.stereotype.Component;

@Component
public class JuniorProgrammer implements IProgrammer {
    @Override
    public String doPrint() {
        return "Im junior";
    }
}