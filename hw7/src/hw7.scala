// Zach Robin
// HW6
// Dr. Linnell
// CSCI 169
object hw7 {
  def main(args: Array[String]): Unit = {
    // PART 1
    println("PART1")
    def alternate(xs: List[Int], ys: List[Int]): List[Int] = {
      if(xs.isEmpty) Nil
      else xs.head::alternate(ys, xs.tail)
    }

    def l1[Int] = List(1,3,5)
    def l2[Int] = List(2,4,6)
    def out[Int]  = List()
    println(alternate(l1,l2))

    // PART 2
    println("PART2")
    def function2(xs: List[Int], ys: List[Int], f:(Int, Int)=> Int): List[Int] ={
      if(xs.isEmpty)Nil
      else if(ys.isEmpty)Nil
      else f(xs.head, ys.head)::function2(xs.tail, ys.tail, f)
    }

    def l3 = List(1,2,3,4)
    def l4 = List(5,6,7,8)
    println(function2(l3,l4, (x,y)=>x+y))
    println(function2(l3,l4, (x,y)=>x*x+y))

    // PART 3
    println("PART3")
    def function3(xs: List[Int], f:(Int)=>Boolean): List[Int] = {
      if(xs.isEmpty)Nil
      else if(f(xs.head)) xs.head::function3(xs.tail, f)
      else function3(xs.tail, f)
    }
    def l5 = List(1,2,3,4)
    println(function3(l5, x=>(x%2==0)))
    println(function3(l5, x=>(x>10)))

    // PART 4
    println("PART4")
    def function4(f:(Int)=>Boolean): List[Int] => List[Int] = {
      x=>
        if(x.isEmpty)Nil
        else if(f(x.head)) x.head::function4(f)
    }

    def l6 = List(1,2,3,4)
    println(function4(x=>(x%2==0)))
    println(function4(x=>(x>10)))
    println("End of Code.")
  }
}