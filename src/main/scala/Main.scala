import scala.annotation.tailrec

object Main {
  @tailrec

  def fact(n:Int,m:Int):Int=

    if(n<=1)m else fact(n-1,n*m)

}
