package day03

/**
  * scala可以通过继承App 省略main方法
  */
object AppDemo extends App {
  //下面的就相当于写在main中
  println("hi girl")
  if (args.length>0)
    println(1)
  else
    println(0)

}
