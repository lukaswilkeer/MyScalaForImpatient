package com.sudipta.practice.chapter5

class FirstClass {
	private var value = 0
	def increment() = {
	  value += 1
	}
	def currentValue = value
}

object TestClass extends App{
  val myFirstClass = new FirstClass
  myFirstClass.increment()
  println("Value is: " + myFirstClass.currentValue)
  myFirstClass.increment()
  println("Value is: " + myFirstClass.currentValue)
}