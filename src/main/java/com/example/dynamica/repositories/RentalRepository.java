package com.example.dynamica.repositories;

import com.example.dynamica.models.Rental;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RentalRepository extends JpaRepository<Rental, Long> {
    @Query("SELECT r FROM Rental r JOIN FETCH r.client JOIN FETCH r.book")
    List<Rental> findAllWithDetails();
}
