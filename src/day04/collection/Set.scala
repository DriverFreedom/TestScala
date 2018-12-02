package day04.collection

object SetDemo {

  def main(args: Array[String]): Unit = {
    //会把重复的过滤掉,保留一份
    //数据是无序的
    val set = Set(1,2,3,4,5,4,3,2,1)
    println(set.mkString(","))
    println(set)


  }
}
