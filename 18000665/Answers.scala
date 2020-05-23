object Assignment1_Answers extends App{
  def convert(c:Double)=c*1.8000+32.00;
  println("Fahrenheit : "+convert(35));

  def volume(r:Double)=4.0/3.0*math.Pi*r*r*r ;
  println("Volume of sphere : "+volume(5));

  def bookprice(n:Int):Double=n*24.95;
  def discount(amount : Double) : Double =amount*.4;
  def shippingcost(n:Int) : Double = 3*n +(n-50)*.75;
  println("wholesale cost : " +((bookprice(60))-(discount(bookprice(60)))+(shippingcost(60))));
  }
