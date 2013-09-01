package com.sudipta.exercise.chapter4

import java.util.Calendar._
import scala.collection.JavaConversions._

object Chapter4 extends App {
  //1
  val myGadgetsWithOriginalPrice = Map("iPhone" -> 700, "iPad Mini" -> 450, "MacBook" -> 1600)
  val myGadgetsWithDiscounterPrice = for ((gadgetName, gadgetPrice) <- myGadgetsWithOriginalPrice) yield (gadgetName, gadgetPrice * .9)

  println(myGadgetsWithOriginalPrice)
  println(myGadgetsWithDiscounterPrice)

  //2
  val in = new java.util.Scanner(new java.io.File("files/myFile.txt"))
  val wordCounts = collection.mutable.Map[String, Int]() withDefault (_ => 0)
  while (in hasNext) wordCounts(in next) += 1
  println(wordCounts)

  //3
  {
    val in = new java.util.Scanner(new java.io.File("files/myFile.txt"))
    var newWordCounts = collection.immutable.Map[String, Int]() withDefault (_ => 0)
    while (in hasNext) {
      val key = in next
      val occuranceCount = newWordCounts(key)
      newWordCounts = newWordCounts - key + (key -> (occuranceCount + 1))
    }
    println(newWordCounts)
  }

  //4
  {
    val in = new java.util.Scanner(new java.io.File("files/myFile.txt"))
    var sortedMap = collection.immutable.SortedMap[String, Int]() withDefault (_ => 0)
    while (in hasNext) {
      val key = in next
      val occurance = sortedMap(key)
      sortedMap = sortedMap - key + (key -> (occurance + 1))
    }
    println(sortedMap)
  }

  //5
  {
    val in = new java.util.Scanner(new java.io.File("files/myFile.txt"))
    val wordCounts = new java.util.TreeMap[String, Int]
    while (in hasNext) {
      val key = in next ()
      if (!(wordCounts containsKey key)) wordCounts put (key, 0)
      wordCounts put (key, (wordCounts get key) + 1)
    }
    println(wordCounts)
  }

  //6
  {
    val dayOfTheWeekConst = collection.mutable.LinkedHashMap(
      "Monday" -> MONDAY,
      "Tuesday" -> TUESDAY,
      "Wednesday" -> WEDNESDAY,
      "Thursday" -> THURSDAY,
      "Friday" -> FRIDAY,
      "Saturday" -> SATURDAY,
      "Sunday" -> SUNDAY)
    println(dayOfTheWeekConst)
  }

  //7

  val properties = propertiesAsScalaMap(System getProperties)
  val maxLengthKey = ((properties keySet) toList) maxBy (_ size)
  for ((k, v) <- properties) {
    println(k + " " * ((maxLengthKey size) - (k size)) + " | " + v)
  }
  
  //8
  val myArray = Array(-1,20,10,100,-5,15)
  def minmax(values: Array[Int]) = {
    (values min, values max)
  }
  println(minmax(myArray))
  
  //9
  def lteqgt(values: Array[Int], v: Int) = {
    ((values filter (_ < v)) size, (values filter (_ == v)) size, (values filter (_ > v)) size)
  }
  
  val newArray = Array(10,20,30,40,40,50,60,70,80,90)
  println(lteqgt(newArray, 40))
  
  //10
  val helloWorld = "HELLOWORLD".zip("hellowordl").toMap
  var lower = helloWorld('D')
  println(helloWorld)
  println(lower)
}