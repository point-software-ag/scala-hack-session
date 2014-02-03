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
object Lists03HighOrderMethods01 {
  //map, flatMap, foreach
  //http://www.artima.com/pins1ed/working-with-lists.html#16.7

  //another way to create a list
  val nums = List.range(1, 5)                     //> nums  : List[Int] = List(1, 2, 3, 4)
  //map function takes a function as param with T => U
  //in this case it doubles all elements
  nums.map(element => element * 2)                //> res0: List[Int] = List(2, 4, 6, 8)

  //In Scala the wild card "_" can be used
  nums.map(_ * 2)                                 //> res1: List[Int] = List(2, 4, 6, 8)

  //zip the indices with the numbers
  val tupleList = nums.indices.zip(nums)          //> tupleList  : scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((0,
                                                  //| 1), (1,2), (2,3), (3,4))
  //tuples can be access with "_1", "_2" etc
  //print the tuple "index1:value2, index2:value2, ..."
  tupleList.map(pair => pair._1 + ":" + pair._2)  //> res2: scala.collection.immutable.IndexedSeq[String] = Vector(0:1, 1:2, 2:3,
                                                  //|  3:4)
  //the wildcard can be used only once, play with it
  //can you map both values in a tuple or only one?
  tupleList.map(_._2)                             //> res3: scala.collection.immutable.IndexedSeq[Int] = Vector(1, 2, 3, 4)

  val words = List("scala", "is", "fun")          //> words  : List[String] = List(scala, is, fun)
  //using String.toList
  val nestedList = words.map(_.toList)            //> nestedList  : List[List[Char]] = List(List(s, c, a, l, a), List(i, s), List
                                                  //| (f, u, n))
  //flatMap flattens the result
  words.flatMap(_.toList)                         //> res4: List[Char] = List(s, c, a, l, a, i, s, f, u, n)
  nestedList.flatMap(char => char)                //> res5: List[Char] = List(s, c, a, l, a, i, s, f, u, n)
  words.flatMap(char => char)                     //> res6: List[Char] = List(s, c, a, l, a, i, s, f, u, n)
  words.flatten                                   //> res7: List[Char] = List(s, c, a, l, a, i, s, f, u, n)
  //with foreach you can do something on each element. nothing is returned
  //print each element in nums
  nums.foreach(println(_))                        //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
}