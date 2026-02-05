package com.example.AS0525U5W1D4.Entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;

import java.util.List;

@Entity
@Table
@DiscriminatorValue("Pizze")
@Getter
public class Pizza extends MenuElement {
    private String name;
    @ManyToMany
    private List<Topping> toppings;

    public Pizza(String name, List<Topping> toppings) {
        super(1050, 5);
        this.name = name;
        this.toppings = toppings;
        this.calories = setCalories(toppings);
        this.price = setPrice(toppings);
    }

    public int setCalories(List<Topping> toppings) {
        int tot = 1050;
        if (toppings != null) {
            for (int i = 0; i < toppings.size(); i++) {
                tot += toppings.get(i).getCalories();
            }
        }
        return tot;
    }

    public double setPrice(List<Topping> toppings) {
        double price = 5;
        if (toppings != null) {
            for (int i = 0; i < toppings.size(); i++) {
                price += toppings.get(i).getPrice();
            }
        }
        return price;
    }

    @Override
    public String toString() {
        return "Pizza {" + name + ", " + price + ", " + toppings + " }";
    }
}