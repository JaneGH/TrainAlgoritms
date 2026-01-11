package com.example.trainalgoritms

//Bubble
fun bubbleSort(array: Array<Int>): Array<Int>{
    for (i in 0 until array.size-1) {
        for (j in 0 until array.size-i-1) {
            if (array[j]>array[j+1]){
                val temp = array [j]
                array[j] = array[j+1]
                array[j+1] = temp
            }
        }
    }
    return array
}

//Selection
fun selectionSort(array: Array<Int>): Array<Int> {
    val n = array.size
    for (i in 0..n-1){
        var minInd = i
        for (j in i+1..<n){
            if (array[j]<array[minInd]){
                minInd = j
            }
        }
        if (minInd!=i) {
            val temp = array[i]
            array[i] = array[minInd]
            array[minInd] = temp
        }
    }
    return array
}

//Merging
fun mergingSort(array:Array<Int>):Array<Int>{
    if (array.size <= 1) return array

    val mid = array.size / 2
    val leftPart = array.sliceArray(0 until mid)
    val rightPart = array.sliceArray(mid until array.size)

    return mergeArrays(mergingSort(leftPart), mergingSort(rightPart))
}

fun mergeArrays(left:Array<Int>, right:Array<Int>): Array<Int>{
   var k = 0
   var i = 0
   var j = 0

   val newArr = Array(left.size + right.size){0}


    while (i < left.size && j < right.size) {
      if (left[i] < right[j]) {
          newArr[k] = left[i]
          i++
      } else {
          newArr[k] = right[j]
          j++
      }
      k++
  }

  while (i<left.size){
      newArr[k] = left[i]
      i++
      k++
  }

    while (j<right.size){
        newArr[k] = right[j]
        j++
        k++
    }
    return newArr

}

//Binary search
fun binarySearch(array: Array<Int>, target:Int):Int?{
    var left =0
    var right = array.size-1
    array.sort()

    while (left<=right) {
        val mid = (left+right)/2
        if(array[mid] == target) {
            return mid
        }else if (array[mid]>target){
            right = mid - 1
        } else {
            left = mid + 1
        }
    }
 return null
}

