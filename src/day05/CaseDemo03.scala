package day05

object CaseDemo03 extends App {
  val arr = Array(1,1,7,12)
  arr match {
    case Array(0,2,x,y) =>println(x+" "+y)
    case Array(1,1,7,0) =>println("0...")
    case Array(1,1,7,y) =>println("only 0 "+y)
    case _ =>println("something else")
  }

}
