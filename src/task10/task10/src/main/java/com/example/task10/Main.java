package com.example.task10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Main {
    public static void main(String[] args) {
        ApplicationContext context1 =new AnnotationConfigApplicationContext(BeanConfigJuniorProgrammer.class);
        Programmer printer1 = context1.getBean(Programmer.class);
        printer1.doPrint();

        ApplicationContext context2 =new AnnotationConfigApplicationContext(BeanConfigMiddleProgrammer.class);
        Programmer printer2 = context1.getBean(Programmer.class);
        printer2.doPrint();

        ApplicationContext context3 =new AnnotationConfigApplicationContext(BeanConfigSeniorProgrammer.class);
        Programmer printer3 = context1.getBean(Programmer.class);
        printer3.doPrint();

    }
}
