package com.sudipta.practice.chapter4

object practice_2 {
  println("Welcome to the Scala worksheet for Chapter 4 Practice Session")
                                                  //> Welcome to the Scala worksheet for Chapter 4 Practice Session
  //Creating a tuple
  val myTuple = ("Sudipta","Deb","Switzerland",1234)
                                                  //> myTuple  : (String, String, String, Int) = (Sudipta,Deb,Switzerland,1234)
  myTuple._2                                      //> res0: String = Deb
  myTuple._4                                      //> res1: Int = 1234
  val (first, second, third, fourth) = myTuple    //> first  : String = Sudipta
                                                  //| second  : String = Deb
                                                  //| third  : String = Switzerland
                                                  //| fourth  : Int = 1234
  
  //I am not sure why this is not working. Let me ask the question in Stackoverflow
  //Here is the link: http://stackoverflow.com/questions/18559511/tuples-in-scala-not-working-as-expected
  //val (first1, second1, _) = myTuple
  
  val stringPattern = "My Switzerland".partition(_.isUpper)
                                                  //> stringPattern  : (String, String) = (MS,y witzerland)
  println("Upper Case Characters are: " + stringPattern._1)
                                                  //> Upper Case Characters are: MS
  println("Lower Case Characters are: " + stringPattern._2)
                                                  //> Lower Case Characters are: y witzerland
  //Zipping
  val symbols = Array("<","-",">")                //> symbols  : Array[String] = Array(<, -, >)
  val counts = Array(2, 10, 2)                    //> counts  : Array[Int] = Array(2, 10, 2)
  val pairs = symbols.zip(counts)                 //> pairs  : Array[(String, Int)] = Array((<,2), (-,10), (>,2))
  
  for((s,v) <- pairs) Console.println(s*v)        //> <<
                                                  //| ----------
                                                  //| >>
  
  
}