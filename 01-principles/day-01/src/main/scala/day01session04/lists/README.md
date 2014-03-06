List Methods
======================

# Basic Methods: Construction, Concatenation, Methods like head, tail, last, etc.

Example: Lists methods - head, tail, init, last, reverse, take, and drop
```
  val fibonacci = 1 :: 2 :: 3 :: 5 :: 8 :: 13 :: 21 :: 34 :: 55 :: 89 :: Nil
                                                  //> fibonacci  : List[Int] = List(1, 2, 3, 5, 8, 13, 21, 34, 55, 89)
  println(s"5th fibonacci number is ${fibonacci(4)}")
                                                  //> 5th fibonacci number is 8
  //concatenation
  1 :: fibonacci                                  //> res0: List[Int] = List(1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89)
  fibonacci.head                                  //> res1: Int = 1
  //lists all except head
  fibonacci.tail                                  //> res2: List[Int] = List(2, 3, 5, 8, 13, 21, 34, 55, 89)
  //lists all except last
  fibonacci.init                                  //> res3: List[Int] = List(1, 2, 3, 5, 8, 13, 21, 34, 55)
  fibonacci.last                                  //> res4: Int = 89
  fibonacci.init.last                             //> res5: Int = 55
  fibonacci.drop(9)                               //> res6: List[Int] = List(89)
  fibonacci.take(9)                               //> res7: List[Int] = List(1, 2, 3, 5, 8, 13, 21, 34, 55)
```

Example: some more complex operations: continous calls, splitAt, reverse, and flatten
```
  //next fibonacci number
  val next = fibonacci.init.last + fibonacci.last //> next  : Int = 144
  //concat element :: list
  (next :: fibonacci.reverse).reverse             //> res8: List[Int] = List(1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144)
  //concat list1 :: list2
  fibonacci ::: List(next)                        //> res9: List[Int] = List(1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144)
  fibonacci splitAt 5                             //> res10: (List[Int], List[Int]) = (List(1, 2, 3, 5, 8),List(13, 21, 34, 55, 89
                                                  //| ))
  val nested = List(fibonacci.splitAt(5)._1, fibonacci.splitAt(5)._2)
                                                  //> nested  : List[List[Int]] = List(List(1, 2, 3, 5, 8), List(13, 21, 34, 55, 8
                                                  //| 9))
  nested.flatten                                  //> res11: List[Int] = List(1, 2, 3, 5, 8, 13, 21, 34, 55, 89)
```

Example: operations exist also on String
```
  val palindrome = "Never odd or even"            //> palindrome  : String = Never odd or even
  palindrome.head                                 //> res0: Char = N
  palindrome.reverse                              //> res1: String = neve ro ddo reveN
  palindrome.splitAt(11)._2.reverse               //> res2: String = neve r
```


# Basic Methods: pattern matching on different list structures (empty, one element, n elements, etc.).

Example: zipping elements with its index into a tuple
```
  val numbers = List("zero", "one", "two", "three")
                                                  //> numbers  : List[String] = List(zero, one, two, three)
  for (index <- numbers.indices) {
    val word = numbers(index)
    println(s"Human> Computer! Say '$index'; Computer> **$word**")}
                                                  //> Human> Computer! Say '0'; Computer> **zero**
                                                  //| Human> Computer! Say '1'; Computer> **one**
                                                  //| Human> Computer! Say '2'; Computer> **two**
                                                  //| Human> Computer! Say '3'; Computer> **three**
  println("Range of natural numbers: " + numbers.mkString("] ", ", ", "... ]"))
                                                  //> Range of natural numbers: ] zero, one, two, three... ]
  //tuples of (Int, String)
  numbers.indices.zip(numbers)                    //> res0: scala.collection.immutable.IndexedSeq[(Int, String)] = Vector((0,zero)
                                                  //| , (1,one), (2,two), (3,three))
```

Example: use patter matching for checking list structures 
```
  numbers match {
    case head :: tail => println(s"$head :: $tail = $numbers")
    case Nil => println("Empty List")
  }                                               //> zero :: List(one, two, three) = List(zero, one, two, three)
```

