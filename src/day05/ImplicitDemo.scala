package day05
/**
  *隐式转换的例子
 */
//水果类
class Fruit(name:String){
  def getName()={
    name
  }
}

//猴子类
class Monkey(f:Fruit){
  def say()=println(s"Monkey like ${f.getName()}")
}

object ImplicitDemo {

  //隐式转换函数  把水果转换为猴子  太强大了  不可想象
implicit def Fruit2Monkey(f:Fruit)={
  new Monkey(f)
}
  def main(args: Array[String]): Unit = {
    //定义一个水果对象


    val f = new Fruit("桃子")
    f.say()


  }
}
