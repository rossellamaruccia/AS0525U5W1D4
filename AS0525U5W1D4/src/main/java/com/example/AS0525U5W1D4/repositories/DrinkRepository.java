package com.example.AS0525U5W1D4.repositories;

import com.example.AS0525U5W1D4.Entities.Drink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DrinkRepository extends JpaRepository<Drink, Long> {

    //le queries vanno qui

    @Query("SELECT d FROM Drink d WHERE d.name = :name")
    List<Drink> filterByName(String name);
}