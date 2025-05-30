package com.shoyeb.repo;

import com.shoyeb.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
    Book findByBookTitle(String bookTitle);
}
