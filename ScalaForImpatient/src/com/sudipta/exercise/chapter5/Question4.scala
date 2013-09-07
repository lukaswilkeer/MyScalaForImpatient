package com.sudipta.exercise.chapter5

class NewTime(private var hours: Int = 0 , private var minutes: Int = 0) {
	private val convertedTimeInMinutes = hours * 24 + minutes
	println("Converted time is: " + convertedTimeInMinutes)
	def before(other: NewTime) = convertedTimeInMinutes < other.convertedTimeInMinutes
}

object testQuestion4 extends App {
  val sixHours = new NewTime(6,0)
  val nineHours = new NewTime(9,0)
  val sixHoursFiveMinutes = new NewTime(6,5)
  
  println("Six Hours comes before Nine Hours: " + sixHours.before(nineHours))
  println("Six Hours Five Minutes comes before Six Hours: " + sixHoursFiveMinutes.before(sixHours))
}