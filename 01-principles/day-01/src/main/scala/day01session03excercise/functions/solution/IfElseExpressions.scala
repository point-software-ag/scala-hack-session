package day01session03excercise.functions.solution

/*
 * This file is part of the "Scala Hack Session".
 *
 * Scala Hack Session is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Scala Hack Session is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Scala Hack Session.  If not, see <http://www.gnu.org/licenses/>.
 *
 * =================================================================================
 *
 * A companion object "Calculator" with a function signum.
 */
object Calculator {
  //Recap: the if-else expression we have used in the control structures for printing count
  //The syntax of if-else is always expects a value for each condition: if (condition) value else value
  //Example: val digit = if (condition) 0 else 1
  //In our previous example println returns Unit as a value.
  //In case the condition is more than one line then last line defines whether something is returned. A "return" must not be used.
  /**
   * @param input of which signum is evaluated
   * @return 1 for positive input, -1 for negative and 0 for 0 input
   */
  def signum(input: Double) = if (input > 0) 1 else if (input < 0) -1 else 0
}

object TrueFalseInverter {

  def invert(value: Boolean) = {
    //in if-else expressions with multi-lines the value is defined
    //in the last line
    //TODO implement in if and else expression two lines of code: one printing "input->output", second the result to be returned
    if (value) {
      println("true -> false")
      //value to be used/returned for if expression
      false
    } else {
      println("false -> true")
      //value to be used/returned for else expression
      true
    }
  }
}

//Source: http://docs.scala-lang.org/tutorials/tour/operators.html
case class MyBool(x: Boolean) {

  //TODO use if else
  def and(that: MyBool): MyBool = if (x) that else this
  //TODO use if else
  def or(that: MyBool): MyBool = if (x) this else that
  //TODO negate the value
  def negate: MyBool = new MyBool(!x)
}

object IfElseApplication {

  def main(args: Array[String]) {
    println(s"signum(2) = ${Calculator.signum(2)}")
    println(s"signum(3) = ${Calculator.signum(3)}")
    println(s"signum(0) = ${Calculator.signum(0)}")
    println(s"signum(-3) = ${Calculator.signum(-3)}")
    println(s"signum(-2) = ${Calculator.signum(-2)}")
    println
    println(s"invert(true) = ${TrueFalseInverter.invert(true)}")
    //In Scala a "." is not required
    println(s"invert(false) = ${TrueFalseInverter invert false}")
    println
    println(s"MyBool(true) and MyBool(false) = ${((new MyBool(true)) and (new MyBool(false))).x}")
    println(s"MyBool(false) and MyBool(true) = ${((new MyBool(false)) and (new MyBool(true))).x}")
    println(s"MyBool(true) and MyBool(true) = ${((new MyBool(true)) and (new MyBool(true))).x}")
    println(s"MyBool(false) and MyBool(false) = ${((new MyBool(false)) and (new MyBool(false))).x}")
    println
    println(s"MyBool(true) or MyBool(false) = ${((new MyBool(true)) or (new MyBool(false))).x}")
    println(s"MyBool(false) or MyBool(true) = ${((new MyBool(false)) or (new MyBool(true))).x}")
    println(s"MyBool(true) or MyBool(true) = ${((new MyBool(true)) or (new MyBool(true))).x}")
    println(s"MyBool(false) or MyBool(false) = ${((new MyBool(false)) or (new MyBool(false))).x}")
    println
    println(s"MyBool(true).negate = ${(new MyBool(true)) negate}")
    println(s"MyBool(false).negate = ${(new MyBool(false)) negate}")
  }
}
