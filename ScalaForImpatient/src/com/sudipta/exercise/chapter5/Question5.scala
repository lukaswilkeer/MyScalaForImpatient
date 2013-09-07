package com.sudipta.exercise.chapter5

import scala.beans.BeanProperty

class Student(@BeanProperty var name: String, @BeanProperty var id: Long) {
	println("Student Object is created with name: " + getName + " id: " + getId)
}

object testQuestion5 extends App {
  val student1 = new Student("Sudipta",100L)
  println(student1.name)
  
  student1.name = "Bunty"
  println(student1.name)
}