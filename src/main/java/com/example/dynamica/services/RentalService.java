package com.example.dynamica.services;

import com.example.dynamica.models.Book;
import com.example.dynamica.models.Client;
import com.example.dynamica.models.Rental;
import com.example.dynamica.repositories.BookRepository;
import com.example.dynamica.repositories.ClientRepository;
import com.example.dynamica.repositories.RentalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RentalService {
    private final RentalRepository rentalRepository;
    private final BookRepository bookRepository;
    private final ClientRepository clientRepository;

    public List<Rental> getAllRentals() {
        return rentalRepository.findAllWithDetails();
    }

    public Rental takeBook(Long clientId, Long bookId) {
        Client client = clientRepository.findById(clientId)
                .orElseThrow(() -> new RuntimeException("Client not found"));
        Book book = bookRepository.findById(bookId)
                .orElseThrow(() -> new RuntimeException("Book not found"));

        Rental rental = new Rental();
        rental.setClient(client);
        rental.setBook(book);
        rental.setRentalDate(LocalDateTime.now());

        return rentalRepository.save(rental);
    }

    public void returnBook(Long rentalId) {
        rentalRepository.deleteById(rentalId);
    }
}
