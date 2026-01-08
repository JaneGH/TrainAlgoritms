package com.example.trainalgoritms

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class PalindromeTest {

    @Test
    fun palindromeWithSpacesAndCase() {
        assertTrue(isPalindrome("A man a plan a canal Panama"))
    }

    @Test
    fun notPalindrome() {
        assertFalse(isPalindrome("hello"))
    }

    @Test
    fun returnReverseEachWord(){
        assertTrue(reverseEachWord("Android is best").equals("diordnA si tseb"))
    }

}
