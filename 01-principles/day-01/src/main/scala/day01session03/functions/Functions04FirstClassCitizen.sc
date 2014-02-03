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
object Functions04FirstClassCitizen {
  def increase(x: Int) = x + 1                    //> increase: (x: Int)Int
  //Functions are first-class citizens
  //Since functions are treated as values, we can pass it to other functions
  //This function calls the the function param on both a and b before adding both values together
  def increaseBeforeAdd(a: Int, b: Int, operator: Int => Int) = operator(a) + operator(b)
                                                  //> increaseBeforeAdd: (a: Int, b: Int, operator: Int => Int)Int
  //Now call and pass the required params including the increase function
  increaseBeforeAdd(???, ???, ???)                //> scala.NotImplementedError: an implementation is missing
                                                  //| 	at scala.Predef$.$qmark$qmark$qmark(Predef.scala:252)
                                                  //| 	at day01session03.functions.Functions04FirstClassCitizen$$anonfun$main$1
                                                  //| .apply$mcV$sp(day01session03.functions.Functions04FirstClassCitizen.scala:2
                                                  //| 9)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at day01session03.functions.Functions04FirstClassCitizen$.main(day01sess
                                                  //| ion03.functions.Functions04FirstClassCitizen.scala:22)
                                                  //| 	at day01session03.functions.Functions04FirstClassCitizen.main(day01sessi
                                                  //| on03.functions.Functions04FirstClassCitizen.scala)
  //Here is another general definition allowing to pass any kind of function
  def logOperation(f: => Any) = println(s"Operation: $f")
  //Log increase
  logOperation(???)
  //Log increaseBeforeAdd
  logOperation(???)
  //Log a string using String or StringUtils
  logOperation(???)
  logOperation(???)
}