package com.example.AS0525U5W1D4.Entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table
@DiscriminatorValue("Toppings")
@Getter
@Setter
public class Topping extends MenuElement {
    private String name;

    @ManyToMany(mappedBy = "toppings")
    private List<Pizza> pizze;

    public Topping() {
        super();
    }

    public Topping(String name, int calories, double price) {
        super(calories, price);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Topping {" + name + ", " + calories + ", " + price + "}";
    }
}
