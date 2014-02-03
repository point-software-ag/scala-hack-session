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
object Lists01BasicMethods01 {
  //source from: http://www.artima.com/pins1ed/working-with-lists.html
  //construction
  val fruit = List("apples", "oranges", "pears")  //> fruit  : List[String] = List(apples, oranges, pears)
  val nums = List(1, 2, 3, 4)                     //> nums  : List[Int] = List(1, 2, 3, 4)
  //list access via indices
  nums(1)                                         //> res0: Int = 2
  //Concatenation: with "::" another elemen is attached as head in list
  //add mangos and pears to the fruits
  "mango" :: fruit                                //> res1: List[String] = List(mango, apples, oranges, pears)
  "pears" :: fruit                                //> res2: List[String] = List(pears, apples, oranges, pears)
  "pears" :: "mango" :: fruit                     //> res3: List[String] = List(pears, mango, apples, oranges, pears)
  
  val otherNums = List(4.5, 5, 5.5)               //> otherNums  : List[Double] = List(4.5, 5.0, 5.5)
  //":::" concats two lists
  nums ::: otherNums                              //> res4: List[AnyVal] = List(1, 2, 3, 4, 4.5, 5.0, 5.5)

  //basic operations
  fruit.head                                      //> res5: String = apples
  fruit.tail                                      //> res6: List[String] = List(oranges, pears)
  fruit.last                                      //> res7: String = pears
  fruit.init                                      //> res8: List[String] = List(apples, oranges)
  fruit.reverse                                   //> res9: List[String] = List(pears, oranges, apples)
  //similar to last
  fruit.reverse.head                              //> res10: String = pears
  nums.isEmpty                                    //> res11: Boolean = false
  List[String]().isEmpty                          //> res12: Boolean = true
  List().isEmpty                                  //> res13: Boolean = true

  //call take() for the first two elements
  fruit.take(2)                                   //> res14: List[String] = List(apples, oranges)
  //call drop on first two elements
  fruit.drop(2)                                   //> res15: List[String] = List(pears)
  //call splitAt into two lists at pos 2
  nums.splitAt(2)                                 //> res16: (List[Int], List[Int]) = (List(1, 2),List(3, 4))
  
  //create a nested List with Lists of Int
  val nestedList = List(List(1, 2),List(3, 4))    //> nestedList  : List[List[Int]] = List(List(1, 2), List(3, 4))
  //flattens the nested list
  nestedList.flatten                              //> res17: List[Int] = List(1, 2, 3, 4)
  
}