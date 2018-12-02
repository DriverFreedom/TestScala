package day03

/**
  * scala没有静态修饰符，在object中创建的成员都是静态的。若有同名的class 是其伴生类
  * 下面是一个单例对象
  */
class CreditCard {

}
object  CreditCard {
  private[this] var creditCardNubmer:Long = 0
  def generateNewCCNumber():Long={
    creditCardNubmer += 1
    creditCardNubmer
  }

  def main(args: Array[String]): Unit = {
    println(generateNewCCNumber())
    println(generateNewCCNumber())
    println(generateNewCCNumber())
    println(generateNewCCNumber())
  }
}
