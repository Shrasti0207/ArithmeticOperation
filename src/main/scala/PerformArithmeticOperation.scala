package com.knoldus

class PerformArithmeticOperation {
  // This method takes a list of Option[T] and an operation as input
  // T: Numeric is a context bound
  def arithmeticFunction[T: Numeric](list: List[Option[T]], operation: String): T = {
    if (list.isEmpty) throw new NoSuchElementException("list is empty")
    val numbers = for {
      Some(n) <- list
    } yield n
    operation match { //perform the appropriate arithmetic operation on the list
      case "Addition" => numbers.sum
      case "Subtraction" => numbers.reduceLeft(Numeric[T].minus)
      case "Multiplication" => numbers.product
      case _ => throw new IllegalArgumentException("Invalid operation name.")
    }
  }
}
