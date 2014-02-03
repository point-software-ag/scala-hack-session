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
object Lists01BasicMethods02 {
  val nums = List(1, 2, 3, 4)                     //> nums  : List[Int] = List(1, 2, 3, 4)
  //return all indices
  //nums.???
  //zip creates a tuple pair of two lists
  val zipped = nums.indices.zip(nums)             //> zipped  : scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((0,1), 
                                                  //| (1,2), (2,3), (3,4))
  //unzip creates splits it up into separated collections
  //zipped.???

  //print using toString and mkString
  nums.toString                                   //> res0: String = List(1, 2, 3, 4)
  //print output should be: [1:2:3:4]
  nums.mkString(???, ???,???)                     //> scala.NotImplementedError: an implementation is missing
                                                  //| 	at scala.Predef$.$qmark$qmark$qmark(Predef.scala:252)
                                                  //| 	at day01session04.lists.Lists01BasicMethods02$$anonfun$main$1.apply$mcV$
                                                  //| sp(day01session04.lists.Lists01BasicMethods02.scala:32)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at day01session04.lists.Lists01BasicMethods02$.main(day01session04.lists
                                                  //| .Lists01BasicMethods02.scala:20)
                                                  //| 	at day01session04.lists.Lists01BasicMethods02.main(day01session04.lists.
                                                  //| Lists01BasicMethods02.scala)
  //print output should be: 1:2:3:4
  nums.mkString(???)
  
  val fruit = List("apples", "oranges", "pears")
  //List patterns: http://www.artima.com/pins1ed/working-with-lists.html#16.5
  val List(a, b, c) = fruit
  println(a)
  val first :: two :: rest = nums
  //pattern matching
  //define all four cases and println a message "Case X ..." for each case
  //cases are: empty list, list of one element, list of two elements, list of more elements
  def count(list: List[String]) = list match {
    case head :: Nil => ???
    case Nil => ???
    ???
    ???
  }
  //call count with these params: empty list, List(1), List(1,2), List(1,2,3)

  //write a reverse of the list using pattern matching and recursive call
  def reverse(list: List[String]): List[String] = ???
  //call reverse with List(1,2,3,4)
  ???
}