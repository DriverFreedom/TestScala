package day04

import java.text.SimpleDateFormat
import java.time.format.DateTimeFormatter
import java.util.Calendar

object  DateUtils {

  def getCurrentDate:String = getCurrentTime("EEEE,MM d")
  def getCurrentTime:String = getCurrentTime("k:m aa")

  private def getCurrentTime(dateTimeFormat: String):String={
    val dateFormat = new SimpleDateFormat(dateTimeFormat)
    val cal = Calendar.getInstance()
    dateFormat.format(cal.getTime)
  }


}


object  Test{
  def main(args: Array[String]): Unit = {
    println(DateUtils.getCurrentDate)
    println(DateUtils.getCurrentTime)
  }
  println(DateUtils.getCurrentDate)
}
