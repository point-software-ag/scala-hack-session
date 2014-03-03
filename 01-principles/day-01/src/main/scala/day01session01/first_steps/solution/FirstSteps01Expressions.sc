package day01session01.first_steps.solution

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
object FirstSteps01Expressions {

  //This println function respectively method prints out the given parameter.
  //The output is on the right starting with "> ...."
  //Also note that a ";" at the end of the line is not required. Details: http://java.dzone.com/articles/scala-wonderland-semicolons
  println("Welcome Hacker! You have entered Level 1 of Scala Hack Session")
                                                  //> Welcome Hacker! You have entered Level 1 of Scala Hack Session

  //try and print "Hello, World"

  //now print a number like 1. Note: do not use "1", just 1
  //Enter your code in the next line
  //NOTE: don't be confused about the "???". As a result a NotImplementedError is shown.
  //Below there are more ??? without an error. The reason is the that worksheets are processed top-down.
  //once you have replaced the first "???" the IDE parses the output and then the next ??? shows an error.
  println(1)                                      //> 1
  println(println(1))                             //> 1
                                                  //| ()

  //====================== Expressions

  //Try adding two values like 40 and 2
  40 + 2                                          //> res0: Int(42) = 42

  //next, add 1.5 to 2.5:
  1.5 + 2.5                                       //> res1: Double(4.0) = 4.0

  //try with more operands like: 5 times 8 plus 2
  5 * 8 + 2                                       //> res2: Int = 42
  //what if you put the plus in front? 2 plus 5 times 8?
  //what about using brackets? (2 + 5) * 8
  2 + 5 * 8                                       //> res3: Int = 42
  (2 + 5) * 8                                     //> res4: Int = 56
  //what is the result of 15 modulo 4 multiplied with 2?
  15 % 4 * 2                                      //> res5: Int = 6
}