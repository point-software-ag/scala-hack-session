package day01session04.lists

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
object Lists01BasicMethods01 {
  //source from: http://www.artima.com/pins1ed/working-with-lists.html
  //construction
  val fruit = List("apples", "oranges", "pears")  //> fruit  : List[String] = List(apples, oranges, pears)
  val nums = List(1, 2, 3, 4)                     //> nums  : List[Int] = List(1, 2, 3, 4)
  //list access via indices
  nums(1)                                         //> res0: Int = 2
  //Concatenation: with "::" another elemen is attached as head in list
  //add mangos and pears to the fruits
  ???                                             //> scala.NotImplementedError: an implementation is missing
                                                  //| 	at scala.Predef$.$qmark$qmark$qmark(Predef.scala:252)
                                                  //| 	at day01session04.lists.Lists01BasicMethods01$$anonfun$main$1.apply$mcV$
                                                  //| sp(day01session04.lists.Lists01BasicMethods01.scala:29)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at day01session04.lists.Lists01BasicMethods01$.main(day01session04.lists
                                                  //| .Lists01BasicMethods01.scala:20)
                                                  //| 	at day01session04.lists.Lists01BasicMethods01.main(day01session04.lists.
                                                  //| Lists01BasicMethods01.scala)
  
  val otherNums = List(4.5, 5, 5.5)
  //":::" concats two lists
  nums ::: otherNums

  //basic operations
  fruit.head
  fruit.tail
  fruit.last
  fruit.init
  fruit.reverse
  //similar to last
  fruit.reverse.head
  nums.isEmpty
  List[String]().isEmpty
  List().isEmpty

  //call take() for the first two elements
  
  //call drop on first two elements
  
  //call splitAt into two lists at pos 2
  
  //create a nested List with Lists of Int
  val nestedList = ???
  //flattens the nested list
  ???
}