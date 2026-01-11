package com.example.trainalgoritms

import android.R

//1. Find the second largest number from the array.
fun findSecondLargest(array:Array<Int>) : Pair<Int, Int>{
    var max1= Integer.MIN_VALUE
    var max2= Integer.MIN_VALUE
        for (j in 0 until array.size){
            if (array[j]>=max1) {
                max2 = max1
                max1 = array[j]
            } else {
                if (array[j]>max2) max2 = array[j]
            }
        }
    return Pair(max1, max2)
}

//2.Find the second smallest number from the array.
fun findSecondSmallest(array: Array<Int>): Pair<Int, Int> {
    require(array.size >= 2)

    var min1 = Int.MAX_VALUE
    var min2 = Int.MAX_VALUE

    for (value in array) {
        if (value <= min1) {
            min2 = min1
            min1 = value
        } else if (value < min2) {
            min2 = value
        }
    }
    return Pair(min1, min2)
}

//3. Merge two arrays to form a third array e.g. First array: 10, 50, 20, 30, 70, 80, 40 Second array: 25, 75, 5, 25
// Merged array should be: 10, 25, 50, 75, 20, 5, 30, 25, 70, 80, 40
fun mergeTwoArrays(array1: Array<Int>, array2: Array<Int>): Array<Int> {
    val result = Array(array1.size + array2.size) { 0 }

    var i = 0
    var j = 0
    var k = 0

    while (i < array1.size && j < array2.size) {
        result[k++] = array1[i++]
        result[k++] = array2[j++]
    }

    while (i < array1.size) {
        result[k++] = array1[i++]
    }

     while (j < array2.size) {
        result[k++] = array2[j++]
    }

    return result
}

//4. Merge two sorted array to form third sorted array: e.g. First Array: 10, 28, 50, 75, 80, 95, 100
// Second array: 35, 60, 70, 78
// Expected Merged sorted array: 10, 28, 35, 50, 60, 70, 75, 78, 80, 95, 100
fun mergeSortedArrays(array1: Array<Int>, array2: Array<Int>): Array<Int> {
    val result = Array(array1.size + array2.size) { 0 }

    var i = 0
    var j = 0
    var k = 0

    while (i < array1.size && j < array2.size) {
        if (array1[i] <= array2[j]) {
            result[k++] = array1[i++]
        } else {
            result[k++] = array2[j++]
        }
    }

    while (i < array1.size) {
        result[k++] = array1[i++]
    }

    while (j < array2.size) {
        result[k++] = array2[j++]
    }

    return result
}

//5. Rotate array elements from left to right by n position.
fun rotateElements(array: Array<Int>, n: Int): Array<Int> {
    if (array.isEmpty()) return array

    val size = array.size
    val shift = n % size

    for (k in 0 until shift) {
        val temp = array[size - 1]

        for (i in size - 1 downTo 1) {
            array[i] = array[i - 1]
        }

        array[0] = temp
    }

    return array
}

//6. Rotate array elements from right to left by n position.
fun rotateElementsFromRight(array: Array<Int>, n: Int): Array<Int> {
    val shift = n % array.size
    for (i in 0 until shift){
        val temp = array[0]
        for (j in 0 until array.size-1){
            array[j] = array[j+1]
        }
        array[array.size-1] = temp
    }
    return array
}

//7. Find the first pair of array elements having sum equal to zero.
fun findFirstPairSumZero(array: Array<Int>): Pair<Int?, Int?>{
   val seen = HashSet<Int>()
   for (i in 0 until array.size){
       if (seen.contains(-array[i])){
           return Pair(-array[i], array[i])
       }
       seen.add(array[i])

   }
    return Pair(null, null)
}

//8. Find all the pairs of array elements having sum equal to given number.
fun allPairsWithSum(array: Array<Int>, sum: Int): Array<Pair<Int, Int>> {
    val pairs = HashSet<Pair<Int, Int>>()
    val seen = HashSet<Int>()

    for (num in array) {
        val neededSum = sum - num
        if (seen.contains(neededSum)) {
            val pair = Pair(minOf(num, neededSum), maxOf(num, neededSum))
            pairs.add(pair)
        }
        seen.add(num)
    }
    return pairs.toTypedArray()
}


//9. Find the maximum element in an array.
fun findMaxElement(array: Array<Int>): Int? {
    if (array.isEmpty()) return null
    var max = array[0]
    for (i in 1 until array.size) {
        if (array[i] > max) {
            max = array[i]
        }
    }
    return max
}

//10. Find the minimum element in an array.
fun findMinElement(array: Array<Int>): Int? {
    if (array.isEmpty()) return null
    var min = array[0]
    for (i in 1 until array.size) {
        if (array[i] < min) {
            min = array[i]
        }
    }
    return min
}

//11. Remove duplicates from an array
fun removeDuplicates(array: Array<Int>): Array<Int> {
    val seen = LinkedHashSet<Int>()

    for (i in 0 until array.size) {
        seen.add(array[i])
    }
    return seen.toTypedArray()
}

