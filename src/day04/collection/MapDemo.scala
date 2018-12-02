package day04.collection

object MapDemo {

  def main(args: Array[String]): Unit = {
    val map = Map("hadoop"->1,"hive"->2)
    println(map.mkString(";"))

    /**
      * Map中元素类型都是二元祖
      */
    val map2 = Map(("hadoop",1),("spark",2))

    /**
      * 如何获取元素的值
      */
    //方式一
    println(s"Hadoop:${map2("hadoop")}")
    println(s"Spark:${map2("spark")}")
    //方式二
    println(s"spark:${map2.get("spark").get}")

    println("+++++++++方式三++++++++")
    println(s"Hadoop:${map2.getOrElse("Hive",0)}")

    println("----------遍历一 ----------------")
    for((key,value)<- map2){
      println(s"key:${key},value:${value }")
    }

    println("********遍历二*******")
    map2.foreach(tuple => println(s"key:${tuple._1},value:${tuple._2}"))
    println("********遍历三*******")
    for((_,value)<-map2){
      println(s"value:${value}")
    }
  }
}
