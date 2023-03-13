package com.bookStore.bookStore.service;

import com.bookStore.bookStore.entity.Book;
import com.bookStore.bookStore.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public void save(Book b) {
        bookRepository.save(b);
    }

    public List<Book> getAllBook() {
        return bookRepository.findAll();
    }

    public Book getBookById(Long id) {
        return bookRepository.findById(id).get();
    }

    public void deleteById(Long id) {
        bookRepository.deleteById(id);
    }
}
