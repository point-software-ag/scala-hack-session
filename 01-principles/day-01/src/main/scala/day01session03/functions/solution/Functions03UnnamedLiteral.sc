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
object Functions03UnnamedLiteral {
  //Recap on functions: The syntax is: f(x) => y. In Scala we use "def someFunctionName".
  //We can define params for a function
  def log(message: String) = println(message)     //> log: (message: String)Unit
  //... and pass params
  object ScalaFun5 {
    log("instantiated at construction time: " + System.currentTimeMillis())
  }
  ScalaFun5                                       //> instantiated at construction time: 1391159917888
                                                  //| res0: day01session03.functions.solution.Functions03UnnamedLiteral.ScalaFun5
                                                  //| .type = day01session03.functions.solution.Functions03UnnamedLiteral$$anonfu
                                                  //| n$main$1$ScalaFun5$2$@252b65bf
  
  def increase(x: Int) = x + 1                    //> increase: (x: Int)Int
  increase(2)                                     //> res1: Int = 3
  //But functions can also be defined as unnamed literals...
  //Source: http://www.artima.com/pins1ed/functions-and-closures.html#8.3
  (x: Int) => x + 1                               //> res2: Int => Int = <function1>
  //Variables and functions can also return a function
  //Return an increase function
  val increase2 = (x: Int) => x + 1               //> increase2  : Int => Int = <function1>
  //The call is the same
  increase2(2)                                    //> res3: Int = 3
}