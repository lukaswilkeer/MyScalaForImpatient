package com.sudipta.practice.chapter4

object practice_2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(133); 
  println("Welcome to the Scala worksheet for Chapter 4 Practice Session");$skip(74); 
  //Creating a tuple
  val myTuple = ("Sudipta","Deb","Switzerland",1234);System.out.println("""myTuple  : (String, String, String, Int) = """ + $show(myTuple ));$skip(13); val res$0 = 
  myTuple._2;System.out.println("""res0: String = """ + $show(res$0));$skip(13); val res$1 = 
  myTuple._4;System.out.println("""res1: Int = """ + $show(res$1));$skip(47); 
  val (first, second, third, fourth) = myTuple;System.out.println("""first  : String = """ + $show(first ));System.out.println("""second  : String = """ + $show(second ));System.out.println("""third  : String = """ + $show(third ));System.out.println("""fourth  : Int = """ + $show(fourth ));$skip(121); 
  //I am not sure why this is not working. Let me ask the question in Stackoverflow
  val (first1, second1, _) = myTuple;System.out.println("""first1  : <error> = """ + $show(first1 ));System.out.println("""second1  : <error> = """ + $show(second1 ));$skip(63); 
  
  val stringPattern = "My Switzerland".partition(_.isUpper);System.out.println("""stringPattern  : (String, String) = """ + $show(stringPattern ));$skip(60); 
  println("Upper Case Characters are: " + stringPattern._1);$skip(60); 
  println("Lower Case Characters are: " + stringPattern._2);$skip(47); 
  //Zipping
  val symbols = Array("<","-",">");System.out.println("""symbols  : Array[String] = """ + $show(symbols ));$skip(31); 
  val counts = Array(2, 10, 2);System.out.println("""counts  : Array[Int] = """ + $show(counts ));$skip(34); 
  val pairs = symbols.zip(counts);System.out.println("""pairs  : Array[(String, Int)] = """ + $show(pairs ));$skip(46); 
  
  for((s,v) <- pairs) Console.println(s*v)}
  
  
}
