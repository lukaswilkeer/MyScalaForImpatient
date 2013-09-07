package com.sudipta.practice.chapter5

import scala.beans.BeanProperty

class AuxiliaryConstructor(val name: String = "", val age: Int = 0) {
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
}

object Test extends App{
  var myTestObject = new AuxiliaryConstructor
  myTestObject.printObject
  
  myTestObject = new AuxiliaryConstructor("Sudipta")
  myTestObject.printObject
  
  myTestObject = new AuxiliaryConstructor("Sudipta",29)
  myTestObject.printObject
}