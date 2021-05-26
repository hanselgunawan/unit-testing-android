package com.hanseltritama.unittestingandroid.util

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `Empty Username returns False`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `Non-Empty Username returns True`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Hansel",
            "123",
            "123"
        )
        assertThat(result).isTrue()
        assertThat("hello").isEqualTo("hello")
    }

    @Test
    fun `Username already exists returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Peter",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `Empty password returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Peter",
            "",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `Incorrect repeated password returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Peter",
            "123",
            "234"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `Password with less than 2 digits returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Peter",
            "hahaha2",
            "hahaha2"
        )
        assertThat(result).isFalse()
    }
}