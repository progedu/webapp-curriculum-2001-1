import scala.annotation.tailrec

object Main {

  def fact(n: Int): Int = {
    @tailrec
    def go(n: Int, acc: Int): Int = n match {
      case 0 => acc
      case _ => go(n - 1, acc * n)
    }
    go(n, 1)
  }

}
