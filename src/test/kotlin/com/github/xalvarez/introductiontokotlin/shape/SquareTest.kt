package com.github.xalvarez.introductiontokotlin.shape

import kotlin.test.Test
import kotlin.test.assertEquals

class SquareTest {

    @Test
    fun `should calculate area correctly`() {
        // Given
        val base = 2.0
        val square = Square(base)

        // When
        val area = square.getArea()

        // Then
        assertEquals(base * base, area)
    }

    @Test
    fun `should get base`() {
        // Given
        val base = 2.0
        val square = Square(base)

        // When
        val retrievedBase = square.base

        // Then
        assertEquals(retrievedBase, base)
    }

    @Test
    fun `should set beauty`() {
        // Given
        val base = 2.0
        val beauty = 2
        val square = Square(base)

        // When
        square.beauty = beauty

        // Then
        assertEquals(beauty, square.beauty)
    }
}