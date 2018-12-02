package day06

/**
  * 隐式转换类
  */
object ImplicitClassDemo {

  //隐式类   用于计算
  implicit class Cala(x:Int){
    def add(y:Int)= x+y
  }
  def main(args: Array[String]): Unit = {
    //实现两个数字的想加

    /**
      * 调用过程
      *   1.调用1的add函数，但是没有发现add函数
      *   2.查找一个能否接受int类型的隐式类  ->implicit class Cala
      *   3.把1传给Cala对象   调用add函数
      *   4.完成计算
      */

    println("两个数字的和:"+1.add(2))
    println("和为："+Cala(7).add(10))
  }
}
