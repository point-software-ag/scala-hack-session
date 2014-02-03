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
object Functions03UnnamedLiteral {
  //Recap on functions: The syntax is: f(x) => y. In Scala we use "def someFunctionName".
  //We can define params for a function
  def log(message: String) = println(message)     //> log: (message: String)Unit
  //... and pass params
  object ScalaFun5 {
    log("instantiated at construction time: " + System.currentTimeMillis())
  }
  ScalaFun5                                       //> instantiated at construction time: 1391159888416
                                                  //| res0: day01session03.functions.Functions03UnnamedLiteral.ScalaFun5.type = d
                                                  //| ay01session03.functions.Functions03UnnamedLiteral$$anonfun$main$1$ScalaFun5
                                                  //| $2$@5043cc83
  
  def increase(x: Int) = x + 1                    //> increase: (x: Int)Int
  increase(2)                                     //> res1: Int = 3
  //But functions can also be defined as unnamed literals...
  //Source: http://www.artima.com/pins1ed/functions-and-closures.html#8.3
  (x: Int) => x + 1                               //> res2: Int => Int = <function1>
  //Variables and functions can also return a function
  //Return an increase function
  val increase2 = ???                             //> scala.NotImplementedError: an implementation is missing
                                                  //| 	at scala.Predef$.$qmark$qmark$qmark(Predef.scala:252)
                                                  //| 	at day01session03.functions.Functions03UnnamedLiteral$$anonfun$main$1.ap
                                                  //| ply$mcV$sp(day01session03.functions.Functions03UnnamedLiteral.scala:39)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at day01session03.functions.Functions03UnnamedLiteral$.main(day01session
                                                  //| 03.functions.Functions03UnnamedLiteral.scala:22)
                                                  //| 	at day01session03.functions.Functions03UnnamedLiteral.main(day01session0
                                                  //| 3.functions.Functions03UnnamedLiteral.scala)
  //The call is the same
  //increase2(???)
}