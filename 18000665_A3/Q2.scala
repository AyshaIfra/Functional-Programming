object PrimeSequence extends App{
  def PrimeSeq(n:Int):Unit = {
    if(Prime(n)) println(n)
    if(n>0) PrimeSeq(n-1)
  }
  def Prime(p:Int,n:Int=2):Boolean = n match{
    case x if (p==1) => false
    case x if(x==p) => true
    case x if GCD(p,x)>1 => false
    case x => Prime(p,x+1)
  }
  def GCD(p:Int,x:Int):Int=x match{
    case 0 => p
    case x if x>p => GCD(x,p)
    case x => GCD(x,p%x)
  }
  val n=scala.io.StdIn.readInt();
  println(PrimeSeq(n));
}
