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

fun f1476() {
    val (e, s, m) = readln().split(" ").map { it.toInt() }
    var year = 1

    while(true) {
        if((year - e) % 15 == 0 && (year - s) % 28 == 0 && (year - m) % 19 == 0) {
            print(year)
            break
        }
        year++
    }
}

fun main() {
    f2309()
    f1476()
}