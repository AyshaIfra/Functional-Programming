object PrimeNumbers extends App{

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

  val p=scala.io.StdIn.readInt();
  println(Prime(p));
}
