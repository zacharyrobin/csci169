object part3 {
  println("PART 3")

  def findLast(xs:List[Int], x:Int):Int = {
    def fun(xs:List[Int], x:Int, i:Int):Int ={
      xs.head match{
        case Nil => if (i==0)  -1 else i
        case y::ys => if(y==x) fun(ys,x,i+1)
        else fun(ys,x,i)
    }
    }
    fun(xs,x,0)
  }

  println("End of Code")
}
