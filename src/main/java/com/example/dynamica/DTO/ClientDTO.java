package com.example.dynamica.DTO;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class ClientDTO {
    private Long id;

    private String fio;

    private LocalDate birthDate;
}
