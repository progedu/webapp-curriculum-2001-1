import scala.annotation.tailrec

object Main {
  @tailrec
  def fact(n: Int, acc: Int): Int = if (n <= 1) 1 else fact(n - 1, acc * n)

  def toggle(switch: Switch): Switch = {
    if (switch.isOn) Switch(false) else Switch(true)
  }

  def twice(f: Int => Int): Int => Int = { x =>
    f(f(x))
  }
}

case class Switch(isOn: Boolean)
