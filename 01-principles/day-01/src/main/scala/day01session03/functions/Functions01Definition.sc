package day01session03.functions

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
object Functions01Definition {
  //Simply said a function is binding an input variable (x) and expressing outcome (y): f(x) => y
  //Now let's have a recap to our first session about the println function.
  //Let's try a nested println of "Hello, Scala". Have a close look at the output. How many lines are printed and why?
  //Call a nested println of "Hello, Scala" in a println:
  ???                                             //> scala.NotImplementedError: an implementation is missing
                                                  //| 	at scala.Predef$.$qmark$qmark$qmark(Predef.scala:252)
                                                  //| 	at day01session03.functions.Functions01Definition$$anonfun$main$1.apply$
                                                  //| mcV$sp(day01session03.functions.Functions01Definition.scala:27)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at day01session03.functions.Functions01Definition$.main(day01session03.f
                                                  //| unctions.Functions01Definition.scala:22)
                                                  //| 	at day01session03.functions.Functions01Definition.main(day01session03.fu
                                                  //| nctions.Functions01Definition.scala)
  //This defines a constant variable "callByValue"
  val callByValue = 5
  //This "calls" resp. uses the variable
  callByValue
  //A one line function. Replace "val" with "def" to define a function. Then call the function
  //Have a look at the output before and after the change
  val callByName = 5
  ???
  //See the difference in the output between callByValue and callByName
  //Reason is that a val is a call-by-value (CBV) and def a call-by-name (CBN)
  //We will cover CBV and CBN later.

  //Functions/methods are defined with "def". Syntax is: def functionName:ReturnType = {...some body}
  //Remember that the return type is not required because Scala uses type inferences.
  //Define a function message returning a String "Hello, World" and call it
  //Note:
  //- when the body is just a one-liner the curled brackets {} are not required
  //- a parmeterless function may omit the () brackets: "def f" is equal to "def f()"
  def message = "Hello, World"
  message
  // Uncomment both lines and re-define the message function with a return type "Unit".
  // This is similar to Java's "void" where nothing is returned
  //def message2: ??? = ???
  //message2
  
  //Source: http://www.artima.com/pins1ed/classes-and-objects.html (Listing 4.1)
  //Pay attention to the output of these examples regarding the return type:
  def f(): Unit = "this String gets lost"
  def g() { "this String gets lost too" }
  def h() = { "this String gets returned!" }
  
  //Unlike a "val" definition a "def" definition can take parameters.
  //Increment the input by one and return it
  def inc(a: Double) = ???
  
}