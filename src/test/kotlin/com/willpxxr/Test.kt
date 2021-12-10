package com.willpxxr

import io.mockk.every
import io.mockk.mockkStatic
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Test {
    private val testFoo = "bar"


    @Test
    fun `test 1`() {
        mockkStatic(::staticFoo)

        every { staticFoo() } returns testFoo

        assertEquals(
            testFoo,
            staticFoo()
        )
    }

    @Test
    fun `test 2`() {
        mockkStatic(::staticFoo)

        every { staticFoo() } returns testFoo

        assertEquals(
            testFoo,
            staticFoo()
        )
    }
}