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
  //It is also possible to have nested for loops: put another for-loop in the body to have this output:
  //1
  //22
  //333
  //4444
  for (count <- 1 to 4) {
    //use another for-loop here.
    //Hint: unlike println the function "print" does a print without a new line.
    ???
  }
  
  //from 1 to 10 println every even number, for odd number print only a new line
  //Hint: use the if-else expression
  
  //for expressions can have more than one generators. These are handled as nested loops
  //in this case the first generator assigns after every loop the values from 1 to 4 to the variable outer
  //within each loop of "outer" another inner loop is generated where the values from 1 to 3 is assigned.
  //The output shows its iteration:
  //loop 1 creates outer=1 and inner=1
  //loop 2 creates outer=1 and inner=2
  //loop 3 creates outer=1 and inner=3
  //--->now that inner loop has reached its end the outer is increased in the next loop and the inner loop is re-created:
  //loop 4 creates outer=2 and inner=1
  //...
  for {
    outer <- 1 to 4
    inner <- 1 to 3
  } println(outer + ">" + inner)

  //besides generators it is also possible to have boolen expressions for filtering/skipping certain generators
  //in this case add an if-expression where only outer values have even numbers are considered as a loop.
  //the output looks as follows:
  //2>1
  //2>2
  //2>3
  //4>1
  //4>2
  //4>3
  for {
    outer <- 1 to 4
    //TODO: add if-expression
    inner <- 1 to 3
  } println(outer + ">" + inner)

  //Now improve the above example of nested loops with this output:
  //1
  //22
  //333
  //4444
  //Instead of a nested loop try to solve this with two different generators "row" and "column"
  
  
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
