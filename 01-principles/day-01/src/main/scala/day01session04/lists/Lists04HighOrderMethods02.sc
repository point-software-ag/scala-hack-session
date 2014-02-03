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
object Lists04HighOrderMethods02 {
  //filter, partition, find, takeWhile, dropWhile, span
  //http://www.artima.com/pins1ed/working-with-lists.html#16.7

  //another way to create a list
  val nums = List.range(-5, 5)                    //> nums  : List[Int] = List(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4)

  //filter takes a predicate function f(x) and yields the elements where f(x) is true
  //filter all values greater than zero
  nums.filter(???)                                //> scala.NotImplementedError: an implementation is missing
                                                  //| 	at scala.Predef$.$qmark$qmark$qmark(Predef.scala:252)
                                                  //| 	at day01session04.lists.Lists04HighOrderMethods02$$anonfun$main$1.apply$
                                                  //| mcV$sp(day01session04.lists.Lists04HighOrderMethods02.scala:29)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at day01session04.lists.Lists04HighOrderMethods02$.main(day01session04.l
                                                  //| ists.Lists04HighOrderMethods02.scala:20)
                                                  //| 	at day01session04.lists.Lists04HighOrderMethods02.main(day01session04.li
                                                  //| sts.Lists04HighOrderMethods02.scala)
  val words = List("scala", "is", "fun")
  //filter all words greater equals than 3
  //words.???

  //find is like the filter but stops after the first predicate equals true
  //try the same expressions like for filter above
  nums.find(???)
  words.find(???)

  //Intermediate on Option
  //Note: it is possible that the result of find results to None. Therefore the result is wrapped into a Option
  //there are two case classes extending from Option: Some and None
  //Both can be used for pattern mattich
  
  //find a number > 0 and print if found
  //use pattern matching with cases None and Some(element)
//  nums.find(_ > 0) match {
//    ???
//    ???
//  }

  //find a word > 3 and return it as Some(List[Char])
//  words.find(_.length > 0) match {
//    ???
//  }
  
  //partition is like filter but separates the result into two lists
  //partition with elements greater than 0
//  nums.???
  //partition with words greater than 0
//  words.???


  //takeWhile takes each element until the predicate is false
  //take while until element greater than zero is found
//  List(1,2,3,0,3,2,1).???
  //dropWhile drops each elemen until the predicate is true
  //drop while until element greater than zero is found
//  List(1,2,3,0,3,2,1).???
  
  //split at position 3
  List(1,2,3,0,3,2,1).splitAt(3)
  //span is similar to the split
  //what expression is require to get the same result?
  List(1,2,3,0,3,2,1).span(???)
  
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
  }
  //try the same output using foreach
  ???
  //now try the same instead of a print returning a flat list containing 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5
  ???
}