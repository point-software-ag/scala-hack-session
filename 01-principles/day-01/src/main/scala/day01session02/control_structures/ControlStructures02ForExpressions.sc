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
object ControlStructures02ForExpressions {
  //for expressions. syntax: for(generator) {body}
  //println every line number
  for (count <- 1 to 4) ???                       //> scala.NotImplementedError: an implementation is missing
                                                  //| 	at scala.Predef$.$qmark$qmark$qmark(Predef.scala:252)
                                                  //| 	at day01session02.control_structures.ControlStructures02ForExpressions$$
                                                  //| anonfun$main$1$$anonfun$apply$mcV$sp$3.apply(day01session02.control_structur
                                                  //| es.ControlStructures02ForExpressions.scala:23)
                                                  //| 	at day01session02.control_structures.ControlStructures02ForExpressions$$
                                                  //| anonfun$main$1$$anonfun$apply$mcV$sp$3.apply(day01session02.control_structur
                                                  //| es.ControlStructures02ForExpressions.scala:23)
                                                  //| 	at scala.collection.immutable.Range.foreach(Range.scala:141)
                                                  //| 	at day01session02.control_structures.ControlStructures02ForExpressions$$
                                                  //| anonfun$main$1.apply$mcV$sp(day01session02.control_structures.ControlStructu
                                                  //| res02ForExpressions.scala:23)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.r
                                                  //| Output exceeds cutoff limit.
  
  //from 1 to 10 println every even number, for odd number print only a new line
  //Hint: use the if-else expression
  
  //for expressions can have more than one generators. These are handled as nested loops
  for {
    outer <- 1 to 4
    if outer % 2 == 0
    inner <- 1 to 3
  } println(outer + ">" + inner)


  //use print and println in the for loop to print this:
  //1
  //22
  //333
  //4444
  //55555
  
  
  //match expressions are like switch statements in Java except it can take any constant
  def sayHello(language: String) = language match {
    case "German" => println("Hallo")
    case "English" => println("Hello")
    case _ => println("huuuh?")
  }
  
  //call the function with "German" and "Japanese"
  sayHello(???)
  sayHello(???)
  //now remove the line with "case _" and see what happens
  
  //implement using match expression and print a message "valus is an odd/even" number for each case
  def evenOrOdd(value: Int) = ???
  
  //call the function several times with: 3, -3, 0, and 2
  ???
}