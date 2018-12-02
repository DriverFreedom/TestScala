package day04.collection

/**
  * 有序列表List
 */
object ListDemo {

  def main(args: Array[String]): Unit = {
    //创建一个List
    val  list = List(1,2,3,4,5,6)
    println(list.length  +" "+list.size)

    //list的组成
    //list.head            list.tail（除了头部以外的其他元素）
    println(s"${list.head},tail:${list.tail}")

    val list2 = List(1)
    //只有一个元素的时候  tail 就是 空
    println(s"head:${list2.head},tail:${list2.tail}")


    //创建List的第二种方式
    //在scala中list的空list,可以使用Nil 进行标识
    val list3 =1:: Nil
    println("list3的长度"+list3.length)
    println("将集合中的元素转换成字符串")
    println(s"tail:${list.mkString("-")}")

    //如何使用Nil进行元素的构建
    val list4 = 3::2::1::Nil
    println(s"list4:${list4}")

    val list5 = List(5,4,3)::List(2,1)
    println(s"list5:${list5}")

    //可变集合
    println("#########可变集合############")
    //首先引入一个包，ListBufer相当于ArrayBuffer，可以动态的增加 修改
    import scala.collection.mutable.ListBuffer

    val lb = new ListBuffer[Int]







  }
}
