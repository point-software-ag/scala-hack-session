Exercises: A Simple Calculator
======================

In this first exercise you will put altogether you have learned so far. Instead of worksheets you will put your code into classes and objects.
You will also define a Scala singleton object with a main method allowing you to start it as a Scala application. 

In the code skeletons you will find an object definition with a main method. In your IDE just do a right click > Run As > Scala Application

Example: main() method for starting as a Scala Application
```
object ScalaApp {
  def main(args: Array[String]) {
    val instance = new ScalaFun
    println("> " + instance + ": " + ScalaFun.dateFormat.format(instance.constructionTime))
  }
}
```


# Objects
Now let's test your skill so far and free your limitations as a Java developer and introduce object classes ;)

Example: Definition and Construction
```
  object ScalaFun1
  object ScalaFun2 {}
  object ScalaFun3 { val message = "Hello, Scala" }
  ScalaFun3.message                               //> res0: String = Hello, Scala
  //compile error, since other constructor definitions are not allowed
  object ScalaFun4 {
    var message = "Hello, Scala"
    def this(anotherMessage: String) {
      this()
      this.message = anotherMessage
    }
  }
```

# Calculator
Let's get back to elementary school. Remember you always like to cheat
and use your calculator instead of your useless brain? Now is your chance...
Implement a calculator with the operators add, minus, multiply and divide.

Example: Skeleton from the exercise
```
object Calculator {
  def add(a: Double, b: Double) = ???

  def subtract(a: Int, b: Double) = ???

  def multiply(a: Double, b: Double) = ???

  def divide(a: Double, b: Double) = ???
  
}
```

# Resources

Classes and Case Classes
- Classes: http://docs.scala-lang.org/tutorials/tour/classes.html
- Case Classes: http://docs.scala-lang.org/tutorials/tour/case-classes.html
