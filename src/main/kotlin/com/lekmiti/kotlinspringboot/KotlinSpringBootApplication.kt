package com.lekmiti.kotlinspringboot

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class KotlinSpringBootApplication {

	@Bean
	fun initBooks(bookRepository: BookRepository) = CommandLineRunner {
		var books: MutableList<Book> = arrayListOf(
						Book("Effective Java (2nd Edition)", "Joshua Bloch", 52.34f, 4, "1"),
						Book("Cloud Native Java", "Josh Long, Kenny Bastani", 41.90f, 4,"2"),
						Book("The Art of Doing Twice the Work in Half the Time", "Jeff Sutherland", 22.98f, 4,"3"))
		bookRepository.deleteAll()
		bookRepository.saveAll(books)
	}
}

fun main(args: Array<String>) {
	runApplication<KotlinSpringBootApplication>(*args)
}
