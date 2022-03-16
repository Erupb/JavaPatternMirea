package com.example.task10;

import org.springframework.stereotype.Component;

@Component
public class MiddleProgrammer implements IProgrammer {
    @Override
    public String doPrint() {
        return "Im middle";
    }
}
