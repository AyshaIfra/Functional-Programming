object TakaHomeSalary extends App{

  def Wage(h:Int):Int=h*150;
  def OT(h:Int):Int=h*75;
  def Income(h1:Int,h2:Int):Int=Wage(h1)+OT(h2);
  def Tax(Income:Int)=Income*0.1;
  def TakeHome(h1:Int,h2:Int):Double=Income(h1,h2)-Tax(Income(h1,h2));
  val h1=scala.io.StdIn.readInt();
  val h2=scala.io.StdIn.readInt();
  println("TakaHomeSalary = Rs."+TakeHome(h1,h2));
}
