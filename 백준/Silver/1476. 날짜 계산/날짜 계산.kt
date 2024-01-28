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
    f1476()
}