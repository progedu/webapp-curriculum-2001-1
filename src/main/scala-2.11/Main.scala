import scala.annotation.tailrec

object Main {

  @tailrec
  def series(n:Int,acc:Int):Int ={
    if(n == 0){
      acc
    }else {
      series(n - 1,acc + n)
    }
  }

  @tailrec
  def fact(n:Int,acc:Int): Int = {
    if(n <= 1){
      acc
    }else{
      fact(n - 1,acc * n)
    }
  }
}

