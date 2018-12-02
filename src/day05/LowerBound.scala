package day05

import com.sun.xml.internal.bind.v2.runtime.reflect.Accessor.SetterOnlyReflection


class GrandFather

class Father extends GrandFather

class son extends Father

object LowerBound {

  def getCard[T >: son](p:T)=println("Ok")

  def main(args: Array[String]): Unit = {
    getCard(new GrandFather)
    getCard(new son)
  }
}
