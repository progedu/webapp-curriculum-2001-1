import scala.annotation.tailrec

object Main {

  def fact(n: Int): Int = {
    @tailrec
    def factInner(n: Int, acc: Int): Int = {
      if (n <= 1) acc * 1 else factInner(n - 1, acc * n)
    }

    factInner(n, 1)
  }

}
