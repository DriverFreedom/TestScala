package day04

/**
  * 实现一个单例模式，
  * 构造函数被我们定义为private的目的：防止直接调用该类来创建对象
  */
class StaticTest private{
  private def add_(x:Int,y:Int)={
    x+y
  }

}

/**
  * 这个就是单例模式的定义，和类同名，且不带参数
 */
object StaticTest{
  //在伴生类内部申明一个StaticTest类实例对象
  val static = new StaticTest
  def add(x:Int,y:Int):Int={
    static.add_(x,y)
  }
}


object StaticTest2{
  def main(args: Array[String]): Unit = {
    //调用，定义一个单例对象
    val static = StaticTest
    //调用add方法
    println(static.add(1,2))
  }
}