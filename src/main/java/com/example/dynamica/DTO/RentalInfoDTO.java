package com.example.dynamica.DTO;

import lombok.Data;


import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class RentalInfoDTO {
    private String fio;
    private LocalDate clientBirthDate;
    private String bookTitle;
    private String bookAuthor;
    private String bookIsbn;
    private LocalDateTime rentalDate;

    public RentalInfoDTO(){

    }

    public RentalInfoDTO(String fio, LocalDate clientBirthDate,
                      String bookTitle, String bookAuthor,
                      String bookIsbn, LocalDateTime rentalDate) {
        this.fio = fio;
        this.clientBirthDate = clientBirthDate;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookIsbn = bookIsbn;
        this.rentalDate = rentalDate;
    }
}
