package day05

import scala.reflect.ClassTag

object Demo {

  def myArray(eles:Int*)=Array[Int](eles:_*)

  def mkArray[T:ClassTag](elems:T*)=Array[T](elems:_*)
  def main(args: Array[String]): Unit = {
    println(myArray(1,2,3,4).toBuffer)
    println(mkArray[Int](1,2,3).mkString(" "))
    println(mkArray[String]("a","b","c").mkString(" "))
  }
}


object  test{
  def t[T:ClassTag](elems :T*)=Array[T](elems:_*)
  def main(args: Array[String]): Unit = {

    println(t(1,2,3,44).toBuffer)

  }
}