package com.example.task10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfigSeniorProgrammer {
    @Bean
    public IProgrammer iprogrammer() {
        return new SeniorProgrammer();
    }

    @Bean
    public Programmer programmer(IProgrammer iprogrammer) {
        Programmer program = new Programmer();
        program.setProgrammer(iprogrammer);
        return program;
    }
}
