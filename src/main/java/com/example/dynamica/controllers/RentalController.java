package com.example.dynamica.controllers;

import com.example.dynamica.models.Rental;
import com.example.dynamica.services.RentalService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rentals")
@RequiredArgsConstructor
public class RentalController {
    private final RentalService rentalService;

    @GetMapping
    public ResponseEntity<List<Rental>> getAllRentals() {
        return ResponseEntity.ok(rentalService.getAllRentals());
    }

    @PostMapping("/take")
    public ResponseEntity<Rental> takeBook(
            @RequestParam Long clientId,
            @RequestParam Long bookId) {

        Rental rental = rentalService.takeBook(clientId, bookId);
        return ResponseEntity.ok(rental);
    }

    @PostMapping("/return/{rentalId}")
    public ResponseEntity<Void> returnBook(@PathVariable Long rentalId) {
        rentalService.returnBook(rentalId);
        return ResponseEntity.ok().build();
    }
}
