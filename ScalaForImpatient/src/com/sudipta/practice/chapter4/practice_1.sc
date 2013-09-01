package com.sudipta.chapter4.practice

import sun.org.mozilla.javascript.internal.ast.Yield
import scala.collection.JavaConversions.mapAsJavaMap
import java.awt.font.TextAttribute._

object MyWorkSheet_1 {
  println("Welcome to the Scala worksheet for Chapter 4 Practice Session")
                                                  //> Welcome to the Scala worksheet for Chapter 4 Practice Session
  //Creating Immutable Maps
  val immutableScores = Map("Sudipta" -> 10, "Bunty" -> 20, "Adih" ->30)
                                                  //> immutableScores  : scala.collection.immutable.Map[String,Int] = Map(Sudipta 
                                                  //| -> 10, Bunty -> 20, Adih -> 30)
  //Creating Mutable Maps
  val mutableScores = scala.collection.mutable.Map("Sudipta" -> 10, "Bunty" -> 20, "Adih" ->30, "Paro" -> "Adih", 20 -> "Adih")
                                                  //> mutableScores  : scala.collection.mutable.Map[Any,Any] = Map(20 -> Adih, Par
                                                  //| o -> Adih, Bunty -> 20, Adih -> 30, Sudipta -> 10)
  //Accessing Map Values
  val mapValue = mutableScores.getOrElse("Adih", "Nothing Found")
                                                  //> mapValue  : Any = 30
  val newMapValue = mutableScores.getOrElse("sudipta", "Nothing Found")
                                                  //> newMapValue  : Any = Nothing Found
  //Updating Map Values
  mutableScores("Sudipta") = 100
  println(mutableScores)                          //> Map(20 -> Adih, Paro -> Adih, Bunty -> 20, Adih -> 30, Sudipta -> 100)
  
  mutableScores += ("India" -> 1000, "Switzerland" -> 1500)
                                                  //> res0: com.sudipta.chapter4.practice.MyWorkSheet_1.mutableScores.type = Map(S
                                                  //| witzerland -> 1500, 20 -> Adih, India -> 1000, Paro -> Adih, Bunty -> 20, Ad
                                                  //| ih -> 30, Sudipta -> 100)
  mutableScores.size                              //> res1: Int = 7
  mutableScores -= "Bunty"                        //> res2: com.sudipta.chapter4.practice.MyWorkSheet_1.mutableScores.type = Map(S
                                                  //| witzerland -> 1500, 20 -> Adih, India -> 1000, Paro -> Adih, Adih -> 30, Sud
                                                  //| ipta -> 100)
  mutableScores.size                              //> res3: Int = 6
  
  val newImmutableScores = immutableScores + ("India" -> 1000, "Switzerland" -> 1500)
                                                  //> newImmutableScores  : scala.collection.immutable.Map[String,Int] = Map(Indi
                                                  //| a -> 1000, Adih -> 30, Sudipta -> 10, Switzerland -> 1500, Bunty -> 20)
  newImmutableScores.size                         //> res4: Int = 5
  //Iterating over Maps
  newImmutableScores.keySet                       //> res5: scala.collection.immutable.Set[String] = Set(India, Adih, Sudipta, Sw
                                                  //| itzerland, Bunty)
  mutableScores.keySet                            //> res6: scala.collection.Set[Any] = Set(Switzerland, 20, India, Paro, Adih, S
                                                  //| udipta)
  for(v <- newImmutableScores.values) println(v)  //> 1000
                                                  //| 30
                                                  //| 10
                                                  //| 1500
                                                  //| 20
  //Reversing Key Value Pairs
  for((k,v) <- mutableScores) yield (v,k)         //> res7: scala.collection.mutable.Map[Any,Any] = Map(1500 -> Switzerland, 100 
                                                  //| -> Sudipta, 1000 -> India, 30 -> Adih, Adih -> Paro)
  //Sorted maps
  val sortedScores = scala.collection.immutable.SortedMap("India"->100,"Switzerland"->200,"Germany"->300)
                                                  //> sortedScores  : scala.collection.immutable.SortedMap[String,Int] = Map(Germ
                                                  //| any -> 300, India -> 100, Switzerland -> 200)
  //Working with Java
  val attrs = Map(FAMILY -> "Serif", SIZE -> 12)  //> attrs  : scala.collection.immutable.Map[java.awt.font.TextAttribute,Any] = 
                                                  //| Map(java.awt.font.TextAttribute(family) -> Serif, java.awt.font.TextAttribu
                                                  //| te(size) -> 12)
  val font = new java.awt.Font(attrs)             //> font  : java.awt.Font = java.awt.Font[family=Serif,name=Serif,style=plain,s
                                                  //| ize=12]/
  
}