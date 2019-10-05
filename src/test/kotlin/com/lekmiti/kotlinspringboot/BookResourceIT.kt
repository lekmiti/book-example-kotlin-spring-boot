package com.lekmiti.kotlinspringboot

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpStatus
import org.springframework.test.context.junit4.SpringRunner
import kotlin.collections.ArrayList
import org.junit.Assert.assertEquals as assertEquals1
import org.junit.Assert.assertNotNull as assertNotNull1


@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
internal class BookResourceIT {

    @Autowired
    private lateinit var testRestTemplate: TestRestTemplate

    @Test
    fun should_return_all_books() {

        // when
        val response = testRestTemplate.getForEntity("/books", ArrayList::class.java)

        // then
        assertNotNull1(response)
        assertEquals1(response.statusCode, HttpStatus.OK)
        assertEquals(response.body?.size, 3)
    }

}