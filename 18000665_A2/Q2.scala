object BestTicketPrice extends App{

    def Attendees(p:Int):Int=120+(15-p)/5*20;
    def Revenue(p:Int)=Attendees(p)*p;
    def Cost(p:Int):Int=500+3*Attendees(p);
    def Profit(p:Int):Int=Revenue(p)- Cost(p);

    val p=scala.io.StdIn.readInt();
    println("Highest profit of Ticket price : Rs."+Profit(p));
}
