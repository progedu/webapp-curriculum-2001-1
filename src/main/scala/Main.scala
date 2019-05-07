import scala.annotation.tailrec
object Main {
  
  def fact(n: Int): Int = {
    @tailrec
    def loop(n: Int, acc: Int): Int = n match {
      case _ if n <= 1 => acc
      case _ => loop(n - 1, n * acc)
    }
    loop(n, 1)
  }
}
