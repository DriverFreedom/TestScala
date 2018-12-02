


/**
  * 协变的例子
  * 语法：+T
  */

class Animal{}

class Bird extends  Animal{}
/**
  * 动作：吃东西的类
  */
class EatSomething[+T](t:T){}

object CovarianceDemo {

  def main(args: Array[String]): Unit = {
    //创建小鸟吃东西的类
    val  bird = new EatSomething[Bird](new Bird)



    /**
      *  //创建动物吃东西的类
      * 问题：能否将bird赋值给animal    原因是什么?
      * 尽管Bird是Animal的子类，但是EatSomething[Bird]不是EatSomething[Animal]的子类，两者之间并没有继承的关系
      * 解决：使用协变，class EatSomething[+T](t:T)，可以认为EatSomething[Bird]是EatSomething[Animal]的子类
      */
    val animal: EatSomething[Animal] = bird
  }



}
