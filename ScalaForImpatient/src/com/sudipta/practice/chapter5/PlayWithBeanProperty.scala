package com.sudipta.practice.chapter5

import scala.beans.BeanProperty

class PlayWithBeanProperty(@BeanProperty var age: Int) {
  @BeanProperty	
  var name: String = _
  
  
}

object TestBeanProperty extends App {
  val myBeanProperty = new PlayWithBeanProperty(20)
  myBeanProperty.setName("Sudipta")
  //Trying to set the age
  myBeanProperty.setAge(100)
  println("My name is: " + myBeanProperty.getName + " with age: " + myBeanProperty.age)
}