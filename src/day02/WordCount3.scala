package day02

object WordCount3 {
  def main(args: Array[String]): Unit = {
    val lines = List("hadoop,hive,spark,hbase","","scala,pig,hadoop,hive,hbase","","hbase,yarn,hadoop,spark")
    lines.flatMap(line => line.split(","))
      .map(_.trim).filterNot(_.isEmpty)
      .map(word => (word,1)).groupBy(word => word._1)
      .map(tuple => (tuple._1,tuple._2.map((_._2)).sum)).toList
      .sortBy(tuple => -tuple._2)
      .take(3)
      .foreach(println)
  }
}
