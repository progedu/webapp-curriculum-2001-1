import scala.annotation.tailrec

object Main {

  @tailrec
  def fact(n: Int, acc: Int): Int = if (n <= 1) acc else fact(n - 1, n * acc)
  //def fact(n: Int): Int = if (n <= 1) 1 else fact(n - 1) * n

}
