package day04

/**
  * 多态的使用
  */

abstract  class Polymorphism {
  def demo(): Unit ={
    println("我是你们的祖宗")
  }
}


class son_1 extends Polymorphism{
  override def demo(): Unit = {
    println("我是大儿子")
  }
}

class grandson extends son_1{
  override def demo(): Unit = {
    println("我是大孙子")
  }
}

class son_2 extends Polymorphism{

}

object Test_2{
  def test(e:Polymorphism): Unit ={
    e.demo()
  }
  def main(args: Array[String]): Unit = {
    test(new son_1)
    test(new grandson)
    test(new son_2)
  }
}