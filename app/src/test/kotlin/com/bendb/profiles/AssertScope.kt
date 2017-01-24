package com.bendb.profiles

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.CoreMatchers.not
import org.junit.Assert.assertThat

inline fun <T> assertAbout(actual: T, assertions: AssertScope<T>.() -> Unit) {
    AssertScope(actual).assertions()
}

class AssertScope<T>(val actual: T) {
    infix fun shouldEqual(expected: T) {
        assertThat(actual, equalTo(expected))
    }

    infix fun shouldNotEqual(expected: T) {
        assertThat(actual, not(equalTo(expected)))
    }
}