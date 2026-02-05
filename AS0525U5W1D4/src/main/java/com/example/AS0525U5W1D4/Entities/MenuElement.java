package com.example.AS0525U5W1D4.Entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Getter
public abstract class MenuElement {
    protected int calories;
    protected double price;
    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private long id;

    public MenuElement() {
    }

    public MenuElement(int calories, double price) {
        this.calories = calories;
        this.price = price;
    }
}
