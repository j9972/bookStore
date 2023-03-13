package com.bookStore.bookStore.service;

import com.bookStore.bookStore.entity.MyBookList;
import com.bookStore.bookStore.repository.MyBookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MyBookListService {

    private final MyBookRepository myBookRepository;

    public void saveMyBooks(MyBookList book) {
        myBookRepository.save(book);
    }

    public List<MyBookList> getAllMyBooks() {
        return myBookRepository.findAll();
    }


    public void deleteById(Long id) {
        myBookRepository.deleteById(id);
    }
}
