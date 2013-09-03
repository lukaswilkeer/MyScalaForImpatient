package com.sudipta.practice.chapter5

class Person {
	//var age = 0
	private var privateAge = 0
	private val privateName = "Sudipta Deb"
	
	def age = privateAge
	def age_=(newAge : Int) = {
	  if(newAge > privateAge)
	    privateAge = newAge
	}
	
	def name = privateName
	
	//Since privateName is a val, so only Getter is there. No Setter is possible
	
	/*
	 * def name_=(newName: String) = {
	 * privateName = newName
	 *	}
	*/
}

object PersonTest extends App {
  val sudipta = new Person
  sudipta.age = 20
  println("Initial Age: " + sudipta.age)
  
  sudipta.age = 18
  println("Trying to get younger: " + sudipta.age)
  
  sudipta.age = 29
  println("My bad luck, only older is possible : " + sudipta.age)
  
  println("My Name is: " + sudipta.name)
}