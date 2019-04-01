package com.github.xalvarez.introductiontokotlin.polygon

import kotlin.test.Test
import kotlin.test.assertEquals

class SquareServiceTest {

    private val squareService = SquareService()

    @Test
    fun `should calculate area with non nullable base`() {
        // Given
        val square = Square(base = 3.0)

        // When
        val area = squareService.getAreaWithNonNullableSquare(square)

        // Then
        assertEquals(square.base * square.base, area)
    }

    @Test
    fun `should calculate area with nullable base`() {
        // Given
        val square: Square? = Square(base = 3.0)

        // When
        val area = squareService.getAreaWithNullableSquare(square)

        // Then
        assertEquals(square!!.base * square.base, area)
    }

    @Test
    fun `should describe squares`() {
        // Given
        val square = Square(base = 3.0)
        val anotherSquare = Square(base = 4.0)

        // When / Then
        squareService.describe(square, anotherSquare)
    }

}