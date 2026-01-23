package com.example.trainalgoritms

//1. Check if a Given String is Palindrome or not without finding the reverse of the string.
fun isPalindrome(s: String): Boolean {
    val str = s.lowercase()
    var left = 0
    var right = s.length-1
    while (left<right){
        while (left < right && !str[left].isLetterOrDigit()) {
            left++
        }
        while (left < right && !str[right].isLetterOrDigit()) {
            right--
        }

        if (str[left] != str[right]) {
            return false
        }

        left++
        right--
    }
    return true
}

//2. Count the number of occurrences of each char in the input string.
fun countChar(s: String): Map<Char, Int> {
    val charCountMap = HashMap<Char, Int>()
    for (ch in s) {
        charCountMap[ch] = charCountMap.getOrDefault(ch, 0) + 1
    }
    return charCountMap
}

//3. Find the most recurring char in the input string.
fun findMostRecurringChar(s: String): Char? {
    val charCountMap = HashMap<Char, Int>()
    var maxCount = 0
    var result: Char? = null
    for (ch in s) {
        val count = charCountMap.getOrDefault(ch, 0) + 1
        charCountMap[ch] = count
        if (count > maxCount) {
            maxCount = count
            result = ch
        }
    }
    return result
}

//4. Remove duplicate chars from the input string.
fun removeDuplicate(s: String): String {
    val uniqueSet = HashSet<Char>()
    val result = StringBuilder()
    for (ch in s) {
        if (uniqueSet.add(ch)) {
            result.append(ch)
        }
    }
    return result.toString()
}

//???
//5. Program to find longest common subsequence from list of strings.
fun longestCommonSubsequence(strList: List<String>){
    for (str in strList) {

    }
}

//6. Print all the duplicate chars in the input string.
fun printDuplicates(s: String) {
    val uniqueSet = HashSet<Char>()
    val printed = HashSet<Char>()

    for (ch in s) {
        if (!uniqueSet.add(ch) && printed.add(ch)) {
            println(ch)
        }
    }
}

//7. Find first non-repeating character in the string.
fun printFirstNonrepeating (s: String): Char?{
    val charCountHashMap = HashMap<Char,Int> ()
    for (ch in s){
        val quant = charCountHashMap.getOrDefault(ch, 0) + 1
        charCountHashMap[ch] = quant
    }

    for (ch in s) {
        if (charCountHashMap[ch] == 1){
            return ch
        }
    }
    return null
}

// 8. Remove characters from the first string which are present in the second string
fun removeCharactersFromFirstString(str1:String, str2: String) : String {
    val removeSet = str2.toSet()
    var newStr = StringBuilder()
    for (ch in str1) {
        if (ch !in removeSet) {
            newStr.append(ch)
        }
    }
    return newStr.toString()
}

//???
//9. Check if strings are rotations of each other or not
fun ifRotations(str1: String, str2: String) : Boolean {
    if ((str1+str1).contains(str2)){
        return true
    } else{
        return false
    }
}

//10 Print all permutations of a given string

//11 Reverse each word in a given string. E.g. input: Android is best output: diordnA si tseb
fun reverseEachWord(s: String): String {
    val result = StringBuilder()
    val words = s.split(" ")

    for ((index, word) in words.withIndex()) {
        val reversedWord = StringBuilder()
        var i = word.length - 1
        while (i >= 0) {
            reversedWord.append(word[i])
            i--
        }
        result.append(reversedWord)
        if (index != words.lastIndex) {
            result.append(" ")
        }
    }

    return result.toString()
}


//12 Find the word with the longest length in the given sentence.
fun findTheLongestWord(str: String) : Int{
    val arrayWord = str.split(" ")
    var max = Int.MIN_VALUE
    for (word in arrayWord){
        max = Math.max(word.length, max)
    }
    return max
}

// 14 Check whether two strings are anagram of each other.

