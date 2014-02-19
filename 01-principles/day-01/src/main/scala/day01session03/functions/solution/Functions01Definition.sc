package day01session03.functions.solution

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
  println(println("Hello, Scala"))                //> Hello, Scala
                                                  //| ()
  //This defines a constant variable "callByValue"
  val callByValue = 5                             //> callByValue  : Int = 5
  //This "calls" resp. uses the variable
  callByValue                                     //> res0: Int = 5
  //A one line function. Replace "val" with "def" to define a function. Then call the function
  //Have a look at the output before and after the change
  def callByName = 5                              //> callByName: => Int
  callByName                                      //> res1: Int = 5
  //See the difference in the output between callByValue and callByName
  //Reason is that a val is a call-by-value (CBV) and def a call-by-name (CBN)
  //We will cover CBV and CBN later.

  //Functions/methods are defined with "def". Syntax is: def functionName:ReturnType = {...some body}
  //Remember that the return type is not required because Scala uses type inferences.
  //Define a function message returning a String "Hello, World" and call it
  //Note:
  //- when the body is just a one-liner the curled brackets {} are not required
  //- a parmeterless function may omit the () brackets: "def f" is equal to "def f()"
  def message = "Hello, World"                    //> message: => String
  message                                         //> res2: String = Hello, World
  // Uncomment both lines and re-define the message function with a return type "Unit".
  // This is similar to Java's "void" where nothing is returned
  def message2: Unit = "Hello, World"             //> message2: => Unit
  message2
  
  //Source: http://www.artima.com/pins1ed/classes-and-objects.html (Listing 4.1)
  //Pay attention to the output of these examples regarding the return type:
  def f(): Unit = "this String gets lost"         //> f: ()Unit
  def g() { "this String gets lost too" }         //> g: ()Unit
  def h() = { "this String gets returned!" }      //> h: ()String
  
  //Unlike a "val" definition a "def" definition can take parameters.
  //Increment the input by one and return it
  def inc(a: Double) = a + 1                      //> inc: (a: Double)Double
  
}