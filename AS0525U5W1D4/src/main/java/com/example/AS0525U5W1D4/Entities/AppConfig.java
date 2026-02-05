package com.example.AS0525U5W1D4.Entities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;


@Configuration
@PropertySource("application.properties")
class AppConfig {

    @Bean
    public Topping prosciutto() {
        return new Topping("Prosciutto", 100, 1.5);
    }

    @Bean
    public Topping pomodoro() {
        return new Topping("pomodoro", 100, 1.5);
    }

    @Bean
    public Topping mozzarella() {
        return new Topping("mozzarella", 100, 1.5);
    }

    @Bean
    public Topping ananas() {
        return new Topping("Ananas", 250, 3);
    }

    @Bean
    public Topping funghi() {
        return new Topping("Funghi", 80, 1.5);
    }

    @Bean
    public Topping peperoni() {
        return new Topping("Peperoni", 120, 2);
    }

    @Primary
    @Bean
    public Pizza margherita() {
        List<Topping> tList = new ArrayList<>();
        tList.add(pomodoro());
        tList.add(mozzarella());
        return new Pizza("Margherita", tList); // solo base
    }

    @Bean
    public Pizza hawaiianPizza(Topping prosciutto, Topping ananas) {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(prosciutto);
        toppings.add(ananas);
        return new Pizza("Pizza Hawaii", toppings);
    }

    @Bean
    public Pizza doppioProsciutto(Topping prosciutto) {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(prosciutto);
        toppings.add(prosciutto);
        return new Pizza("Doppio Prosciutto", toppings);
    }

    @Bean
    public Pizza Ajeje(Topping peperoni) {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(peperoni);
        toppings.add(peperoni);
        return new Pizza("Peperonata e topi morti", toppings);
    }

    @Bean
    public Drink cocaCola() {
        return new Drink("Coca Cola", 200, 3);
    }

    @Bean
    public Drink Fanta() {
        return new Drink("Fanta", 200, 3);
    }

    @Primary
    @Bean
    public Drink acqua() {
        return new Drink("Acqua Naturale", 0, 1);
    }

    @Bean
    public Drink Birra() {
        return new Drink("Birra", 300, 4);
    }

}
