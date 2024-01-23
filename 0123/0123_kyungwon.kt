import java.util.*

fun b2231() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val l = n.toString().length
    var answer = 0

    for (i in n - (l * 9) until n) {
        var sum = 0
        for (digitChar in i.toString()) {
            if (digitChar.isDigit()) {
                sum += digitChar.toString().toInt()
            }
        }
        if (i + sum == n) {
            answer = i
            break
        }
    }

    println(answer)
}

fun b19532() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    val d = sc.nextInt()
    val e = sc.nextInt()
    val f = sc.nextInt()

    val x = (c * e - b * f) / (a * e - b * d)
    val y = (c * d - a * f) / (b * d - a * e)

    print("$x $y")
}