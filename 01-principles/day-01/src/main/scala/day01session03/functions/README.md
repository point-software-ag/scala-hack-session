# Definition
"Lambda calculus (also written as λ-calculus) is a formal system... based on function abstraction and application using variable binding and substitution"
- Lambda syntax: f(x) => y
- https://en.wikipedia.org/wiki/Lambda_calculus

Like objects and values functions can be treated the same way. Functions can be passed to or returned from a function.

Example: function with parameters and without explicit type definitions 
```
  def callByName = 5                              //> callByName: => Int
  //no return type, instead type infererence using the return type of Int.+(): Int  
  def add(x: Int, y: Int) = x + y                 //> add: (x: Int, y: Int)Int
  add(40,2)                                       //> res0: Int = 42
  //explicit return type
  def f(): Unit = "this String gets lost"         //> f: ()Unit
  //missing / not required "="
  def g() { "this String gets lost too" }         //> g: ()Unit
  def h() = { "this String gets returned!" }      //> h: ()String
```

# Naming and calls
The naming conventions in Scala are less strict e.g. compared to Java.
The "+" operator is actually a function from Double. There are more functions like that:
Double.+(), Double.-(), Double.*(), Double.%(), etc.

Example: function calls
```
  2.*(2)                                          //> res0: Double(4.0) = 4.0
  2 * 2                                           //> res1: Int(4) = 4
  2f * 2                                          //> res2: Float(4.0) = 4.0
  2f * 2d                                         //> res3: Double(4.0) = 4.0
```

# Unnamed Literals
Of course it is also possible to define anonymous functions.
For example for returning a function instead of a value.

Example: 
```
  import scala.util.Random
  //unnamed literal
  (x: Int) => Random.nextInt(x)                   //> res0: Int => Int = <function1>
  //partial function: function 1 returns function2
  def random = (x: Int) => Random.nextInt(x)      //> random: => Int => Int
  //partial function call
  random(10)                                      //> res1: Int = 5
  random(2)                                       //> res2: Int = 0
```

# High-Order Functions
Since it is possible to pass and return functions. Here is a good example taken from Odersky's book providing helper functions for file name validations:

Example: Helper functions without high-order functions and duplicate code
```
  def filesEnding(query: String) =
    for (file <- filesHere; if file.getName.endsWith(query))
      yield file
  def filesContaining(query: String) =
    for (file <- filesHere; if file.getName.contains(query))
      yield file
  def filesRegex(query: String) =
    for (file <- filesHere; if file.getName.matches(query))
      yield file
```

As you can see all 3 functions are similar except the matching condition by using different method calls on a String:

*endsWith*, *contains*, and *matches*.

Scala's approach to solve this is passing a matching function.
The function has a file name as a input and a boolean as a output checking the filename with the appropriate String method:

f: String => Boolean 

Example: Helper functions using high-order functions
```
  //high-order function with a function as input
  private def filesMatching(matcher: String => Boolean) =
    for (file <- filesHere; if matcher(file.getName))
      yield file

  //high-order function usages:
  def filesEnding(query: String) =
    filesMatching(_.endsWith(query))

  def filesContaining(query: String) =
    filesMatching(_.contains(query))

  def filesRegex(query: String) =
    filesMatching(_.matches(query))
```

For a detailed explanation please have a look at this source: http://www.artima.com/pins1ed/control-abstraction.html

# Currying

Currying is the "technique of transforming a function that takes multiple arguments (or a tuple of arguments) in such a way that it can be called as a chain of functions...
Uncurrying ... can be seen as a form of defunctionalization. It takes a function f(x) which returns another function g(y) as a result, and yields a new function f′(x,y)"
Source: https://en.wikipedia.org/wiki/Currying

In Scala a curried functions is a partial function.

Example: f(x,y) -> curried -> f(x)(y) -> uncurried -> f(x,y)
```
  def add(x: Int, y: Int) = x + y                 //> add: (x: Int, y: Int)Int
  add(2,2)                                        //> res0: Int = 4
  add(2,3)                                        //> res1: Int = 5
  def first(x: Int) = (y:Int) => x + y            //> first: (x: Int)Int => Int
  val second = first(2)                           //> second  : Int => Int = <function1>
  second(2)                                       //> res2: Int = 4
  second(3)                                       //> res3: Int = 5
  first(2)(2)                                     //> res4: Int = 4
  def curried(x: Int)(y: Int) = x + y             //> curried: (x: Int)(y: Int)Int
  curried(2)(2)                                   //> res5: Int = 4
  curried(2)(3)                                   //> res6: Int = 5

  def second2(y: Int) = curried(2)(y)             //> second2: (y: Int)Int
  second2(3)                                      //> res43: Int = 5
  val second3 = curried(2) _                      //> second3  : Int => Int = <function1>
  second3(3)                                      //> res44: Int = 5
  val second3b: Int => Int = curried(2)           //> second3b  : Int => Int = <function1>
  second3b(3)                                     //> res45: Int = 5
  def first4(x: Int) = curried(x) _               //> first4: (x: Int)Int => Int
  def second4(y: Int) = first4(2)(y)              //> second4: (y: Int)Int
  second4(3)                                      //> res46: Int = 5
  
  def curried5(x: Int) = {
    def second(y: Int) = x + y
    second _
  }                                               //> curried5: (x: Int)Int => Int
  curried5(2)(3)                                  //> res47: Int = 5
  val first5 = curried5 _                         //> first5  : Int => (Int => Int) = <function1>
  val second5 = first5(2)                         //> second5  : Int => Int = <function1>
  second5(3)                                      //> res48: Int = 5
  first5(2)(3)                                    //> res49: Int = 5
  def curried5b(x: Int): Int => Int = {
    def second(y: Int) = x + y
    second
  }                                               //> curried5b: (x: Int)Int => Int

```

# Resources

Functions
- Define some functions: http://www.artima.com/pins1ed/first-steps-in-scala.html#step3
- Scala Functions: https://gleichmann.wordpress.com/2010/10/31/functional-scala-functions/
- How are functions treated in Scala? http://java.dzone.com/articles/how-are-functions-treated
- How do you define a type for a function in Scala? http://stackoverflow.com/questions/1853868/how-do-you-define-a-type-for-a-function-in-scala

First-class functions
- "A function literal is compiled into a class"
- http://www.artima.com/pins1ed/functions-and-closures.html#8.3

High-Order functions
- Control Abstraction: http://www.artima.com/pins1ed/control-abstraction.html

Currying
- "A curried function is applied to multiple argument lists"
- http://www.artima.com/pins1ed/control-abstraction.html#9.3