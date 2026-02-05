package com.example.AS0525U5W1D4.Entities;

import com.example.AS0525U5W1D4.As0525U5W1D4Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    private DrinkService drinkService;

    @Autowired
    public Runner(DrinkService drinkService) {
        this.drinkService = drinkService;
    }

    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(As0525U5W1D4Application.class);
        try {
            Drink Fanta = (Drink) ctx.getBean("Fanta");
            drinkService.save(Fanta);
        } catch (NotFoundException ex) {
            //log.error(ex.getMessage());
        }
    }
}
