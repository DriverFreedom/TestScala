package day03

/**
  * 主构造器和辅助构造器两个一起合成java的构造器重载功能
  */
/**
  * 主构造器 只能有一个主构造器 可以定义参数以及默认参数。
  * 如果没有var或val定义,则该参数的范围是private[this]
  *
  * @param name
  * @param age
  * @param gender
  */
class Srudent2(var name:String,var age:Int,var gender:String="man") {
  println("我是主构造器")
  /**
    * 辅助构造器，通过使用关键字this来调用主构造器
    * 可以有多个辅助构造器
    * 多个辅助构造器之间可以调用
    * 辅助构造器中的参数不可以加var和val
    *
    * @param name
    */
  def this(name:String){

    this(name,6)//第一行代码必须调用主构造器
    println("我是辅助构造器")
  }
}
object Srudent2{
  def main(args: Array[String]): Unit = {
    //var s1 = new Srudent2("张飞",90)
    //通过副构造器来创建对象
    var s2 = new Srudent2("赵云")
    //println(s1.name+" "+s1.age+" "+s1.gender)
    println(s2.name+" "+s2.age)
  }
}