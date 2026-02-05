package com.example.AS0525U5W1D4.repositories;

import com.example.AS0525U5W1D4.Entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Long> {

//    @Query("SELECT p FROM Pizza p WHERE p.topping = :topping")
//    List<Pizza> filterByTopping(Topping topping);
}
