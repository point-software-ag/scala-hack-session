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
object Functions05Currying {
  //you can define an function alias using 'type'
  type Int2Double = Int => Double
  def incDouble(x: Int, int2double: Int2Double) = int2double(x) + 1
                                                  //> incDouble: (x: Int, int2double: Int => Double)Double
  incDouble(2, x => x.toDouble)                   //> res0: Double = 3.0
  //It is also possible to return functions
  //The first function returns a another function
  def first(x:Int) = (y: Int) => x + y            //> first: (x: Int)Int => Int
  val returnedFunction = first(2)                 //> returnedFunction  : Int => Int = <function1>
  //this function you can then use for a call
  returnedFunction(4)                             //> res1: Int = 6
  //In scala you can call it also like this:
  first(2)(4)                                     //> res2: Int = 6
  //This looks exactly like our add function: def add(a: Int, b: Int)

  //Instead of rewriting first() exactly like our add function we can do another approach called currying:
  def curried(a:Int)(b:Int) = a + b               //> curried: (a: Int)(b: Int)Int
  //This curried function is just syntactic sugar. Defining a function with e.g.
  //two parmater lists ("(listparams1)(listparams2)") results in two function invocations.
  //In this case function 1 takes parameter a and returns a function value (holding a) for the second function
  //guess how the curried function is called?
  curried(2)(3)                                   //> res3: Int = 5
  //curried functioncs are partial functions. It is possible to pass only one param list
  //and have the second funtion returned using "_"
  val f2 = curried(2)_                            //> f2  : Int => Int = <function1>
  f2(4)                                           //> res4: Int = 6
}