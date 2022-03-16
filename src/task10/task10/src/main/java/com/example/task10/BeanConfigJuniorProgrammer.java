package com.example.task10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfigJuniorProgrammer {
    @Bean
    public IProgrammer iprogrammer() {
        return new JuniorProgrammer();
    }

    @Bean
    public Programmer programmer(IProgrammer iprogrammer) {
        Programmer program = new Programmer();
        program.setProgrammer(iprogrammer);
        return program;
    }
}
