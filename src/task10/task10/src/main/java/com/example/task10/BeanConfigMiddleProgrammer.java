package com.example.task10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BeanConfigMiddleProgrammer {
    @Bean
    public IProgrammer iprogrammer() {
        return new MiddleProgrammer();
    }

    @Bean
    public Programmer programmer(IProgrammer iprogrammer) {
        Programmer consoleprogrammer = new Programmer();
        consoleprogrammer.setProgrammer(iprogrammer);
        return consoleprogrammer;
    }


}
