package com.example.AS0525U5W1D4.services;

import com.example.AS0525U5W1D4.Entities.Drink;
import com.example.AS0525U5W1D4.repositories.DrinkRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class DrinkService {
    //qui metodi e controlli custom
    private DrinkRepository drinkRepository;

    @Autowired
    public DrinkService(DrinkRepository drinkRepository) {
        this.drinkRepository = drinkRepository;
    }

    public void save(Drink drink) {
        //TODO: aggiungere controllo prima del save
        drinkRepository.save(drink);
    }

    public List<Drink> findByName(String name) {
        return drinkRepository.filterByName(name);
    }
}
