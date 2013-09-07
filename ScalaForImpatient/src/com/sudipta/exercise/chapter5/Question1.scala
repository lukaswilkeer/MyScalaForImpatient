package com.sudipta.exercise.chapter5

class Counter {
	private var value = Int.MaxValue - 1
	def increment = {
	  if(value < Int.MaxValue){
		  value += 1
	  }else{
	    println("Increment is not possible")
	  }
		  
	}
	def current = value
}

object testQuestion1 extends App {
  val object1 = new Counter;
  object1.increment
  println(object1.current)
  object1.increment
  println(object1.current)
}