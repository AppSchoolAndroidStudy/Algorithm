fun main() {
    solveProblem2231()
    solveProblem19532()
    solveProblem1018()
}

fun problem2231() {
    val n = readln().toInt()

    (1..n).forEach { num ->
        var sum = num
        var tmp = num
        while (tmp > 0) {
            sum += tmp % 10
            tmp /= 10
        }
        if (sum == n) {
            println(num)
            return
        }
    }
    println(0)
}

fun problem19532() {
    val numbers = readln().split(" ").map { it.toInt() }
    val a = numbers[0]
    val b = numbers[1]
    val c = numbers[2]
    val d = numbers[3]
    val e = numbers[4]
    val f = numbers[5]
    (-999 until 1000).forEach { i ->
        (-999 until 1000).forEach { j ->
            if (a * i + b * j ==  c && d * i + e * j == f) {
                println("$i $j")
                return
            }
        }
    }
}

fun problem1018() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val board = List(n) { readln().split("").subList(1, m + 1) }
    var result = Int.MAX_VALUE
    (0 until n - 7).forEach { i ->
        (0 until m - 7).forEach { j ->
            var whiteCount = 0
            var blackCount = 0
            (i until i + 8).forEach { k ->
                (j until j + 8).forEach { l ->
                    if (board[k][l] == if ((k + l) % 2 == 0) "W" else "B") {
                        whiteCount++
                    } else {
                        blackCount++
                    }
                }
            }
            result = minOf(result, whiteCount, blackCount)
        }
    }
    println(result)
}
