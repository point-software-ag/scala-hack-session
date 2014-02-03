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
object Lists03HighOrderMethods01 {
  //map, flatMap, foreach
  //http://www.artima.com/pins1ed/working-with-lists.html#16.7
  
  //another way to create a list
  val nums = List.range(1,5)                      //> nums  : List[Int] = List(1, 2, 3, 4)
  //map function takes a function as param with T => U
  //in this case it doubles all elements
  nums.map(element => ???)                        //> scala.NotImplementedError: an implementation is missing
                                                  //| 	at scala.Predef$.$qmark$qmark$qmark(Predef.scala:252)
                                                  //| 	at day01session04.lists.Lists03HighOrderMethods01$$anonfun$main$1$$anonf
                                                  //| un$2.apply(day01session04.lists.Lists03HighOrderMethods01.scala:28)
                                                  //| 	at day01session04.lists.Lists03HighOrderMethods01$$anonfun$main$1$$anonf
                                                  //| un$2.apply(day01session04.lists.Lists03HighOrderMethods01.scala:28)
                                                  //| 	at scala.collection.TraversableLike$$anonfun$map$1.apply(TraversableLike
                                                  //| .scala:244)
                                                  //| 	at scala.collection.TraversableLike$$anonfun$map$1.apply(TraversableLike
                                                  //| .scala:244)
                                                  //| 	at scala.collection.immutable.List.foreach(List.scala:318)
                                                  //| 	at scala.collection.TraversableLike$class.map(TraversableLike.scala:244)
                                                  //| 
                                                  //| 	at scala.collection.AbstractTraversable.map(Traversable.scala:105)
                                                  //| 	at day01session04.lists.Lists03HighOrderMethods01$$anonfun$main$1.apply$
                                                  //| mcV$sp(day01session04.lists.Lists03HighOrderMethods01.scala:28)
  
  //In Scala the wild card "_" can be used
  nums.map(_ * 2)
  
  //zip the indices with the numbers
  val tupleList = ???
  //tuples can be access with "tuple._1", "tuple._2" etc
  //print the tuple "index1:value2, index2:value2, ..."
  //tupleList.map(pair => ???)
  
  //the wildcard can be used only once, play with it
  //can you map both values in a tuple or only one?
  //tupleList.map(???)
  
  val words = List("scala", "is", "fun")
  //call map and use String.toList for each element
  val nestedList = ???
  //flatMap flattens the result
  words.flatMap(???)
  //nestedList.flatMap(???)
  
  //with foreach you can do something on each element. nothing is returned
  //print each element in nums
  ???
}