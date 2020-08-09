object MyApp extends App{
val p1= Point(2,3)
val p2=p1.inverse
println(p1)
println(p2)

}

case class Point(x:Int,y:Int){
def inverse() = Point(y, x)
override def toString = "("+x+","+y+")"
}
