package com.bookStore.bookStore.controller;

import com.bookStore.bookStore.service.MyBookListService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class MyBookListControlloer {

    private final MyBookListService service;

    @RequestMapping("deleteMyList/{id}")
    public String deleteMyList(@PathVariable("id") Long id) {
        service.deleteById(id);
        return "redirect:/my_books";
    }
}
