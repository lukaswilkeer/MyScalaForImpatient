package com.sudipta.practice.chapter5

import scala.beans.BeanProperty

class AuxiliaryConstructor(val name: String = "", private var age: Int = 0, phone: Int = 0) {
  
  //The below statement will be executed every time Primary Constructor is getting called
  println("New Object is created")
  
  def printObject(){
    println("Name: " + name + " Age: " + age + "Phone: " + phone)
  }
  
  def changeAge(age: Int) = if (age < this.age) println("Opps!! Want to be younger!! Sorry that is not possible") else {
    println("Now looks fine")
    this.age = age
  }
  
  def compareWithEachOther(otherObject: AuxiliaryConstructor) = {
    //Compare based on name
    if(this.name == otherObject.name) println("Names are equal") else println("Names are different")
    
    //Compare based on age
    if(this.age == otherObject.age) println("Both are of same age") else println("Both are of different age")
    
    //Compare based of phone is not possible as phone is Object private
  }
  
}

object Test extends App{
  var myTestObject = new AuxiliaryConstructor
  myTestObject.printObject
  
  println("-----------------------------------------")
  
  myTestObject = new AuxiliaryConstructor("Sudipta")
  myTestObject.printObject
  
  println("-----------------------------------------")
  
  myTestObject = new AuxiliaryConstructor("Sudipta",29)
  myTestObject.printObject
  
  println("Let's try to be younger by setting the age to 20")
  myTestObject.changeAge(20)
  myTestObject.printObject
  println("No way lets change the age to 30")
  myTestObject.changeAge(30)
  myTestObject.printObject
  
  println("-----------------------------------------")
  println("Now phone is Object Private field.. Let's check")
  val firstObject = new AuxiliaryConstructor("Sudipta",29,1234)
  val secondObject = new AuxiliaryConstructor("Adih",29,8989)
  
  firstObject.compareWithEachOther(secondObject)
}