package day03

/**
  * 针对不同的同事，有不同的打招呼方式
  */
object Greeping {

  def main(args: Array[String]): Unit = {
   /* def greeping(name:String ,f:(String)=>Unit):Unit={
      f(name)
    }

    def f(name:String):Unit=println(s"${name},你好呀")
    greeping("刘总",f)
    greeping("小王",f)
    greeping("老王",f)
    greeping("小姐",f)
    greeping("董事长",(name:String)=>println(s"${name}"))
    greeping("雷老板",(name)=>println(s"${name}"))
    greeping("习主席",name=>println(s"${name}"))
    greeping("惜君",println(_))*/

    /**
      *
      * @param str
      */
    def f(str:String*)={
      str.foreach(println)
    }
    f("雷军","马化腾","马云")
  }
}
