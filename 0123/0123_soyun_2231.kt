fun main() {
    val input = readLine()!!.toLong()
    var answer: Long = 0
    for (i in 1..input) {
        val temp = i.toString().split("").filter { it != "" }.sumOf { it.toLong() }
        if ( i + temp == input) {
            answer = i
            break
        }
    }

    println(answer)
}
