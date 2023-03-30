package com.knoldus
import org.scalatest.funsuite.AnyFunSuite

class PerformArithmeticOperationSpec extends AnyFunSuite {
  val testInput = new PerformArithmeticOperation

  test("test for addition of numbers") {
    assert(testInput.arithmeticFunction(List(Some(1), Some(2), Some(3), Some(4)), "Addition") === 10)
  }

  test("test for subtraction of numbers") {
    assert(testInput.arithmeticFunction(List(Some(1), Some(2), Some(3), Some(4)), "Subtraction") === -8)
  }

  test("test for multiplication of numbers") {
    assert(testInput.arithmeticFunction(List(Some(1), Some(2), Some(3), Some(4)), "Multiplication") === 24)
  }

  test(" Test for invalid operation") {
    val exception = intercept[IllegalArgumentException] {
      testInput.arithmeticFunction(List(Some(4), Some(3), None, Some(7)), "Division")
    }
    assert(exception.getMessage == "Invalid operation name.")
  }
}
