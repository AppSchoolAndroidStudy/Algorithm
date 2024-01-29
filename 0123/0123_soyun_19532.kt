import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val a = nextInt()
    val b = nextInt()
    val c = nextInt()
    val d = nextInt()
    val e = nextInt()
    val f = nextInt()

    for(x in -999 until 1000) {
        for(y in -999 until 1000) {
            if (a*x + b*y == c && d*x + e*y == f) {
                println("$x $y")
                break
            }
        }
    }
}
