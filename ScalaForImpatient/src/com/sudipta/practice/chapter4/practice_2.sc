package com.sudipta.practice.chapter4

object practice_2 {
  println("Welcome to the Scala worksheet for Chapter 4 Practice Session")
  //Creating a tuple
  val myTuple = ("Sudipta","Deb","Switzerland",1234)
  myTuple._2
  myTuple._4
  val (first, second, third, fourth) = myTuple
  //I am not sure why this is not working. Let me ask the question in Stackoverflow
  val (first1, second1, _) = myTuple
  
  val stringPattern = "My Switzerland".partition(_.isUpper)
  println("Upper Case Characters are: " + stringPattern._1)
  println("Lower Case Characters are: " + stringPattern._2)
  //Zipping
  val symbols = Array("<","-",">")
  val counts = Array(2, 10, 2)
  val pairs = symbols.zip(counts)
  
  for((s,v) <- pairs) Console.println(s*v)
  
  
}