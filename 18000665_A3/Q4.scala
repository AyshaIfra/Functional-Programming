object CheckEvenOrOdd extends App{

  def EvenOrOdd(n:Int):Boolean = if(n%2==0) true
                            else false

    val n=scala.io.StdIn.readInt();
    println("It is an even number : "+EvenOrOdd(n));
}