# High-Order Methods: map, flatMap, foreach

The most common usage of collections are iteration over each element and do some operation.
The map and flatMap operations allow element manipulation. They allow doing further operations on the new returned collection.

## List.map
Example: rounding and converting double values into integers 
```
  val doubleValues = List(2.0, 2.7)               //> doubleValues  : List[Double] = List(2.0, 2.7)
  doubleValues.map(_ + .5).map(_.intValue)        //> res0: List[Int] = List(2, 3)
  //or without dots
  doubleValues map (_ + .5) map (_.intValue)      //> res1: List[Int] = List(2, 3)
```

Example: increments big decimals in one-tenth steps
```
  val numbers = List(BigDecimal(2.0), BigDecimal(2.7))
                                                  //> numbers  : List[scala.math.BigDecimal] = List(2.0, 2.7)
  numbers.map(bigDecimal => for (count <- bigDecimal.to(bigDecimal + 0.5, 0.1)) yield count)
                                                  //> res0: List[scala.collection.immutable.IndexedSeq[BigDecimal]] = List(Vector(
                                                  //| 2.0, 2.1, 2.2, 2.3, 2.4, 2.5), Vector(2.7, 2.8, 2.9, 3.0, 3.1, 3.2))
```

## List.flatMap 
Example: same example except the result list is flat
```
  numbers.flatMap(bigDecimal =>for (count <- bigDecimal.to(bigDecimal + 0.5, 0.1)) yield count)
                                                  //> res0: List[BigDecimal] = List(2.0, 2.1, 2.2, 2.3, 2.4, 2.5, 2.7, 2.8, 2.9, 3
                                                  //| .0, 3.1, 3.2)
```

## List.foreach
Example: prints every element in the list
```
  numbers.foreach(println(_))                     //> 2.0
                                                  //| 2.7
```

# High-Order Methods: filter, find, partition, span, etc.

## List.filter
Example: filter all even numbers
```
  val list = (1 to 10).toList                     //> list  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  list.filter(_ % 2 == 0)                         //> res0: List[Int] = List(2, 4, 6, 8, 10)
```

## List.find
Example: find is like filter but stops after the first true condition
```
  val result = list.find(element => element > 3 && element % 3 == 0)
                                                  //> result  : Option[Int] = Some(6)
  result match {
    case Some(element) => println(element + ": found")
    case None => println("Not in list")
  }                                               //> 6: found
```

## List.partition
Example: 
```
  val result = list.partition(element => element > 3 && element % 3 == 0)
                                                  //> result  : (List[Int], List[Int]) = (List(6, 9),List(1, 2, 3, 4, 5, 7, 8, 10))
```

## List.takeWhile
Example: take all elements while predicate is true
```
  val result = list.takeWhile(_ < 6)              //> result  : List[Int] = List(1, 2, 3, 4, 5)
```

## List.dropWhile
Example: drop all elements while predicate is true
```
  val result = list.dropWhile(_ < 6)              //> result  : List[Int] = List(6, 7, 8, 9, 10)
```

## List.span
Example: span a combination of takeWhile and dropWhile
```
  val result = list.span(_ < 6)                   //> result  : (List[Int], List[Int]) = (List(1, 2, 3, 4, 5),List(6, 7, 8, 9, 10))
```

## List.foreach
Unlike other list operations the foreach does not create a new list.

Example:
```
  val result = list.foreach(element => if (element % 3 == 0) println(element))
                                                  //> 3
                                                  //| 6
                                                  //| 9
                                                  //| result  : Unit = ()
```

# Resources

Working with Lists
- http://www.artima.com/pins1ed/working-with-lists.html
- http://alvinalexander.com/scala/scala-list-class-examples

Higher-Order Functions
- Higher-order methods on class List: http://www.artima.com/pins1ed/working-with-lists.html#16.7
- http://www.scala-lang.org/old/node/134
