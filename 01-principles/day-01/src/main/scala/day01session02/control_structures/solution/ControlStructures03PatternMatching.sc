package day01session02.control_structures.solutions

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
 */
object ControlStructures03PatternMatching {
  //match expressions are like switch statements in Java except it can take any constant
  def sayHello(language: String) = language match {
    case "German" => println("Hallo")
    case "English" => println("Hello")
    case _ => println("Sorry, I don't understand " + language)
  }                                               //> sayHello: (language: String)Unit
  //call the function with "German" and "Japanese"
  sayHello("German")                              //> Hallo
  sayHello("Japanese")                            //> Sorry, I don't understand Japanese
  //now remove the line with "case _" and see what happens

  //implement using match expression and print a message "valus is an odd/even" number for each case
  def evenOrOdd(value: Int) = (value % 2 == 0) match {
    case true => println(value + " is an even number")
    case _ => println(value + " is an odd number")
  }                                               //> evenOrOdd: (value: Int)Unit

  //call the function several times with: 3, -3, 0, and 2
  evenOrOdd(3)                                    //> 3 is an odd number
  evenOrOdd(-3)                                   //> -3 is an odd number
  evenOrOdd(0)                                    //> 0 is an even number
  evenOrOdd(2)                                    //> 2 is an even number
}