package day04

class Tiger{
  //override def eat(): Unit = super.eat()

  /*override def color(): Unit = {
    println("白色的老虎")
  }*/


  //override val i: Int = 1000
  /*override def fly(): Unit = {
    super.fly
    println("我是大脑斧")
  }*/
}

object Tiger{
  def main(args: Array[String]): Unit = {


    val t = new Tiger with Flyable
    t.fly

    println(t.i)
    val m = new Tiger
   // m.eat()
   // m.color()
   /* m.fly

    println(m.i)*/



  }
}