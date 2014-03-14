package day01session02.control_structures

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
    case _ => println("huuuh?")
  }                                               //> sayHello: (language: String)Unit
  
  //call the function with "German" and "Japanese"
  sayHello(???)                                   //> scala.NotImplementedError: an implementation is missing
                                                  //| 	at scala.Predef$.$qmark$qmark$qmark(Predef.scala:252)
                                                  //| 	at day01session02.control_structures.ControlStructures03PatternMatching$
                                                  //| $anonfun$main$1.apply$mcV$sp(day01session02.control_structures.ControlStruc
                                                  //| tures03PatternMatching.scala:29)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at day01session02.control_structures.ControlStructures03PatternMatching$
                                                  //| .main(day01session02.control_structures.ControlStructures03PatternMatching.
                                                  //| scala:20)
                                                  //| 	at day01session02.control_structures.ControlStructures03PatternMatching.
                                                  //| main(day01session02.control_structures.ControlStructures03PatternM
                                                  //| Output exceeds cutoff limit.
  sayHello(???)
  //now remove the line with "case _" and see what happens
  
  //implement using match expression and print a message "valus is an odd/even" number for each case
  def evenOrOdd(value: Int) = ???
  
  //call the function several times with: 3, -3, 0, and 2
  ???
}