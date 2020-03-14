import scala.annotation.tailrec

object Main {

    def factorial(n: Int): Int = {
        fact(n, 1)
    }

    @tailrec
    def fact(n: Int, acc: Int): Int = if (n <= 1) acc else fact(n - 1, acc * n)
}
