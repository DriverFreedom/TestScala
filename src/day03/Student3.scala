package day03

/**
  * 私有构造器
  * 私有构造器是针对于主构造器
  * 如果声明了私有构造器，只能被他的伴生对象访问
  */
class Student3 private(var name:String,var age:Int,var gender:String ) {


}

object Student3{
  def main(args: Array[String]): Unit = {

      var s = new Student3("",12,"男")
      println(s.gender)
  }
}

