This first session is separated into three worksheets. I recommend you to have a look at some resources I have listed below .

If you are a beginner you can watch this [First steps with Scala](http://parleys.com/play/5148922b0364bc17fc56ca20/chapter0/about) from the Devoxx 2012. Here are two step-by-step introductions regarding the [Scala interpreter](http://scala-ide.org/docs/current-user-doc/features/scalainterpreter/index.html#starting-the-interpreter) for the Scala IDE and in [Chapter 2, Programming in Scala](http://www.artima.com/pins1ed/first-steps-in-scala.html) you can walk through the interpreter, variables, functions, loops, and iterations.

# Worksheets
You can find the Scala Worksheet project on [Github](https://github.com/scala-ide/scala-worksheet). A Worksheet - as stated on their [Wiki page](https://github.com/scala-ide/scala-worksheet/wiki/Getting-Started#wiki-getting-started) is:
> '... a Scala file that is evaluated on save, and the result of each expression is shown in a column to the right of your program. Worksheets are like a REPL session on steroids, and enjoy 1st class editor support: completion, hyperlinking, interactive errors-as-you-type, auto-format, etc.'

In the first worksheek I introduce the [print line function 'println'](./solution/FirstSteps01Expressions.sc#L21:L38).

The println function is a member of the [Predef](http://www.scala-lang.org/api/current/#scala.Predef$) class. As noted [here](http://www.artima.com/pins1ed/classes-and-objects.html#4.4) the Predef class is implicitly imported - along with the java.lang and [scala](http://www.scala-lang.org/api/current/#scala.package) package.

The println exercise in the worksheet was easy. But have you tried to nest a println into another println? Like this::
```
  println(println(1))                             //> 1
                                                  //| ()
```

It outputs two lines:
```
1
()
```

Why is that so? If you look in the ScalaDoc of <a href="http://www.scala-lang.org/api/current/#scala.Predef$">Predef</a> you find this:
```
def println(x: Any): Unit 
```

The result being returned is a singleton object <a href="http://www.scala-lang.org/api/current/#scala.Unit">Unit</a>. Unlike Java where a 'void' defines 'nothing is returned' in Scala - being a functional (and object-oriented) language - <a href="http://docs.scala-lang.org/tutorials/scala-for-java-programmers.html#everything_is_an_object">everything is an object</a>. In fact doing Java calls Scala <a href="http://www.artima.com/pins1ed/first-steps-in-scala.html#step3">maps void to an Unit</a> object. An interesting blog aboug 'Void vs Unit' can be found <a href="http://james-iry.blogspot.ch/2009/07/void-vs-unit.html">here</a>.

# Arithmetic Operators
Like in many other languages you can do [arithmetic operations](./solution/FirstSteps01Expressions.sc#L40:L999)

As you can see the Scala interpreter outputs the result immediately. For educational purpose try playing with brackets like above:
```
2 + 5 * 8
2 + (5 * 8)
(2 + 5) * 8
```

I recommend you for each new topic you have learned to experiment with it in a worksheet.

In Scala there are three kinds of calls: [infix](http://www.artima.com/pins1ed/basic-types-and-operations.html#5.4), [unary prefix, and postfix](http://www.artima.com/pins1ed/basic-types-and-operations.html#5.3) operations.

## Infix operations
An infix operator is a method sitting between the object and the parameter(s):
https://gist.github.com/taitruong/9486062

## Unary prefix operations
A prefix operator is to the left of an operand:
https://gist.github.com/taitruong/9486096

## Postfix operations
A postfix operator is similar to an infix operator except it is without an argument:
https://gist.github.com/taitruong/9486112

All the above mentioned infix, prefix, and postfix operators can alternatively be called in a method style call. In fact, an operator is just another way and syntax how to do a method call. A '1 + 1' is the same when doing a method call '1.+(1)'. If you look in the ScalaDoc for [Int](http://www.scala-lang.org/api/current/#scala.Int) you can see that there are several overloaded '+()' methods returning and taking different parameter types like Int, Double, Long, Float, Char.
https://gist.github.com/taitruong/9465189

Please note: the methods for prefix operators starts with 'unary_' like 'unary_!'. In Scala there are only four prefix operators: +, -, !, and ~. This means you cannot define a new prefix operator like 'MyClass.unary_=' and use it like '=myClass'.

For further studies have a look at the [Scala documentation](http://docs.scala-lang.org/tutorials/tour/operators.html) and [Chapter 5 of Programming in Scala, 'Basic Types and Operations'](http://www.artima.com/pins1ed/basic-types-and-operations.html).

# 'val' and 'var' Variables
[worksheet solution](./solution/FirstSteps02Variables.sc#L23:L999)

In Scala you can define immutable and mutable variables - also called 'values' and 'variables'. The keyword for an immutable variable is 'val' and 'var' for a mutable variable:
https://gist.github.com/taitruong/9465605

In the 2nd line you can see that for the mutable variable the type is not defined - unlike line 1 where 'val immutable: String' is explicitly defined as a String. Scala's compiler uses [type inferences](http://docs.scala-lang.org/tutorials/tour/local-type-inference.html). This means that for variable assignments it deduces the type by its initial expression or by the return type of a method.

Compared to Java [variable scopes in Scala](http://www.artima.com/pins1ed/builtin-control-structures.html#7.7) go even further:
https://gist.github.com/taitruong/9465709

Here it is possible to have the same variable name in another scope (here: in the if expression in curled braces). For readability this should be avoided.

For further studies have a look at this nice [blog tutorial](http://tutorials.jenkov.com/scala/variables.html).

# Interlude - Semicolon, parenthesis and curled braces
As you can see you may omit the semicolon at the end of a line. In most cases it is fine to omit it. You can even split up an operator into two lines. Here is an example with the operator 'a = a + 1' in one line:
https://gist.github.com/taitruong/9466025

Now I can split the operator into two lines:
https://gist.github.com/taitruong/9466102

[Quiz] What is wrong here?

[Answer] Here the line 'if (a < 10) a = a' is interpreted as whole and the next line '+ 1' as a prefix operator. The solution for this is to use parenthesis:
https://gist.github.com/taitruong/9466336

For better readability you can use curled braces embracing the if body:
https://gist.github.com/taitruong/9466441

The following example might look unusual for you - the curled braces covers the expression and not the whole if body:
https://gist.github.com/taitruong/9466514

In the functional paradigm all functions are values and return values. We will cover this topic later when we come to the definitions of a method representing a function. In this example the curled braces embodies lines of code expressions for assigning variable and where the last line as a result is returned and assigned to variable a.

Read further here:
- [Scala Wonderland: Semicolons, Singletons and Companion Objects](http://java.dzone.com/articles/scala-wonderland-semicolons)
- [Semicolon inference](http://www.artima.com/pins1ed/classes-and-objects.html#4.2)

# Classes
In its simplest way you can define and instantiate classes like this:
https://gist.github.com/taitruong/9466924

Here there is only one constructor defined. It is the primary constructor and in this case it comes with an argument. In Scala you can omit the parentheses for empty constructors and parameterless methods.

A convenient way of defining a class with variables is using this constructor:
https://gist.github.com/taitruong/9466991

This way you have defined a class with a primary constructor requiring parameters. If you try to instantiate this class without any param ('new ScalaFun()') you will get a compile error.

For having [overloaded constructors](http://stackoverflow.com/questions/1095329/scala-constructor-overload) you have to define it like this:
https://gist.github.com/taitruong/9467067

You can read more about primary and auxiliary constructors in this [blog](http://www.javabeat.net/primary-auxiliary-constructors-scala/) and classes in [Odersky's Scala book](http://www.artima.com/pins1ed/classes-and-objects.html#4.1). In this example there are two points that need to be outlined:
* Instance variables have to be initialized. A 'var x' instead of a 'var x = 0' will lead into a compile error. If you don't want them to be initialized you need to prefix the class with the keyword 'abstract'.
* An auxiliary constructors must always call a primary or another auxiliary constructor at first. This ensures the primary constructor to be the sole entry point of the class.

Further you can define default values in a constructor and method:
https://gist.github.com/taitruong/9467246

My class in the [worksheet solution](./solution/FirstSteps03Classes.sc#L28:L43) of this session contains three variables (instance members) and two constructors.

# Case Classes
The case class example has been taken and modified from the [Scala book](http://www.artima.com/pins1ed/case-classes-and-pattern-matching.html#lst:case-classes):
[worksheet](./solution/FirstSteps03Classes.sc#L62:L66)

As stated in the book:
> '... Case classes are Scala's way to allow pattern matching on objects without requiring a large amount of boilerplate. In the common case, all you need to do is add a single case keyword to each class that you want to be pattern matchable.'

In this example we have three case classes ('Var', 'Number', 'VarNumber') derived from the abstract class 'Expr'. The Scala compiler automatically adds three conveniences to a case class:
1. Factory method: allows to create a case class with 'MyCaseClass()' without the 'new' keyword like 'val myVar = Var("myVar")'.
2. Val prefix: all parameters get maintained as fields by prefix them with a val. They can then be accessed like 'myVar.name'.
3. Adds implementations for toString, hash, and equals.

# Exercise - A Simple Calculator
In this first exercise you will put altogether you have learned so far. Instead of worksheets you will put your code into classes and objects. You will also define a Scala singleton object with a main method allowing you to start it as a Scala application. Please have a look at the [readme](../../day01session01exercise/first_steps/README.md#L6:L19).

## Exercise 1: Singleton Objects
Scala is compared to Java [more object-oriented](http://docs.scala-lang.org/tutorials/scala-for-java-programmers.html#everything_is_an_object) in that it has no static members (class members) but instance members - instead it has [singleton objects](http://www.artima.com/pins1ed/classes-and-objects.html#4.3): along with the keyword 'class' you can also define an 'object' [(readme)](../../day01session01exercise/first_steps/README.md#L22:L36).

In this exercise this is the first time I define a Scala class instead of working with a worksheet. At the beginning I define a class ScalaFun:
[FirstStepsExercise01Objects.scala](../../day01session01exercise/first_steps/solution/FirstStepsExercise01Objects.scala#L26:L39)

In Scala it is possible to define several classes and objects in the same file. In my case I define a singleton object ScalaFun:
[FirstStepsExercise01Objects.scala](../../day01session01exercise/first_steps/solution/FirstStepsExercise01Objects.scala#L48:L55)

In case a class and an object have the same name it is called the companion class and the companion object.

Finally there is another object definition in this file. In this case it is a singleton object without a companion class:
[FirstStepsExercise01Objects.scala](../../day01session01exercise/first_steps/solution/FirstStepsExercise01Objects.scala?slice=61:L999)

This standalone singleton object has a main method and allows to run it as a [Scala application](http://www.artima.com/pins1ed/classes-and-objects.html#4.4) for example in your Scala IDE. The main method has two lines of code doing the following:
1. Line 1: a new instance of the companion class ScalaFun is created and assigned to the val 'instance'.
2. Line 2: the instance is printed using the companion object's member ScalaFun.dateFormat to output the instance' construction time as well.</li>

As a result I get the following output on my console:
```
> day01session01exercise.first_steps.solution.ScalaFun@5dccb1ae: 11:03:2014 11:46:09:027
```

# Exercise 2: Calculator
This last exercise wraps up your first lesson about arithmetic operations into a singleton:
[FirstStepsExercise02Calculator.scala](../../day01session01exercise/first_steps/solution/FirstStepsExercise02Calculator.scala#L21:L30)

The second singleton allows me to test and output my results:
[FirstStepsExercise02Calculator.scala](../../day01session01exercise/first_steps/solution/FirstStepsExercise02Calculator.scala#L32:L999)

As a result I get this on the console:
```
6 + 3 = 9.0
6 - 3 = 3.0
6 * 3 = 18.0
6 / 3 = 2.0
```

# Interlude - Implicit Conversions
[Quiz] If you examine the code you might find something interesting: hover over the values of 'a' and 'b' and compare it with the methods where are they are passed to. Do you see the difference?

[Answer] Both values a and b are of type Int and the methods add, subtract, multiply, and divide require Double as input parameters.

How does Scala deal with this? If you look into [Int's ScalaDoc](http://www.scala-lang.org/api/current/#scala.Int) you find this:
```
implicit def int2double(x: Int): Double = x.toDouble
```

[Implicit conversions](http://www.artima.com/pins1ed/implicit-conversions-and-parameters.html) are one of the most powerful features in Scala. It allows in Scala (as a _*sca*_lable _*la*_nguage) to extend existing classes - and not only new ones. In this example the Scala compiler converts these methods calls into the following:
1. 'add(a,b)' converts to 'add(int2double(a),int2double(b))'
2. 'subtract(a,b)' compiles to 'subtract(int2double(a),int2double(b))'
3. 'multiply(a,b)' compiles to 'multiply(int2double(a),int2double(b))'
4. 'divide(a,b)' compiles to 'divide(int2double(a),int2double(b))'

In the [ScalaDoc](http://docs.scala-lang.org/overviews/core/implicit-classes.html) there is a simple example explaining how to extend Int with a 'times(f: => T)' method allowing to execute any function f times like '5 times println("Hi")'. Here in this ['Baysick' project](https://github.com/fogus/baysick) is a nice example of showing how Scala is extended with the Basic language. There is a [similar blog](http://blog.code-cop.org/2010/01/scala-dsl-for-basic.html) explaining in how to define Basic elements in more detail. You can read more on implicits [here](http://pietrowski.info/2009/07/scala-implicit-conversion/) and [here](http://java.dzone.com/articles/implicit-conversions-scala) as well. 

# Next: Control Structures
Today you have learned that a worksheet is a file that interprets and output your Scala code immediately - like Scala's interpreter. In these worksheets you have make your first steps in doing some arithmetic operations, defining immutable vals and mutable vars. In the exercises you comprehend your Scala know-how including classes and singleton objects in writing a simple calculator.

So far so good. In the next session I will talk about control structures. This covers while loops and for expressions. In the meanwhile you can of course work your way through the [next hack session](../../day01session02/control_structures).

# Resources

Cheatsheets
- [Java developer’s Scala cheatsheet – One huge Scala reference card](http://mbonaci.github.io/scala/)
- [Scalacheat](http://docs.scala-lang.org/cheatsheets/)

First Steps in Scala
- Video: [First steps with Scala from the Devoxx 2012](http://parleys.com/play/5148922b0364bc17fc56ca20/chapter0/about)
- [Programming in Scala](http://www.artima.com/pins1ed/first-steps-in-scala.html): Learn using the interpreter, expressions, define variables, and functions
- [A Scala Tutorial for Java Programmers](http://docs.scala-lang.org/tutorials/scala-for-java-programmers.html)

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

Semicolon Inference
- http://www.artima.com/pins1ed/classes-and-objects.html#4.2

Classes and Case Classes
- [Classes and Objects](http://www.artima.com/pins1ed/classes-and-objects.html)
- [Classes](http://docs.scala-lang.org/tutorials/tour/classes.html)
- [Case Classes](http://docs.scala-lang.org/tutorials/tour/case-classes.html)

Singleton Objects
- [Singleton Objects](http://www.artima.com/pins1ed/classes-and-objects.html#4.3)
- [Scala Application](http://www.artima.com/pins1ed/classes-and-objects.html#4.4)
