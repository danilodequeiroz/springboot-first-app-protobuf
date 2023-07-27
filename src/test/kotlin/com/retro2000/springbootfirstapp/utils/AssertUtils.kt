package com.retro2000.springbootfirstapp.utils

import org.hamcrest.CoreMatchers.containsString
import org.hamcrest.MatcherAssert.assertThat

object AssertUtils {
    fun assertResponse(response: String) {
        assertThat(response, containsString("1"))
        assertThat(response, containsString("Joao"))
    }
}