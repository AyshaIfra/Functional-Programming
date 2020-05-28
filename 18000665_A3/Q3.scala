object SumOfGivenNumbers extends App{

  def sum(n:Int):Int= if(n==1) 1 else n+sum(n-1)

     val n=scala.io.StdIn.readInt();
     println(sum(n));
}
