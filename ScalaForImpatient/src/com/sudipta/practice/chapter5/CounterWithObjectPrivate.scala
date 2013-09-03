package com.sudipta.practice.chapter5

class CounterWithObjectPrivate {
  private[this] var counter = 0

  def increment() = {
    counter += 1
  }

  def showCounter = counter
  
  //Below line will not work for other.counter. The reason is counter is Object Private
  //def compareTwoCounters(other: CounterWithObjectPrivate) = if (counter < other.counter) "true" else "false"
  def compareTwoCounters(other: CounterWithObjectPrivate) = if (showCounter < other.showCounter) "true" else "false"
}

object TestCounter extends App {
  val counter1 = new CounterWithObjectPrivate
  val counter2 = new CounterWithObjectPrivate

  counter1.increment()
  counter1.increment()

  counter2.increment()

  println(counter1.showCounter)
  println(counter2.showCounter)

  //Now since counter is Object Private, so no private getters and setters will be generated.
  //So the below line will give error as well
  //println(counter1.counter)

  println(counter1.compareTwoCounters(counter2))
  println(counter2.compareTwoCounters(counter1))
}