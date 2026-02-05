package com.example.AS0525U5W1D4.services;

import com.example.AS0525U5W1D4.Entities.Topping;
import com.example.AS0525U5W1D4.repositories.ToppingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToppingService {
    private ToppingRepository toppingRepository;

    @Autowired
    public ToppingService(ToppingRepository toppingRepository) {
        this.toppingRepository = toppingRepository;
    }

    public void save(Topping topping) {
        toppingRepository.save(topping);
    }
}
