
fun main(){
//    println(isMountainArray(arrayOf(1,2,3,2,1)))
//    println(isMountainArray(arrayOf(1,1,3,2,1)))
    println(groupAnagrams(arrayOf("eat","tea","tan","ate","nat","bat")))
}

fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val hm = HashMap<String, MutableList<String>>()
    for (s in strs) {
        val arr = IntArray(26)
        val key = s.toCharArray().sorted().toString()
        val  anagramList = hm.getOrDefault(key,mutableListOf())
        anagramList.add(s)
        hm.put(key,anagramList)
    }

    return hm.values.toList()

}

fun isMountainArray(arr: Array<Int>): Boolean {
    val arrSize = arr.size
    if (arrSize<3) return false

    var i = 0
    while ((arr[i]<arr[i+1]) && (i<arr.size-1)){
        i++
    }
    if ((i==0) || (i==arr.size)){
        return  false
    }

    while ((i+1<arrSize) && (arr[i]>arr[i+1])){
        i++
    }

    if (i==arrSize-1) return true else return false
}

