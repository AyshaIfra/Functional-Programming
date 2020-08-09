object MyApp extends App{
val p1= Point(2,3)
val p2= Point(5,6)
val p3= p1.distance(p2)
println(p1)
println(p2)
println(p3)

}
import math.{ sqrt, pow }
case class Point(x:Double,y:Double){

def distance(other: Point): Double = sqrt(pow(x - other.x, 2) + pow(y - other.y, 2))
override def toString = "("+x+","+y+")"
}
