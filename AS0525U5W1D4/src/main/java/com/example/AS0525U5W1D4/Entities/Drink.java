package com.example.AS0525U5W1D4.Entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@DiscriminatorValue("Bevande")
@Getter
@Setter
public class Drink extends MenuElement {
    private String name;

    public Drink(String name, int calories, double price) {
        super(calories, price);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Drink {" + name + ", " + calories + ", " + price + "}";
    }
}