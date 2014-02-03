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
object Lists04HighOrderMethods02 {
  //filter, partition, find, takeWhile, dropWhile, span
  //http://www.artima.com/pins1ed/working-with-lists.html#16.7

  //another way to create a list
  val nums = List.range(-5, 5)                    //> nums  : List[Int] = List(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4)

  //filter takes a predicate function f(x) and yields the elements where f(x) is true
  //filter all values greater than zero
  nums.filter(_ > 0)                              //> res0: List[Int] = List(1, 2, 3, 4)
  val words = List("scala", "is", "fun")          //> words  : List[String] = List(scala, is, fun)
  //filter all words greater equals than 3
  words.filter(_.length >= 3)                     //> res1: List[String] = List(scala, fun)

  //find is like the filter but stops after the first predicate equals true
  //try the same expressions like for filter above
  nums.find(_ > 0)                                //> res2: Option[Int] = Some(1)
  words.find(_.length >= 3)                       //> res3: Option[String] = Some(scala)

  //Intermediate on Option
  //Note: it is possible that the result of find results to None. Therefore the result is wrapped into a Option
  //there are two case classes extending from Option: Some and None
  //Both can be used for pattern mattich

  //find a number > 0 and print if found
  //use pattern matching with cases None and Some(element)
  nums.find(_ > 0) match {
    case None => println("Nothing found")
    case Some(element) => println(element + " found")
  }                                               //> 1 found

  //find a word > 3 and return it as Some(List[Char])
  words.find(_.length > 0) match {
    case None =>
      println("Nothing found"); None
    case Some(element) =>
      println(element + " found")
      Some(element.toList)
  }                                               //> scala found
                                                  //| res4: Option[List[Char]] = Some(List(s, c, a, l, a))

  //partition is like filter but separates the result into two lists
  //partition with elements greater than 0
  nums.partition(_ > 0)                           //> res5: (List[Int], List[Int]) = (List(1, 2, 3, 4),List(-5, -4, -3, -2, -1, 0
                                                  //| ))
  //partition with words greater than 0
  words.partition(_.length >= 3)                  //> res6: (List[String], List[String]) = (List(scala, fun),List(is))

  //takeWhile takes each element until the predicate is false
  //take while until element greater than zero is found
  List(1, 2, 3, 0, 3, 2, 1) takeWhile (_ > 0)     //> res7: List[Int] = List(1, 2, 3)
  //dropWhile drops each elemen until the predicate is true
  //drop while until element greater than zero is found
  List(1, 2, 3, 0, 3, 2, 1) dropWhile (_ > 0)     //> res8: List[Int] = List(0, 3, 2, 1)

  //split at position 3
  List(1, 2, 3, 0, 3, 2, 1).splitAt(3)            //> res9: (List[Int], List[Int]) = (List(1, 2, 3),List(0, 3, 2, 1))
  //what expression is require to get the same result?
  List(1, 2, 3, 0, 3, 2, 1) span (_ > 0)          //> res10: (List[Int], List[Int]) = (List(1, 2, 3),List(0, 3, 2, 1))

  //recap on for expression in "Control Structures"
  //1
  //22
  //333
  //4444
  //55555
  for {
    row <- 1 to 5
    column <- 1 to row
  } {
    print(row)
    if (column == row) println
  }                                               //> 1
                                                  //| 22
                                                  //| 333
                                                  //| 4444
                                                  //| 55555
  //try the same output using foreach
  (1.to(5)).foreach(element => (1 to element).foreach{count => print(element); if (count == element) println})
                                                  //> 1
                                                  //| 22
                                                  //| 333
                                                  //| 4444
                                                  //| 55555
  //now try the same instead of a print returning a flat list containing 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5
  (1 to 5).flatMap(element => (1 to element).map(_ => element))
                                                  //> res11: scala.collection.immutable.IndexedSeq[Int] = Vector(1, 2, 2, 3, 3, 3
                                                  //| , 4, 4, 4, 4, 5, 5, 5, 5, 5)
}