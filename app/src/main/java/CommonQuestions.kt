//Most occurring and least occurring chars from given string
fun checkChars(str:String){
    val hm = mutableMapOf<Char, Int>()
    var max:Int = 0
    var min:Int = 1
    for ( i in 0 until str.length){
        var k = hm.getOrDefault(str[i],0) + 1
        hm.put(str[i],k)
        if (k>max){
            max = k
        }
        if (k<min){
            min = k
            println("$k")
        }
    }

    println ("most often ${hm.filterValues { it == max }.keys.firstOrNull()}")
    println ("most  ${hm.filterValues { it == min }.keys.firstOrNull()}")

}

//2) Find pairs of elements having a sum equal to the given target sum.
fun findSum(array: Array<Int>, sum:Int): Pair<Int?,Int?>{
    var hs = mutableSetOf<Int>()
    for (i in  0  until array.size){
        var targetSum = sum - array[i]
        if (hs.contains(targetSum)) {
            return (Pair(array[i],  sum - array[i]))
        } else {
            hs.add(array[i])
         }

    }
    return Pair(null, null)
}

fun validMountainArray(arr: Array<Int>): Boolean {
    var peakInd = -1
    if (arr.size<3) return false

    for(i in 1 until arr.size-1){

        if (arr[i]>arr[i-1]) {
            println("peak" + arr[i])
            println("peak" + arr[i-1])
            //check if peak
            if (arr[i]>arr[i+1]){
                peakInd = i
                break
            }else{
                return false
            }
        }
    }

    println(peakInd)
    if (peakInd==-1 || peakInd==0 || peakInd==arr.size-1){
        return false
    }
    for (i in peakInd until arr.size-1){
        if (arr[i]<arr[i+1]){
            return false
        }
    }



    return true

}

//7) Program to check if string is Palindrome string or not.
fun isPalindrome(s: String): Boolean {
    val lowercaseString = s.lowercase()
    var left = 0
    var right = s.length-1
    while (left<right){
        while (left<right && !lowercaseString[left].isLetterOrDigit()){
            left++
        }
        while (left<right && !s[right].isLetterOrDigit()){
            right--
        }
        println(left)
        println(right)
        if (left<right){
            if (lowercaseString[left]!=lowercaseString[right]) {
                println(lowercaseString[left])
                println(lowercaseString[right])
                return false
            }
        }
        left++
        right--


    }
    return true
}

fun main(){
    isPalindrome(".,")
}