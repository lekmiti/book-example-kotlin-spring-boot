package com.lekmiti.kotlinspringboot

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Book(
        private val title: String,
        private val author: String,
        private val price: Float,
        private val ranking: Short,
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private val id: Long = 0
)