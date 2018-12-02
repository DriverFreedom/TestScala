package day02

/**
  * 使用scala集合及函数实现词频统计WordCount
  *
  */
object WordCount {
  def main(args: Array[String]): Unit = {
    //有一些数据，需要进行分析统计，词频统计，获取每个单词出现的次数，按照次数进行降序排序
    val line = Array("Hadoop hive spark zookeeper","hdfs storm hive hbase","pig scala hive","","","")
    //数据转换,切割
    val word = line.flatMap(line =>line.split(" ")).filterNot(word => word.isEmpty)
    //对每个单词赋值为 1
    var word2 = word.map(x => (x,1))



    //对key相同的数据进行分组
    val word3 = word2.groupBy(x => x._1)
    //统计相同key    value长度(即相同单词的个数)
    val word4 = word3.map(x => (x._1,x._2.map(_._2).sum))
    //输出数据
    //根据单词长度排序，并取前三个
    val word5 = word4.toList.sortBy(x => -x._2).take(3)
    println(word5.toBuffer)



  }
}
