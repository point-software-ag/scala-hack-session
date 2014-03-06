Built-in Control Structures
======================
Scala has only few built-in control structures: if, while, for, try, match, and function calls.
Instead it encourages you to define your own control abstractions using functions: high-order functions.
In the next session covering functions you will learn how to do this.

# While Loops
While loops consists of two parts: a condition and a body. The body is executed as long the condition is true.

Example: character processing
```
  val message = "Hello, Scala"                    //> message  : String = Hello, Scala
  var i = 0                                       //> i  : Int = 0
  while (i<message.size) {
    println(message(i))
    i += 1
  }                                               //> H
                                                  //| e
                                                  //| l
                                                  //| l
                                                  //| o
                                                  //| ,
                                                  //|  
                                                  //| S
                                                  //| c
                                                  //| a
                                                  //| l
                                                  //| a

```

Read here for more details on while loops: http://www.artima.com/pins1ed/builtin-control-structures.html#7.2

# For expressions
This is probably the most used expression in Scala. It is a "Swiss army knife of iteration".
Example: Fibonacci
```
  var current = 1                                 //> current  : Int = 1
  var previous = 1                                //> previous  : Int = 1
  for (i <- 1 to 10) {
    print(current + ", ")
    val next = previous + current
    previous = current
    current = next
  }                                               //> 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 
  println                                         //> 
```
Read here for more details on for loops: http://www.artima.com/pins1ed/builtin-control-structures.html#7.3

# Pattern Matching - Match Expressions
Match expressions are like switch statements in Java except it can take any constant.

Example: true-false matching
```
  val bankBalance = -100                          //> bankBalance  : Int = -100
  bankBalance < 0 match {
    case true => println("I owe the bank " + (-bankBalance) + " Euros (plus some interests).")
    case false => println("The bank generously deposits my " + bankBalance + " Euros (for a small fee)!")
  }                                               //> I owe the bank 100 Euros (plus some interests).
```
Example: value matching
```
  val number = Random.nextInt(100)                //> number  : Int = 40
  val oddOrEven = number % 2                      //> oddOrEven  : Int = 0
  oddOrEven match {
    case 0 => println(number + " is an even number!")
    case _ => println(number + " is an odd number!")
  }                                               //> 40 is an even number!
```

Read more here: http://www.artima.com/pins1ed/builtin-control-structures.html#7.5

# Resources

Built-in Control Structures
- http://www.artima.com/pins1ed/builtin-control-structures.html