package day05

import scala.util.Random

object CaseDemo02 extends App {

    val arr: Array[Any] =Array("hello123",1,-2.0,2.0,CaseDemo02,2L,'a')
    //取出一个元素
    var i = Random.nextInt(arr.length)
    val elem  = arr(i)
    println(elem)


    //这里的=>不是函数，在这里表示模式匹配，如果匹配上则执行这里的业务逻辑
    elem match{
      case x:Int => println("Int:"+x)
      case y:Double=>println("Double:"+y)
      case z:String=>println("String:"+z)
      case w:Long=>println("Long:"+w)
      case CaseDemo02 =>{
        val c = CaseDemo02
        println(c)
        println("case demo 2")
      }
      case _ =>println("there are nothing")
    }
}
