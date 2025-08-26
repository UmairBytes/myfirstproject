package com.mycompany.myfirstproject.repository;

import com.mycompany.myfirstproject.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    // You can add custom queries here later if needed
}
