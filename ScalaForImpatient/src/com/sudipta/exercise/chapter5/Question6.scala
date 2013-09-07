package com.sudipta.exercise.chapter5

class Person(var name: String, var ageParam: Int) {
  val age = if (ageParam < 0) 0 else ageParam

  //In the below line I am accessing ageParam to check, but the problem is that it makes ageParam also a member variable for this class
  println("Created Person with name: " + name + " Age: " + age + " where the passed age was: " + ageParam)

  override def toString = "Name: " + name + " Age: " + age
}

object testQuestion6 extends App {
  val person1 = new Person("Sudipta", 29)
  println(person1)

  val person2 = new Person("Bunty", -2)
  println(person2)

}