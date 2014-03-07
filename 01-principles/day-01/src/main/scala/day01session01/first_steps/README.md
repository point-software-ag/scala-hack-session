In this exercise you learn to work with a worksheet.

Simply said: a worksheet is an interactive shell. You can enter Scala code in the worksheet and it gets interpreted with immediate results. So let's try it out!

# Expressions
Example: Simple expressions like +, *, etc.
```
  42 / 7                                          //> res6: Int(6) = 6
  40 / 7                                          //> res7: Int(5) = 5
  40d / 7                                         //> res8: Double(5.714285714285714) = 5.714285714285714
```

# 'val' and 'var' Variables
Enter the chambers of constant (val) and assignable (var) variables. But remember: "var"s may be nice... but keep in mind: to get a Scala Jedi a best practice is to avoid vars and use only vals as far as possible.

Example: Values - constant variables
```
  val number1 = 1                                 //> number1  : Int = 1
  val number2: Double = 2                         //> number2  : Double = 2.0
  val number3: BigDecimal = 2                     //> number3  : BigDecimal = 2
  val number4 = number1 + number2 + number3       //> number4  : scala.math.BigDecimal = 5.0
```

Example: mutable variables
```
  var i = 0                                       //> i  : Int = 0
  while (i < 2) {
    println(i)
    i += 1
  }                                               //> 0
                                                  //| 1
```

# Classes
Creating your own fun world by defining classes. Use case classes as the sugar in your world!

Example: Class definitions
```
  class ScalaFun1
  new ScalaFun1                                   //> res0: test.ScalaFun1 = test$$anonfun$main$1$ScalaFun1$1@23964a8d
  class ScalaFun2 {}
  new ScalaFun2                                   //> res1: test.ScalaFun2 = test$$anonfun$main$1$ScalaFun2$1@33ec79b6
  class ScalaFun3 { val message = "Hello, Scala" }
  (new ScalaFun3).message                         //> res2: String = Hello, Scala
  class ScalaFun4 {
    var message = "Hello, Scala"
    def this(anotherMessage: String) {
      this()
      this.message = anotherMessage
    }
  }
  (new ScalaFun4).message                         //> res3: String = Hello, Scala
  (new ScalaFun4("Hello")).message                //> res4: String = Hello
```

# Resources

First Steps in Scala
- Video: [First steps with Scala from the Devoxx 2012](http://parleys.com/play/5148922b0364bc17fc56ca20/chapter0/about)
- [Programming in Scala](http://www.artima.com/pins1ed/first-steps-in-scala.html): Learn using the interpreter, expressions, define variables, and functions

Scala Interpreter
- [Step-by-step in the IDE](http://scala-ide.org/docs/current-user-doc/features/scalainterpreter/index.html#starting-the-interpreter)
- [Online Interpreter](https://codebrew.io/): A Scala worksheet in your browser

Arithmetic operations
- [Infix operations](http://www.artima.com/pins1ed/basic-types-and-operations.html#5.4)
- [Prefix (+, -, !, and ~) and postfix (parameterless methods) operations](http://www.artima.com/pins1ed/basic-types-and-operations.html#5.3)

Values and Variables
- [Immutable val vs. mutable var](http://www.scala-lang.org/old/node/5367)
- [What is the difference between a var and val definition in Scala?](http://stackoverflow.com/questions/1791408/what-is-the-difference-between-a-var-and-val-definition-in-scala)
- [How can I avoid mutable variables in Scala when using ZipInputStreams and ZipOutpuStreams?](http://stackoverflow.com/questions/2849303/how-can-i-avoid-mutable-variables-in-scala-when-using-zipinputstreams-and-zipout)
- [Avoid var using Stream with code example](http://louisbotterill.blogspot.de/2009/09/scala-guis-simple-maze-generator-and.html)
- [Why is an initial assignment for val and var required?](http://stackoverflow.com/questions/6582605/scala-val-and-var-related-question-and-scala-requiring-me-to-assign-a-value-at-d#6582768): Variables in Scala/functional languages are named expressions, unlike other languages where a variable is a memory address

Classes and Case Classes
- [Classes and Objects](http://www.artima.com/pins1ed/classes-and-objects.html)
- [Classes](http://docs.scala-lang.org/tutorials/tour/classes.html)
- [Case Classes](http://docs.scala-lang.org/tutorials/tour/case-classes.html)
