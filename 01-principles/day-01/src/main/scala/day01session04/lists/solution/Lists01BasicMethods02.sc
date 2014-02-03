package day01session04.lists.solution

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
  nums.indices                                    //> res0: scala.collection.immutable.Range = Range(0, 1, 2, 3)
  //zip creates a tuple pair of two lists
  val zipped = nums.indices.zip(nums)             //> zipped  : scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((0,1), 
                                                  //| (1,2), (2,3), (3,4))
  //unzip creates splits it up into separated collections
  zipped.unzip                                    //> res1: (scala.collection.immutable.IndexedSeq[Int], scala.collection.immutab
                                                  //| le.IndexedSeq[Int]) = (Vector(0, 1, 2, 3),Vector(1, 2, 3, 4))

  //print using toString and mkString
  nums.toString                                   //> res2: String = List(1, 2, 3, 4)
  //print output should be: [1:2:3:4]
  nums.mkString("[", ":","")                      //> res3: String = [1:2:3:4
  //print output should be: 1:2:3:4
  nums.mkString(":")                              //> res4: String = 1:2:3:4
  
  val fruit = List("apples", "oranges", "pears")  //> fruit  : List[String] = List(apples, oranges, pears)
  //List patterns: http://www.artima.com/pins1ed/working-with-lists.html#16.5
  val List(a, b, c) = fruit                       //> a  : String = apples
                                                  //| b  : String = oranges
                                                  //| c  : String = pears
  println(a)                                      //> apples

  val first :: two :: rest = nums                 //> first  : Int = 1
                                                  //| two  : Int = 2
                                                  //| rest  : List[Int] = List(3, 4)
  //pattern matching
  //define all four cases and println a message "Case X ..." for each case
  //cases are: empty list, list of one element, list of two elements, list of more elements
  def count(list: List[String]) = list match {
    case head :: Nil => println("There is one element in the list")
    case Nil => println("List is empty")
    case one :: two :: Nil => println("There are two elements in the list")
    case head :: tail => println("There are more than two elements in the list")
  }                                               //> count: (list: List[String])Unit
  //call count with these params: empty list, List(1), List(1,2), List(1,2,3)
  count(List())                                   //> List is empty
  count(List("1"))                                //> There is one element in the list
  count(List("1", "2"))                           //> There are two elements in the list
  count(List("1", "2", "3"))                      //> There are more than two elements in the list

  //write a reverse of the list using pattern matching and recursive call
  def reverse(list: List[String]): List[String] = list match {
    case Nil => Nil //same like returning "List()"
    case head :: tail => reverse(tail) ::: List(head)
  }                                               //> reverse: (list: List[String])List[String]
  //call reverse with List(1,2,3,4)
  reverse(List("1", "2", "3", "4"))               //> res5: List[String] = List(4, 3, 2, 1)
}