package day01session01.first_steps

import java.text.SimpleDateFormat

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
object FirstSteps02Variables {

  /**
   * A constant variable is defined using val. Examples:
   * val name:String = "Hello, World";
   * val value:Int = 1;
   *
   */
  //Change the ??? e.g. by an String value like "Hello, World"
  val message: String = ???                       //> scala.NotImplementedError: an implementation is missing
                                                  //| 	at scala.Predef$.$qmark$qmark$qmark(Predef.scala:252)
                                                  //| 	at day01session01.first_steps.FirstSteps02Variables$$anonfun$main$1.appl
                                                  //| y$mcV$sp(day01session01.first_steps.FirstSteps02Variables.scala:33)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at day01session01.first_steps.FirstSteps02Variables$.main(day01session01
                                                  //| .first_steps.FirstSteps02Variables.scala:24)
                                                  //| 	at day01session01.first_steps.FirstSteps02Variables.main(day01session01.
                                                  //| first_steps.FirstSteps02Variables.scala)

  /**
   * Scala uses type inference as far as possible. In this case a type is not needed. The value type also defines the val type.
   */
  val answer = "Hello, Scala friend!"

  /**
   * A constant for SimpleDateFormat with the pattern "dd:MM:yyyy HH:mm:ss:SSS"
   * In Scala it is legitimate to use Java classes.
   */
  val dateFormat = new SimpleDateFormat("dd:MM:yyyy HH:mm:ss:SSS")

  /**
   * An assignable variable allows re-assigning the variable with another value at any time.
   *
   */
  var constructionTime = System.currentTimeMillis()
  
  //reassign constructionTime with a new current time plus one second
  constructionTime = ???
  //print the time using the dateFormat
  ???
  
  
}