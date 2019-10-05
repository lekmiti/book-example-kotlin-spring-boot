package com.lekmiti.kotlinspringboot

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController("/books")
class BookResource {


    @Autowired
    private lateinit var bookRepository: BookRepository

    @GetMapping
    fun getAllBooks(): MutableList<Book> {
        return  bookRepository.findAll().toMutableList()
    }
}
