package com.example.dynamica.DTO;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class RentalDTO {
    private Long id;

    private Long clientId;

    private Long bookId;

    private LocalDateTime rentalDate;
}
