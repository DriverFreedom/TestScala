package day01

/**
  * scala实例，新手测试
  */
object HelloWorld {

  def main(args: Array[String]): Unit = {
    //申明一个常量
    val i = 1000
    //判断i的大小
    if(i==100){
      println("100")
    }else{
      println("i!=100")
    }
    //可以将条件表达式直接赋值给变量
    //不需要return 最后一行数据即返回值
    val r =
      if(i > 0){
        1
      }
      else{
        -1
      }
    println(r)

    /**
      * 混合类型的表达式
      */
    val s = if(i>1000) 1 else "error"
    //打印s的值i
    println(s)
    /**
    缺失else
     */
    val m = if(i > 2000) 1
    println(m)











  }


}
