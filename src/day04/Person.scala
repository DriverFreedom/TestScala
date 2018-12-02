package day04

class Person {

  var name:String = _           //赋默认值
  var age :Int = _
}

/**
  * 伴生对象中的apply进行特殊处理。不需要使用new 即可创建对象
  */
object  Person {
  def apply(name :String): Person = {
    val person = new Person
    person.name = name
    person
  }

  def apply(name :String ,age:Int): Person = {
   val p =  new Person()
    p.name = name
    p.age = age
    p
  }
}

object PersonTest{
  def main(args: Array[String]): Unit = {
    val person = new Person
    person.name = "jack"
    println(s"实例方法创建对象：${person.name},${person.age}")

    val person2 = Person("tom")
    println(s"apply_1:${person2.name},${person2.age}")

    val person3 = Person("lisa",18)
    println(s"apply_2:${person3.name},${person3.age}")
  }
}
