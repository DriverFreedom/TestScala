package day05

object CaseDemo04 extends App {

  val tup = List(1,2)
  tup match {
    case 1:: Nil => println(s"helo")
    case 1::x::Nil =>println("我喜欢你")
  }
}
