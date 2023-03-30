package com.knoldus
import scala.util.Try

object ArithmeticOperationsDriver extends App {
  // create an instance of the performArithmeticOperation class
  private val objectlist = new PerformArithmeticOperation
  private val emptyList = List.empty
  //perform operations on the list
  private val performedAddition = Try(objectlist.arithmeticFunction(List(Some(1.0), Some(2.2), Some(3.2), Some(4.0)), "Addition"))
  private val performedSubtraction = Try(objectlist.arithmeticFunction(List(Some(1), Some(2), Some(3), Some(4)), "Subtraction"))
  private val performedMultiplication = Try(objectlist.arithmeticFunction(List(Some(1), Some(2), Some(3), Some(4)), "Multiplication"))
  private val performedexception = Try(objectlist.arithmeticFunction(List(Some(1), Some(2), Some(3), Some(4)), "Division"))
  private val performedEmptyListException = Try(objectlist.arithmeticFunction(emptyList, "Addition")(Numeric.IntIsIntegral))
  // print the results or the exceptions thrown by the arithmetic functions
  performedAddition match {
    case scala.util.Success(result) => println(result)
    case scala.util.Failure(exception) => println(exception)
  }
  performedSubtraction match {
    case scala.util.Success(result) => println(result)
    case scala.util.Failure(exception) => println(exception)
  }
  performedMultiplication match {
    case scala.util.Success(result) => println(result)
    case scala.util.Failure(exception) => println(exception)
  }
  performedexception match {
    case scala.util.Success(result) => println(result)
    case scala.util.Failure(exception) => println(exception)
  }
  performedEmptyListException match {
    case scala.util.Success(result) => println(result)
    case scala.util.Failure(exception) => println(exception)
  }
}
