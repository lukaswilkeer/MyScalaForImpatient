package com.sudipta.practice.chapter5

import scala.beans.BeanProperty

class PlayWithBeanProperty {
  @BeanProperty	
  var name: String = _
}

object TestBeanProperty extends App {
  val myBeanProperty = new PlayWithBeanProperty
  myBeanProperty.setName("Sudipta")
  println("My name is: " + myBeanProperty.getName)
}