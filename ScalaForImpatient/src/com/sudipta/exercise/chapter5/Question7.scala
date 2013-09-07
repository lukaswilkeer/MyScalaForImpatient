package com.sudipta.exercise.chapter5

class AnotherPerson (val parameter: String) {
  var Array(firstName, lastName, _*) = parameter.split(" ")
  
  println("Object created with valus FirstName: " + firstName + " LastName: " + lastName)
}

object testQuestion7 extends App {
  val person1 = new AnotherPerson("Sudipta Deb Anything else")
  println(person1.firstName)
  println(person1.lastName)
  person1.firstName = "Bunty"
  println(person1.firstName)
}