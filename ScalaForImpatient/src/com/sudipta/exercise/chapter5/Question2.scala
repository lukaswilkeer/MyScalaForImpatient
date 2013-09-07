package com.sudipta.exercise.chapter5

class BankAccount(private var balance: Int = 500) {
	def deposit(amount: Int) = {
	  balance += amount
	}
	
	def withdraw(amount: Int) = {
	  if(amount > balance){
	    println("Sorry you don't have enough money")
	  }else{
	    balance -= amount
	  }
	}
	
	def printCurrentBalance = println("Your current balance is: " + balance)
}

object testQuestion2 extends App {
  val bankAccount = new BankAccount
  bankAccount.printCurrentBalance
  
  bankAccount.deposit(100)
  bankAccount.printCurrentBalance
  
  bankAccount.withdraw(1000)
  bankAccount.printCurrentBalance
  
  bankAccount.withdraw(200)
  bankAccount.printCurrentBalance
}