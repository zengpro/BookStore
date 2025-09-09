package com.example.dynamica.DTO;

import lombok.Data;

import java.time.LocalDate;

@Data
public class RentalDTO {
    private String clientFIO;
    private LocalDate clientBirthDate;
    private String bookTitle;
    private String bookAuthor;
    private String bookISBN;
    private LocalDate rentalDate;
}
