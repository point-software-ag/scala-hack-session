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


# Singleton Objects
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

# Interlude - Implicit conversions
Look at the source code of the [second exercise](./FirstStepsExercise02Calculator.scala):
```
object Calculator {
  def add(a: Double, b: Double) = ???
  ...
}

object CalcApplication {
  ...
  def main(args: Array[String]) {
    val a = 6
    val b = 3
    ...
    println(s"$a + $b = ${add(a,b)}")
    ...
  }
}
```
Both values a and b are of type Int and the methods add, subtract, multiply, and divide require Double as input parameters.

How does Scala deal with this? If you look into [Int's ScalaDoc](http://www.scala-lang.org/api/current/#scala.Int) you find this:
```
implicit def int2double(x: Int): Double = x.toDouble
```
[Implicit conversions](http://www.artima.com/pins1ed/implicit-conversions-and-parameters.html) are one of the most powerful features in Scala. It allows in Scala (as a <u><b>sca</b></u>lable <u><b>la</b></u>nguage) to extend existing classes - and not only new ones. In this example the Scala compiler converts these methods calls into the following:
<ol>
<li>'add(a,b)' converts to 'add(int2double(a),int2double(b))'</li>
<li>'subtract(a,b)' compiles to 'subtract(int2double(a),int2double(b))'</li>
<li>'multiply(a,b)' compiles to 'multiply(int2double(a),int2double(b))'</li>
<li>'divide(a,b)' compiles to 'divide(int2double(a),int2double(b))'</li>
</ol>

You can read more on implicits [here](http://pietrowski.info/2009/07/scala-implicit-conversion/) and [here](http://java.dzone.com/articles/implicit-conversions-scala).

# Resources

Implicit conversions
- [a simple example explaining how to extend Int with a 'times(f: => T)' method allowing to execute any method x times like '5 times println("Hi")'](http://docs.scala-lang.org/overviews/core/implicit-classes.html)
- [Implicit Conversions and Parameters](http://www.artima.com/pins1ed/implicit-conversions-and-parameters.html)
- [Blog: Scala Implicit Conversion](http://pietrowski.info/2009/07/scala-implicit-conversion/)
- [DZone: Implicit Conversions in Scala](http://java.dzone.com/articles/implicit-conversions-scala)
- Scala DSL for Basic:
-- Blog/How-to: http://blog.code-cop.org/2010/01/scala-dsl-for-basic.html
-- GitHub project 'baysick': https://github.com/fogus/baysick 
