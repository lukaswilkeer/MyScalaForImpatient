package com.sudipta.exercise.chapter5

class Car(val manufacturer: String, val modelName: String, val modelYear: Int = -1, 
    	var licensePlate: String = "" ) {
	override def toString ="Manufacturer: " + manufacturer + " Model Name: " + modelName + " Model Year: " + modelYear + 
			" License Plate: " + licensePlate
}

object testQuestion8 extends App {
  val car1 = new Car("Honda","Brio")
  val car2 = new Car("Hyundai","i20",2013)
  val car3 = new Car("Tata","Nano",2012,"ABCD")
  println(car1.manufacturer)
  println(car2.modelName)
  println(car3.licensePlate)
  car3.licensePlate = "MNOP"
  println(car1)
  println(car3)
}

