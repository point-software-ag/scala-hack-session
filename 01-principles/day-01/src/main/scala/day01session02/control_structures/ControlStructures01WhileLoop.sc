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
object ControlStructures01WhileLoop {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  //while loops
  var count = 0                                   //> count  : Int = 0
  //println every count
  while (count < 3) {
    //if you run into infinite loops, don't panic
    //the Scala IDE stops after two 2 seconds, or press ESC or any character to stop it
    //see: http://stackoverflow.com/questions/18836329/how-to-stop-program-execution-in-worksheet
    ???
  }                                               //> scala.NotImplementedError: an implementation is missing
                                                  //| 	at scala.Predef$.$qmark$qmark$qmark(Predef.scala:252)
                                                  //| 	at day01session02.control_structures.ControlStructures01WhileLoop$$anonf
                                                  //| un$main$1.apply$mcV$sp(day01session02.control_structures.ControlStructures0
                                                  //| 1WhileLoop.scala:29)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at day01session02.control_structures.ControlStructures01WhileLoop$.main(
                                                  //| day01session02.control_structures.ControlStructures01WhileLoop.scala:20)
                                                  //| 	at day01session02.control_structures.ControlStructures01WhileLoop.main(d
                                                  //| ay01session02.control_structures.ControlStructures01WhileLoop.scala)
  //println every even number between 1 and 10
  //try to find a solution by adjusting ONLY the while condition and leaving the body unchanged!
  //In case you can't find the solution, alternatively try this:
  //Change the println in the while body to: if (condition) println
  count = 1
  while (???) {
    println(count)
    count += 1
  }

  //do while loops, print every count
  count = 0
  do {
    ???
  } while (count < 3)
}