// Zach Robin
// HW6
// Dr. Linnell
// CSCI 169
object HW6 {
  // PART 1
  println("PART1")
  def add(x:Int, y:Int):Int = x+y

  def square(x:Int):Int=x*x

  def apply_combine(f:Int=>Int, x:Int, g:(Int, Int)=>Int):Int = {
    if(x==1)f(1) else g(f(x), apply_combine(f, x-1,g))
  }

  println(apply_combine(square, 4, add)) // Returns 30

  // PART 2
  println("PART 2")
  def apply_combine2(f:Int=>Int)(x:Int)(g:(Int, Int)=>Int):Int =
  {
    def retfun(x:Int):Int = {
      if(x==1) f(1)
      else g(f(x), retfun(x-1))
    }
    retfun(x)
  }

  println(apply_combine2(square)(4)(add))


  def main(args: Array[String]): Unit = {
    println("End of Code.")
  }
}
