object wholesalecost extends App{
  def bookprice(x:Int):Double=x*24.95;
  def discount(amount : Double) : Double =amount*.4;
  def shippingcost(x:Int) : Double = 3*x +(x-50)*.75;
  println((bookprice(60))-(discount(bookprice(60)))+(shippingcost(60)));
  }