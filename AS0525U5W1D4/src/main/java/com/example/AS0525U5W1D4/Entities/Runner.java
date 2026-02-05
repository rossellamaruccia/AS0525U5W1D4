package com.example.AS0525U5W1D4.Entities;

import com.example.AS0525U5W1D4.As0525U5W1D4Application;
import com.example.AS0525U5W1D4.services.DrinkService;
import com.example.AS0525U5W1D4.services.PizzaService;
import com.example.AS0525U5W1D4.services.ToppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    private DrinkService drinkService;
    private PizzaService pizzaService;
    private ToppingService toppingService;

    @Autowired
    public Runner(DrinkService drinkService, PizzaService pizzaService, ToppingService toppingService) {
        this.drinkService = drinkService;
        this.pizzaService = pizzaService;
        this.toppingService = toppingService;
    }

    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(As0525U5W1D4Application.class);
        try {
            //Drink Fanta = (Drink) ctx.getBean("Fanta");
            //drinkService.save(Fanta);
            //System.out.println(drinkService.findByName("acqua"));
            //Topping pomodoro = (Topping) ctx.getBean("pomodoro");
            //Topping mozzarella = (Topping) ctx.getBean("mozzarella");
            //toppingService.save(pomodoro);
            //toppingService.save(mozzarella);
            Pizza margherita = (Pizza) ctx.getBean("Margherita");
            pizzaService.save(margherita);
        } catch (NotFoundException ex) {
            //log.error(ex.getMessage());
        }
    }
}
