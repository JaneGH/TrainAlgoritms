package com.example.trainalgoritms

object InterviewTasks {

    fun findIndexWhereLeftRightSumEq(array: Array<Int>): Int {
        var totalSum = 0
        for (el in array) {
            totalSum += el
        }

        var leftSum = 0

        for (i in 0 until array.size) {
            val rightSum = totalSum - leftSum - array[i]

            if (rightSum == leftSum) return i

            leftSum += array[i]
        }

        return -1
    }

}


