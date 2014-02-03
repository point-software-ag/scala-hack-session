package day01session01exercise.first_steps.solution

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
 */
object Calculator {
  def add(a: Double, b: Double) = a + b

  def subtract(a: Int, b: Double) = a - b

  def multiply(a: Double, b: Double) = a * b

  def divide(a: Double, b: Double) = a / b
  
}

object CalcApplication {
  //it is also possible to import one("MyClass.someFunction"), more ("MyClass.{f1, f3}")or all functions of a class ("MyClass._")
  import Calculator._
  def main(args: Array[String]) {
    val a = 6
    val b = 3
    
    //Note: the s"" is a function from StringContext
    println(s"$a + $b = ${add(a,b)}")
    
    println(s"$a - $b = ${subtract(a,b)}")
    
    println(s"$a * $b = ${multiply(a,b)}")

    println(s"$a / $b = ${divide(a,b)}")
  }
}