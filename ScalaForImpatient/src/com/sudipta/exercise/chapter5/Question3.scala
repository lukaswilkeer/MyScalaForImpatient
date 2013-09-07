package com.sudipta.exercise.chapter5

class Time(private var hours: Int = 0 , private var minutes: Int = 0) {
	def before(other: Time) = hours < other.hours || (hours == other.hours && minutes < other.minutes)
}

object testQuestion3 extends App {
  val sixHours = new Time(6,0)
  val nineHours = new Time(9,0)
  val sixHoursFiveMinutes = new Time(6,5)
  
  println("Six Hours comes before Nine Hours: " + sixHours.before(nineHours))
  println("Six Hours Five Minutes comes before Six Hours: " + sixHoursFiveMinutes.before(sixHours))
}