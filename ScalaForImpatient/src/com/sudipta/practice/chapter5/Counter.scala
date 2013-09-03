package com.sudipta.practice.chapter5

class Counter {
  //Creating a private variable member variable. 
  var counter = 100
  
  //increment counter
  def incrementCounter() = {
    counter+= 1
  }
  
  def showCounterValue = counter
}

object CounterTest extends App {
  //Important point here: Below I am creating myCounter as value (means immutable), but inside that I have var counter, which is
  //immutable
  val myCounter = new Counter
  myCounter.incrementCounter()
  println(myCounter.showCounterValue)
}