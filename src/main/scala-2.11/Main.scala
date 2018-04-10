import scala.annotation.tailrec

object Main {
  @tailrec
  def fact(n: Int, acc: Int = 1): Int = {
    if (n == 1) {
      acc
    } else {
      fact(n - 1, acc * n)
    }
  }
}
