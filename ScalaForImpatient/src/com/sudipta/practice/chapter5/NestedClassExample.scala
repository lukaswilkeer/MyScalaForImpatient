package com.sudipta.practice.chapter5

import scala.collection.mutable.ArrayBuffer

class Department(val deptName: String) { department =>
  
  //Creating nested class
  class Student(val name: String) {
    println("New Student created for " + department.deptName)

    val friends = new ArrayBuffer[Student]
    val anyFriends = new ArrayBuffer[Department#Student]
  }

  private val listOfStudents = new ArrayBuffer[Student]

  def join(name: String) = {
    val newStudent = new Student(name)
    listOfStudents += newStudent
    newStudent
  }
}

object TestMyNestedClass extends App {
	//Creating Departments
  val computerDepartment = new Department("Computer Science")
  val electricDepartment = new Department("Electrical")
  
  val sudipta = computerDepartment.join("Sudipta")
  val paromita = computerDepartment.join("Paromita")
  val pradipta = computerDepartment.join("Pradipta")
  val suman = electricDepartment.join("Suman")
  
  sudipta.friends += paromita
  sudipta.friends += pradipta
  
  paromita.friends += pradipta
  
  pradipta.friends += paromita
  
  //sudipta.friends += suman This is not possible because Sudipta and Suman belongs to different outer Object i.e. computerDepartment 
                             // and electricDepartment
  
  sudipta.anyFriends += suman //Using Type Projection it is possible
  
}