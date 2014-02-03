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
object Functions04FirstClassCitizen {
  def increase(x: Int) = x + 1                    //> increase: (x: Int)Int
  //Functions are first-class citizens
  //Since functions are treated as values, we can pass it to other functions
  //This function calls the the function param on both a and b before adding both values together
  def increaseBeforeAdd(a: Int, b: Int, operator: Int => Int) = operator(a) + operator(b)
                                                  //> increaseBeforeAdd: (a: Int, b: Int, operator: Int => Int)Int
  //Now call and pass the required params including the increase function
  increaseBeforeAdd(2, 3, increase)               //> res0: Int = 7
  //Here is another general definition allowing to pass any kind of function
  def logOperation(f: => Any) = println(s"Operation: $f")
                                                  //> logOperation: (f: => Any)Unit
  //Log increase
  logOperation(increase(2))                       //> Operation: 3
  //Log increaseBeforeAdd
  logOperation(increaseBeforeAdd(2, 3, increase)) //> Operation: 7
  //Log a string using String or StringUtils
  logOperation("Hello, Scala")                    //> Operation: Hello, Scala
  logOperation(s"increase(2) = ${increase(2)}")   //> Operation: increase(2) = 3
}