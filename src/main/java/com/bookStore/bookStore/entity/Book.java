package com.bookStore.bookStore.entity;

import jakarta.persistence.*;
import lombok.*;

/*
    @Data 가 포함하고 있는것
    @Getter @Setter
    @ToString
    @NoArgsConstructor -> 기본 생성자 ( 이거 써줘야할듯 )
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String author;
    private String price;
}
/*
@Data 쓰기 전 코드

public class Book {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String author;
    private String price;

    아래 생성자 대신에 @AllArgsConstructor  씀
    public Book(Long id, String name, String author, String price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
    }
    // 이 부분도 있어야 하는건지 추후 체크
    public Book() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
*/