package day05

class Vehicle {

  def driver()=println("driving")
}

class Car extends  Vehicle{
  override def driver(): Unit = println("car Driving")
}

class Bicycle extends Vehicle{
  override def driver(): Unit = println("bicycle Driving")
}

object VehicleTest extends App {
  def takeDriver[T <: Vehicle ](v:T)=v.driver()
  val vehicle = new Vehicle
  takeDriver(vehicle)
  val car = new Car
  takeDriver(car)
}
