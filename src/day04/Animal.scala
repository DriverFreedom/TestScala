package day04

/**
  * 定义一个抽象类，用于继承
  */
abstract class Animal {

  val age:Int = 2
  val weight:Double = 35

  //抽象方法，没有具体的实现
  def color()

  //非抽象方法，有具体的实现
  def eat()={
    println("吃食物")
  }

  //使用final 表示不能重写   override
  final def action()={
    println("奔跑")
  }

}

//ctrl + O    重写父类方法
//ctrl+ i     实现父类抽象方法
class Monkey extends Animal{

  override val age: Int = 100


  //抽象方法，没有实现(重写父类抽象的方法，可以选择性使用override)
   def color(): Unit = {
    println("红的黄的白的蓝的青的绿的你的我的，都是我的")  //快捷键
  }

  //重写父类的方法        必须使用override
  override def eat(): Unit = {
    println("吃桃子")
  }

  //
}

object Monkey{

  def main(args: Array[String]): Unit = {
    val m = new Monkey

    println(m.age)
    println(m.weight)
    m.color()
    m.eat()
    m.action()
  }
}
