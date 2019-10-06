package com.lekmiti.kotlinspringboot

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document


@Document(collection = "book")
data class Book(
        private val title: String,
        private val author: String,
        private val price: Float,
        private val ranking: Short,
        @Id
        private val id: String = ""
)