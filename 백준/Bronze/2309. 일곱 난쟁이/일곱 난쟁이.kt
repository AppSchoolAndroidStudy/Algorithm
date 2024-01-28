import java.io.BufferedReader
import java.io.InputStreamReader

fun f2309() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val list = mutableListOf<Int>()

    repeat(9) { list.add(br.readLine().toInt()) }
    list.sort()
    val sum = list.sum()

    for(i in 0..7) {
        for(j in (i + 1)..8) {
            if(sum - (list[i] + list[j]) == 100) {
                list.removeAll{ it == list[i] || it == list[j] }
                list.forEach { println(it) }
                return
            }
        }
    }
}

fun main() {
    f2309()
}