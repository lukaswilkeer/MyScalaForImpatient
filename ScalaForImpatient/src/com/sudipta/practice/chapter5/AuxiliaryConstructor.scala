package com.sudipta.practice.chapter5

import scala.beans.BeanProperty

class AuxiliaryConstructor() {
  @BeanProperty //The below declaration will fail because @BeanProperty can be applied only to non-private member variables
  //private var name = ""
  var name = ""

  @BeanProperty
  var age = 0
  
  //Defining Auxiliary Constructor
  def this(name: String){
    this() //It is calling the Primary Constructor
    this.setName(name)
  }
  
  def this(name: String, age: Int){
    this(name)
    this.setAge(age)
  }
  
  def printObject(){
    println("Name: " + this.getName + " Age: " + this.getAge)
  }
}

object Test extends App{
  var myTestObject = new AuxiliaryConstructor
  myTestObject.printObject
  
  myTestObject = new AuxiliaryConstructor("Sudipta")
  myTestObject.printObject
  
  myTestObject = new AuxiliaryConstructor("Sudipta",29)
  myTestObject.printObject
}