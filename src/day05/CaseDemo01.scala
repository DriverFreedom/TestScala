package day05

import scala.util.Random

object CaseDemo01 extends App{
  val arr = Array("tom","mike","hello")
  val i = Random.nextInt(arr.length)
  println(i)
  val name = arr(i)
  println(name)


  //模式匹配
  name match {
    case "tom" => println("i am tom")
    case "mike" =>{println("hi i am mike ")}
    case _ => println("我是来自火星的男人")

  }

}
