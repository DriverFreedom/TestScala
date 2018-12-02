package day06



object ImpliciParm {
  /**
    * implicit表示隐式的，  隐式变量
    * 用implicit修饰的方法较隐式方法
    *步骤解析
    *    1方法在执行时，发现需要一个隐式的int（implicit i:Int）类型参数，就会在方法执行的环境中找
    *    2方法中依赖的隐式变量类型一致的参数如果有就使用参数
    *    3如果没有的话 就使用默认值
    *    4如果默认值都没有，就报错
    *
    *    优先级：  传入 > 上下文类型的隐式值 > 默认值
   */


    //如果有多个隐式变量会报错
  //implicit val  xx = 640
  implicit val yy = 666

  def test(implicit i:Int=100)={
    println(i)
  }
  def main(args: Array[String]): Unit = {
    test
  }
}
FH