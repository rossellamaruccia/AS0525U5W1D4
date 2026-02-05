package com.example.AS0525U5W1D4.repositories;

import com.example.AS0525U5W1D4.Entities.Topping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToppingRepository extends JpaRepository<Topping, Long> {

}
