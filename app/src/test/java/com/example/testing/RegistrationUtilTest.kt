package com.example.testing



import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `empty username returns false`() {
        val result=RegistrationUtil.validregistration(
            "",
            "123pranish",
            "123pranish"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empty password returns false`() {
        val result=RegistrationUtil.validregistration(
            "Pranish",
            "",
            ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `different password returns false`() {
        val result=RegistrationUtil.validregistration(
            "Pranish",
            "123pranish",
            "xyzpranish"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password less than two digit returns false`() {
        val result=RegistrationUtil.validregistration(
            "",
            "1pranish",
            "1pranish"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeated password returns true`() {
        val result=RegistrationUtil.validregistration(
            "Amrit",
            "123pranish",
            "123pranish"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `username already exixts returns false`() {
        val result=RegistrationUtil.validregistration(
            "",
            "123pranish",
            "123pranish"
        )
        assertThat(result).isFalse()
    }
}