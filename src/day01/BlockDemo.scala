package day01

 object BlockDemo {
  def main(args: Array[String]): Unit = {
    //定义变量
    val x = 0
    //块表达式
    val result = {
      if (x == 0) 0
      else if (x> 1) 1
      else -1
    }
    //打印变量
    println(result)
  }
}
