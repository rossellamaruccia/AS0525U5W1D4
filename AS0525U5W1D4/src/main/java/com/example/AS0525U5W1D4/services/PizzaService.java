package com.example.AS0525U5W1D4.services;

import com.example.AS0525U5W1D4.Entities.Pizza;
import com.example.AS0525U5W1D4.Entities.Topping;
import com.example.AS0525U5W1D4.repositories.PizzaRepository;
import com.example.AS0525U5W1D4.repositories.ToppingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaService {
    private PizzaRepository pizzaRepository;
    private ToppingRepository toppingRepository;

    @Autowired
    public PizzaService(PizzaRepository pizzaRepository, ToppingRepository toppingRepository) {
        this.pizzaRepository = pizzaRepository;
        this.toppingRepository = toppingRepository;
    }

    public void save(Pizza pizza) {

        List<Topping> toppings = pizza.getToppings();
        toppings.forEach(topping -> toppingRepository.getReferenceById(topping.getId()));
        pizzaRepository.save(pizza);
    }

}
