package day04.collection

import scala.collection.mutable.ArrayBuffer

/**
  * scala中数组的使用
  */
object ArrayDemo {

  def main(args: Array[String]): Unit = {
    //创建一个数组
    val arr:Array[Int] = Array(1,2,3,4,5,6)
    //获取数组的元素
    //数组元素的下表从0开始，Java下标也从0 开始
    println(arr(0))
    println(arr.length)
    println(arr.size)
    //对数组中的某个元素赋值
    arr(2) = 100
    println(arr(2))
    //循环遍历数组
    arr.foreach(println)


    //数组定义的第二种方式
    val arr2 = new Array[Int](5)                        //初始化数组的值为0，int类型的默认初始值为0


    //Alt+Enter               Any是所有类的祖宗,抽象类
    val arr3: Array[Any] = Array(1,2,3,4,"hello")


    println("****************可变数组***********************")
    val  arrayBuffer = ArrayBuffer[Int]()
    //添加一个元素  使用   +=
    arrayBuffer += 1
    println(arrayBuffer)
    //添加一组数组或者一个List    使用++=
    arrayBuffer ++= List(10,2,234,34,4)

    //根据值删除 -=
    arrayBuffer -= 1
    arrayBuffer.append(96)
    arrayBuffer.remove(3)
    /**
      * 在实际中 通常将可变数组转化为不可变数组  调用array里面的函数方法
      */
    val array = arrayBuffer.toArray

    //调用mkString 方法 将数组中的元素组合成一个字符串 并且将各个元素之间使用指定的符号进行分割
    val  str = array.mkString("{",",","}")        //在字符串前后追加符号
    println(str)
  }
}
