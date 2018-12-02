package day01

object ForDemo {
  def main(args: Array[String]): Unit = {
    //生成1 to 10
    println("\n=============方式一================")
    for(item <- 1 to 10)   print(item+" ")
    println("\n+++++++++++++方式二+++++++++")
    for(item <- 1 until 10)  print(item+" ")
    println("\n+++++++++++方式三+++++++++++")
    for (item <- Range(1,10)) print(item+" ")
    println("\n+++++++++++输出取余3为0的值+++++++++++++")
    for (item <- 1 to 10){
      if(item%3==0){
        print(item+" ")
      }
    }
    println("\n++++++++++++遍历集合+++++++++++++++")
    var numList1 = List(1,2,3,4,45,56.5)
    for (a <- numList1)
      print(a +" ")
    println("========for循环里边有if========")
    var a = 0;
    val numList = List(1,2,3,4,5,6,7,8,9,10);

        // for 循环
        for( a <- numList
             if a != 3; if a < 8 ){
          println( "Value of a: " + a );
        }
    println("========for循环里边有if========")
      val relult = for (
        a <- numList
        if a!=3;if a < 8
      )yield a
    for (a <- relult)
      println(a)


    println("========for循环  反转========")
    for(a <- 1 to 10 reverse)
      println(a)

    println("========99乘法表========")
    for (i <- 1 to 9;j <- 1 to i){
      if(j == 1) println()
      print(i*j+" ")
    }

    for (i <- 1 to 9){
      for (j<-1 to i){
        if (j==1) println();
        print (j+"*"+i+"="+i*j +" ")
      }
    }




  }

}
