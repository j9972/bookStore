package com.bookStore.bookStore.controller;

import com.bookStore.bookStore.entity.Book;
import com.bookStore.bookStore.entity.MyBookList;
import com.bookStore.bookStore.service.BookService;
import com.bookStore.bookStore.service.MyBookListService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    private final MyBookListService myBookListService;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/book_register")
    public String bookRegister() {
        return "bookRegister";
    }

    @GetMapping("/available_books")
    public ModelAndView getAllBook() {
        List<Book> list = bookService.getAllBook();
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("bookList");
//        mv.addObject("book", list);
        return new ModelAndView("bookList", "book",list);
    }

    @PostMapping("/save")
    public String addBook(@ModelAttribute Book b) {
        bookService.save(b);
        return "redirect:/available_books";
    }

    @GetMapping("/my_books")
    public String getMyBooks(Model model) {
        List<MyBookList> list = myBookListService.getAllMyBooks();
        model.addAttribute("book", list);
        return "myBooks";
    }

    @RequestMapping("/mylist/{id}")
    public String getMyList(@PathVariable("id") Long id) {
        Book b = bookService.getBookById(id);
        MyBookList mb = new MyBookList(b.getId(),b.getName(),b.getAuthor(),b.getPrice());
        myBookListService.saveMyBooks(mb);
        return "redirect:/my_books";
    }

//    @PostMapping("/mylist")
//    public String getMylist(@RequestBody Long id) {
//        Book b = bookService.getBookById(id);
//        MyBookList mb = new MyBookList(b.getId(),b.getName(),b.getAuthor(),b.getPrice());
//        myBookListService.saveMyBooks(mb);
//        return "redirect:/my_books";
//    }


    @RequestMapping("/editBook/{id}")
    public String editBook(@PathVariable("id") Long id, Model model) {
        Book b = bookService.getBookById(id);
        model.addAttribute("book", b);
        return "bookEdit";
    }

    @RequestMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable("id") Long id) {
        bookService.deleteById(id);
        return "redirect:/available_books";
    }

}
