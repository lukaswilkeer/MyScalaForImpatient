package com.sudipta.chapter4.practice

import sun.org.mozilla.javascript.internal.ast.Yield
import scala.collection.JavaConversions.mapAsJavaMap
import java.awt.font.TextAttribute._

object MyWorkSheet_1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(280); 
  println("Welcome to the Scala worksheet for Chapter 4 Practice Session");$skip(101); 
  //Creating Immutable Maps
  val immutableScores = Map("Sudipta" -> 10, "Bunty" -> 20, "Adih" ->30);System.out.println("""immutableScores  : scala.collection.immutable.Map[String,Int] = """ + $show(immutableScores ));$skip(154); 
  //Creating Mutable Maps
  val mutableScores = scala.collection.mutable.Map("Sudipta" -> 10, "Bunty" -> 20, "Adih" ->30, "Paro" -> "Adih", 20 -> "Adih");System.out.println("""mutableScores  : scala.collection.mutable.Map[Any,Any] = """ + $show(mutableScores ));$skip(91); 
  //Accessing Map Values
  val mapValue = mutableScores.getOrElse("Adih", "Nothing Found");System.out.println("""mapValue  : Any = """ + $show(mapValue ));$skip(72); 
  val newMapValue = mutableScores.getOrElse("sudipta", "Nothing Found");System.out.println("""newMapValue  : Any = """ + $show(newMapValue ));$skip(57); 
  //Updating Map Values
  mutableScores("Sudipta") = 100;$skip(25); 
  println(mutableScores);$skip(63); val res$0 = 
  
  mutableScores += ("India" -> 1000, "Switzerland" -> 1500);System.out.println("""res0: com.sudipta.chapter4.practice.MyWorkSheet_1.mutableScores.type = """ + $show(res$0));$skip(21); val res$1 = 
  mutableScores.size;System.out.println("""res1: Int = """ + $show(res$1));$skip(27); val res$2 = 
  mutableScores -= "Bunty";System.out.println("""res2: com.sudipta.chapter4.practice.MyWorkSheet_1.mutableScores.type = """ + $show(res$2));$skip(21); val res$3 = 
  mutableScores.size;System.out.println("""res3: Int = """ + $show(res$3));$skip(89); 
  
  val newImmutableScores = immutableScores + ("India" -> 1000, "Switzerland" -> 1500);System.out.println("""newImmutableScores  : scala.collection.immutable.Map[String,Int] = """ + $show(newImmutableScores ));$skip(26); val res$4 = 
  newImmutableScores.size;System.out.println("""res4: Int = """ + $show(res$4));$skip(52); val res$5 = 
  //Iterating over Maps
  newImmutableScores.keySet;System.out.println("""res5: scala.collection.immutable.Set[String] = """ + $show(res$5));$skip(23); val res$6 = 
  mutableScores.keySet;System.out.println("""res6: scala.collection.Set[Any] = """ + $show(res$6));$skip(49); 
  for(v <- newImmutableScores.values) println(v);$skip(72); val res$7 = 
  //Reversing Key Value Pairs
  for((k,v) <- mutableScores) yield (v,k);System.out.println("""res7: scala.collection.mutable.Map[Any,Any] = """ + $show(res$7));$skip(122); 
  //Sorted maps
  val sortedScores = scala.collection.immutable.SortedMap("India"->100,"Switzerland"->200,"Germany"->300);System.out.println("""sortedScores  : scala.collection.immutable.SortedMap[String,Int] = """ + $show(sortedScores ));$skip(71); 
  //Working with Java
  val attrs = Map(FAMILY -> "Serif", SIZE -> 12);System.out.println("""attrs  : scala.collection.immutable.Map[java.awt.font.TextAttribute,Any] = """ + $show(attrs ));$skip(38); 
  val font = new java.awt.Font(attrs);System.out.println("""font  : java.awt.Font = """ + $show(font ))}
  
}
