package com.example.trainalgoritms

class WQuestions {
//    1) Most occurring and least occurring chars from given string
fun mostAndLessOccurChar(str: String){
    val hm = HashMap<Char, Int>()
    for (ch in str){
        hm[ch] = hm.getOrDefault(ch,0)+1
    }
    var maxChar = str[0]
    var minChar = str[0]
    var maxCount = hm[maxChar]!!
    var minCount = hm[minChar]!!



}

//    2) Find pairs of elements having sum equal given target sum.

    //  3) Program to check if given array is mountain array or not. Available on LeeteCode

    //   4) Program to find x raise to y but with time complexity O ( log n)

    //  5) Program to group anagram strings.
    //  Input: ["act", "race", "listen", "silent", "hello", "cat", "tac" ]
    //   Output:[  [ act, cat, tac ], [ listen, silent ] ]

    //  6) Check if two strings are Anagram strings or not.

    // 7) Program to check if string is Palindrome string or not.

    // 8) Two array supposed to have same elements irrespective of sequence of elements. But second array has one missing element. Write a program to find missing element.

    //  a = [ 7, 2, 9, 1, 3]
    //  b = [ 3, 7, 1, 2 ]
    // Missing element = 9

    // 9) Check if given two dimensional array is valid Sudoku.

    //10) Program to find second largest and second smallest number.

    //11) Move all zeros to the end of array.

    // 12) Kotlin program for Given a list of non-negative integers nums, arrange them such that they form the largest number and return it.

    // Input: nums = [10,2]
    //Output: "210"

    //Input: nums = [3,30,34,5,9]

    // Output: "9534330"

//    fun largestNumber(nums: List<Int>): String {
//        // Convert each number to a string
//        val numsStr = nums.map { it.toString() }
//
//        // Sort the numbers with a custom comparator
//        val sortedNumsStr = numsStr.sortedWith(Comparator { a, b ->
//            (b + a).compareTo(a + b)
//        })
//
//        // Concatenate the sorted numbers
//        val result = sortedNumsStr.joinToString("")
//
//        // Handle the edge case where the result is multiple zeros
//        if (result[0] == '0') return "0"
//
//        return result
//    }

    //13) Progrom to check if given array is mountain array or not.

//    https://leetcode.com/problems/valid-mountain-array/description/
//
//    Idea is to count number of peaks. If number of peaks are exactly 1 then it's valid mountain array.

//    class Solution {
//        fun validMountainArray(ar: IntArray): Boolean {
//            if(ar.size < 3) return false
//            var count = 0
//
//            if(ar[0] > ar[1]) return false
//
//            if(ar[ar.size-1] > ar[ar.size-2]) return false
//
//            for(i in 0 until ar.size - 1) {
//                if( ar[i-1] < ar[i] && ar[i] > ar[i+1]) {
//                    count++
//                }
//                if(count > 1) return false
//            }
//
//            return true
//        }
//    }

//    14) Program to check well formedness of parenthesis of Mathematical expression. i.e. in Mathematical we brackets like (, {, [ and for every opening we should have closing one. And no closing bracket can appear before it's opening bracket.
}