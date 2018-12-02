package day03

import scala.collection.mutable.ArrayBuffer

/**
  * class没有public，但是相当于public的作用
  * 当定义属性是private时候，scala会自动为其生成对应的get和set方法
  * private[this]的用法：该属性只属于该对象私有，就不会生成对应的set和get方法。
  */

class Student() {

  val id = "1001"
  var age = 20
  private val gender = "male"
  def getGender()={
    gender
  }

  /**
    * 内部嵌套类
    * @param courseName
    * @param credit
    */
  class course(val courseName:String ,var credit :Int){}
  private var courseList=new ArrayBuffer[course]()
  def addNewCourse(cname:String,credit:Int ): Unit ={
    var c = new course(cname,credit)
      courseList +=c

  }
}


object Student{

  def main(args: Array[String]): Unit = {
    val stu = new Student
    println(stu.gender)
    //创建选修课程
    stu.addNewCourse("数据结构",99)
    stu.addNewCourse("english",79)
    stu.addNewCourse("math",100)
    println(stu.id+"\t"+stu.age)
    println("*********选修的课程**********")
   for(x <- stu.courseList){
     //x.credit =100
     println(x.courseName+"\t"+x.credit)
   }
  }
}
object Test{
  def main(args: Array[String]): Unit = {
    val stu = new Student
    println(stu.id+" "+stu.age)
    stu.age = 100
    println(stu.age)
    println(stu.getGender())
  }
}
