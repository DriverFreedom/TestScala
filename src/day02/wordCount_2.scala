package day02

/**
  * 使用scala进行词频统计
  */
object wordCount_2 {
  def main(args: Array[String]): Unit = {
    //获取每个单词出现的次数，并且按照次数进行降序排序，取前3个数据
    //准备数据
    val lines = List("hadoop,hive,spark,hbase","","scala,pig,hadoop,hive,hbase","","hbase,yarn,hadoop,spark")

    /**
      * 下面采用类似MapReduce中马屁处理的数据及输出
      */

    val mapTuple = lines
    //对每一行进行切割
      .flatMap(line => line.trim().split(","))
    //转换，去掉单词空格
      .map(word => word.trim())
    //数据过滤
      .filterNot(word => word.isEmpty)
    //将单词转换成二元祖
      .map(word => (word.trim,1))
    println(mapTuple.toBuffer)

    /**
      * 更简单的方法解决上边的问题
      */
    val mapTuple2 = lines .flatMap(line => {
      line.trim().split(",").map(_.trim).filterNot(_.isEmpty).map((_,1))
    })
    //3:数据分组
    val groupTuple = mapTuple2.groupBy(tuple => tuple._1)
    println(s"grouped:${groupTuple.toBuffer}")

    /**
      * 分组以后 对每个数据的value值进行统计
      * 相当于reduce
      */
    val result = groupTuple.map(tuple =>{
      val word = tuple._1
      val count = tuple._2.map(_._2).sum
      (word,count)
    })

    /**
      * 对数据进行倒序，并输出前三个
      */
    val result2 = result.toList.sortBy(x => -x._2).take(3)
    println(result2.toBuffer)
  }
}
