package com.sudipta.practice.chapter5

import scala.beans.BeanProperty

class AuxiliaryConstructor(val name: String = "", private var age: Int = 0) {
  //No need of Auxiliary Constructor as default value can be given in the primary constructor only
  /*//Defining Auxiliary Constructor
  def this(name: String){
    this() //It is calling the Primary Constructor
    this.name = name
  }
  
  def this(name: String, age: Int){
    this(name)
    this.setAge(age)
  }*/
  
  //The below statement will be executed every time Primary Constructor is getting called
  println("New Object is created")
  
  def printObject(){
    println("Name: " + name + " Age: " + age)
  }
  
  def changeAge(age: Int) = if (age < this.age) println("Opps!! Want to be younger!! Sorry that is not possible") else {
    println("Now looks fine")
    this.age = age
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
  
  
}