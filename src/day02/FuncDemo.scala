package day02


object FuncDemo {
  def main(args: Array[String]): Unit = {
    var arr = Array(1,2,3,4,5,6,7)
    println("#############基础写法(取2的余数)###############")
    var arr2 = for (i<-arr if i%2==0)yield i
    println(arr2.toBuffer)
    println("##############函数式写法#######################")
    val f1 = (x:Int)=>x%2==0
    val arr3 = arr.filter(f1)
    println(arr3.toBuffer)
    println("##############匿名的函数式写法###################")
    val arr4 = arr.filter((x:Int)=>x%2==0)
    println(arr4.toBuffer)
    println("##############更简单的函数式写法###################")
    val arr5 = arr.filter(_%2==0)
    println(arr5.toBuffer)
    val map = Map("a"->1,"b"->2)
    var dim = Array.ofDim[Int](3,3)
    dim(0)(0) = 0
    for(i <- 0 to 2
      ;j<- 0 to 2){
      dim(i)(j) = i+j
    }
    for(i <- 0 to 2;j<- 0 to 2){
      println(dim(i)(j) )
    }
    println("++++++++++++++++++++")
   println(dim(0).length)
  }
}
