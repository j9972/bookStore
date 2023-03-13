## Endpoint

### 홈페이지로 이동

Get /

ex) http://localhost:1010/

### 새로운 도서 등록 페이지로 이동

Get /book_register

ex) http://localhost:1010/book_register

### 이용 가능 도서 페이지로 이동

Get /available_books

ex) http://localhost:1010/available_books

### 나수 도서 페이지로 이동

Get /my_books

ex) http://localhost:1010/my_books

### 이용 가능 도서 등록 

Post /save

ex) http://localhost:1010/save
-> redirect:/available_books 이동

### 나의 책 목록들 부분 - 도서 목록들 삭제

Request(get) /deleteByList/{id}

ex) http://localhost:1010/deleteMyList/{id}
-> "redirect:/my_books" 이동

### 나의 책 목록 부분 - 도서 목록 

Request(get) /mylist/{id}

ex) http://localhost:1010/mylist/{id}
-> "redirect:/my_books" 이동

### 나의 책 목록 부분 - 도서 수정

Request(post) /editBook/{id}

ex) http://localhost:1010//editBook/{id}
-> "bookEdit" 이동

### 나의 책 목록 부분 - 도서 목록 삭제

Request(get) /deleteBook/{id}

ex) http://localhost:1010/deleteBook/{id}
-> "redirect:/available_books" 이동