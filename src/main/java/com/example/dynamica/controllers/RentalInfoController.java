package com.example.dynamica.controllers;

import com.example.dynamica.DTO.RentalInfoDTO;
import com.example.dynamica.services.RentalService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class RentalInfoController {
    private final RentalService rentalService;

    @GetMapping("/rentals-info")
    public ResponseEntity<List<RentalInfoDTO>> getAllRentalsInfo() {
        List<RentalInfoDTO> rentalInfoList = rentalService.getAllRentals().stream()
                .map(rental -> {
                    RentalInfoDTO dto = new RentalInfoDTO();
                    dto.setFio(rental.getClient().getFio());
                    dto.setClientBirthDate(rental.getClient().getBirthDate());
                    dto.setBookTitle(rental.getBook().getTitle());
                    dto.setBookAuthor(rental.getBook().getAuthor());
                    dto.setBookIsbn(rental.getBook().getIsbn());
                    dto.setRentalDate(rental.getRentalDate());
                    return dto;
                })
                .collect(Collectors.toList());

        return ResponseEntity.ok(rentalInfoList);
    }
}
