package com.sudipta.practice.chapter5

class Employee private(val name: String, val salary: Int) {
	println("Created the Employee Object")
	
	def this(name: String) = {
	  this(name,999)
	}
	
	def printEmployee = println("Employee: " + name + " Salary: " + salary)
}

object test extends App {
  //val firstEmployee = new Employee This will not work because the primary constructor is private
  val firstEmployee = new Employee("Sudipta")
  firstEmployee.printEmployee
  
  
}