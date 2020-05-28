object SumOfEvenNumbers extends App{
  def sumofeven(n:Int):Int=n match {
    case n if(n==0)=>0
    case n if(n%2==0) =>(n-2)+sumofeven(n-2)
    case _ =>(n-1)+sumofeven(n-1)
  }

   var number:Int=scala.io.StdIn.readInt();
   println("The sum of even numbers  = " + sumofeven(number));

}
