package com.sudipta.practice.chapter5

class Person {
	var age = 0
}

object PersonTest extends App {
  val sudipta = new Person
  sudipta.age = 20
  println(sudipta.age)
}