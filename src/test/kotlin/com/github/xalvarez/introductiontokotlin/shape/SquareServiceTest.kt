package com.github.xalvarez.introductiontokotlin.shape

import kotlin.test.Test
import kotlin.test.assertEquals

class SquareServiceTest {

    @Test
    fun `should calculate area with non nullable base`() {
        // Given
        val square = Square(base = 3.0)
        val squareService = SquareService()

        // When
        val area = squareService.getAreaWithNonNullableSquare(square)

        // Then
        assertEquals(square.base * square.base, area)
    }

    @Test
    fun `should calculate area with nullable base`() {
        // Given
        val square: Square? = Square(base = 3.0)
        val squareService = SquareService()

        // When
        val area = squareService.getAreaWithNullableSquare(square)

        // Then
        assertEquals(square!!.base * square.base, area)
    }

}