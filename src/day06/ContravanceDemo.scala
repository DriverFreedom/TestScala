package day06

/**
  *逆变的例子
  * 语法：-T
  */

class Animal{}


class Bird extends Animal
//麻雀
class Sparrow extends Bird

//吃东西的类
class EatSomething[-T](t:T){}


object ContravanceDemo {
  def main(args: Array[String]): Unit = {

    val bird = new EatSomething[Bird](new Bird)

    //创建一个麻雀吃东西的类
    val sparrow: EatSomething[Sparrow] = bird
  }

}
