object MyApp extends App{
val p1= Point(2,3)
val p2= Point(5,6)
println(p1)
println(p2)
println(p1+p2)

}
case class Point(a:Int,b:Int){
  def x:Int=a
  def y:Int=b

 def +(that:Point)= Point(this.x+that.x,this.y+that.y)
 override def toString = "("+x+","+y+")"
}
