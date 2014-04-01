Scala Hack Session
======================
Welcome to Scala Hack Session. What is the best way to start a new language?

1. Code immediately following this step-by-step sessions
2. Read further materials and resources provided by each sessions   

# ToC - Scala Hack Sessions
The following hack sessions are available:

1. [Scala Principles](01-principles/README.md)

# Social Coding
Feedback, additional exercises, and alternative solutions from you are appeciated. In case you have alternate solutions you are free to pull a request to my GitHub repository.

# Is there a good way to start a new language?
What about...

1. Start hacking immediately and
2. Read further materials in the meanwhile?

One advantage of Scala is its [interactive interpreter](http://www.artima.com/pins1ed/first-steps-in-scala.html#step1).
Like in a worksheet file: you can enter code and get immediate output.
This way gets you quickly into Scala. Another goal is to encourage you to dive deeper.

Please walk through this [blog](http://www.pointsoftware.ch/de/git-and-github-for-a-scala-hack-session-setup/) to install your Scala IDE and import the hack session project.

# Abstract
Under the assumption you have coding skills in another object-oriented language I will cover 4 basic topics in the Scala Hack Session.

First, you start with [(readme)](https://github.com/point-software-ag/scala-hack-session/tree/master/01-principles/day-01/src/main/scala/day01session01/first_steps) [simple arithmetic operations](https://github.com/point-software-ag/scala-hack-session/blob/master/01-principles/day-01/src/main/scala/day01session01/first_steps/FirstSteps01Expressions.sc), [constant/final and assignable variables](https://github.com/point-software-ag/scala-hack-session/blob/master/01-principles/day-01/src/main/scala/day01session01/first_steps/FirstSteps02Variables.sc), and finally how to define [Scala classes](https://github.com/point-software-ag/scala-hack-session/blob/master/01-principles/day-01/src/main/scala/day01session01/first_steps/FirstSteps03Classes.sc). You will finish the first session with an exercise [(readme)](https://github.com/point-software-ag/scala-hack-session/tree/master/01-principles/day-01/src/main/scala/day01session01exercise/first_steps) learning about [singleton objects](https://github.com/point-software-ag/scala-hack-session/blob/master/01-principles/day-01/src/main/scala/day01session01exercise/first_steps/FirstStepsExercise01Objects.scala) and writing a [calculator](https://github.com/point-software-ag/scala-hack-session/blob/master/01-principles/day-01/src/main/scala/day01session01exercise/first_steps/FirstStepsExercise02Calculator.scala).

Second [(readme)](https://github.com/point-software-ag/scala-hack-session/tree/master/01-principles/day-01/src/main/scala/day01session02/control_structures), you will get familiar with [while loops](https://github.com/point-software-ag/scala-hack-session/blob/master/01-principles/day-01/src/main/scala/day01session02/control_structures/ControlStructures01WhileLoop.sc), [for expressions](https://github.com/point-software-ag/scala-hack-session/blob/master/01-principles/day-01/src/main/scala/day01session02/control_structures/ControlStructures02ForExpressions.sc), and [pattern matching](https://github.com/point-software-ag/scala-hack-session/blob/master/01-principles/day-01/src/main/scala/day01session02/control_structures/ControlStructures03PatternMatching.sc).

Third [(readme)](https://github.com/point-software-ag/scala-hack-session/tree/master/01-principles/day-01/src/main/scala/day01session03/functions), we will finally jump into Functions. You start with [function definitions](https://github.com/point-software-ag/scala-hack-session/blob/master/01-principles/day-01/src/main/scala/day01session03/functions/Functions01Definition.sc), [naming conventions](https://github.com/point-software-ag/scala-hack-session/blob/master/01-principles/day-01/src/main/scala/day01session03/functions/Functions02Naming.sc) and [unnamed literals](https://github.com/point-software-ag/scala-hack-session/blob/master/01-principles/day-01/src/main/scala/day01session03/functions/Functions03UnnamedLiteral.sc), and why Scala treats functions as [first class citizens](https://github.com/point-software-ag/scala-hack-session/blob/master/01-principles/day-01/src/main/scala/day01session03/functions/Functions04FirstClassCitizen.sc).

Fourth and finally [(readme)](https://github.com/point-software-ag/scala-hack-session/tree/master/01-principles/day-01/src/main/scala/day01session04/lists), you learn to work with the most used collection type: Lists. I recommend you to to get familiar with this in detail. You learn the basisc operations like accessing the [head and tail elements](https://github.com/point-software-ag/scala-hack-session/blob/master/01-principles/day-01/src/main/scala/day01session04/lists/Lists01BasicMethods01.sc). Another common task is using [pattern matching on lists](https://github.com/point-software-ag/scala-hack-session/blob/master/01-principles/day-01/src/main/scala/day01session04/lists/Lists01BasicMethods02.sc). In the second part of the hack session you learn [higher-order methods](https://github.com/point-software-ag/scala-hack-session/blob/master/01-principles/day-01/src/main/scala/day01session04/lists/Lists03HighOrderMethods01.sc) like map allowing you to convert a List of Type A into another List of Type B (by passing another function as an input parameter List.map(f:A => B)) and [foreach](https://github.com/point-software-ag/scala-hack-session/blob/master/01-principles/day-01/src/main/scala/day01session04/lists/Lists04HighOrderMethods02.sc) allowing you to operate on each element (without returning another list).

# How are the sessions organized?
Each session covers a topic and contains several exercises. Instructions and further explanations are described in the code as comments in two ways:

In this [example of the first session](01-principles/day-01/src/main/scala/day01session01/first_steps/FirstSteps01Expressions.sc#L21:L32) it demonstrates the 'print line' function first, then it encourages you writing in the next line a println for 'Hello, World'. Here, it describes a [syntax] (01-principles/day-01/src/main/scala/day01session01/first_steps/FirstSteps02Variables.sc#L25:L33) where you should replace the '???' with a value for the message variable.

Each session contains further materials I have gathered through my work with Scala. I have summed them up on GitHub. In the future you may find more hack sessions around Scala [here](https://github.com/point-software-ag/scala-hack-session/tree/master/01-principles).

In the next upcoming parts of this blog series you can read more about these sessions:
1. First Steps: Expressions, val and var variables, and Scala classes.
2. Control Structures: While loops, for expressions, and pattern matching.
3. Functions: definition, high-order functions and currying.
4. Lists: basic operations, pattern matching on lists, and high-order methods.

Ok, let's get ready. Instead of reading further you can also stop here and start hacking yourself through the sessions. In case you get stuck you can come back, read the wiki for more details, or compare your result with the provided solutions. You can find them in the solution sub packages in every session. Like [here](01-principles/day-01/src/main/scala/day01session01/first_steps/solution/FirstSteps01Expressions.sc#L21:L38).

#Next: First Steps
In the [first session](https://github.com/point-software-ag/scala-hack-session/tree/master/01-principles/day-01/src/main/scala/day01session01/first_steps) I will discuss the first worksheet with you. You will learn that arithmetic operations are represented by methods, the usage of semicolons, parenthesis, and braces, about variable scopes, and the difference between a class and case class. In addition you will also learn about implicit conversion - a powerful Scala feature allowing for example to extend existing classes like String or define your own domain specific language [DSL](http://en.wikipedia.org/wiki/Domain-specific_language) or adding other languages into Scala like [Basic](http://blog.code-cop.org/2010/01/scala-dsl-for-basic.html).

# Resources

Here is a list of great Scala materials:

- [12 Free eBooks](http://www.efytimes.com/e1/fullnews.asp?edid=122757): eBooks about Scala, Play, Lift, Testing, Cookbooks, etc.
- [Scala Tour](http://docs.scala-lang.org/tutorials/tour/tour-of-scala.html): an introduction
- [Scala Cheatsheet](http://docs.scala-lang.org/cheatsheets/)
- [Programming in Scala (1st Edition)](http://www.artima.com/pins1ed/): The latest 2nd Edition can be purchased but the first Edition with about 700 pages provides enough details
- [Scala by Example](http://www.scala-lang.org/docu/files/ScalaByExample.pdf): training materials 
- [Stack Overflow](http://stackoverflow.com/tags/scala/info): Scala topics with lots of code snippets
- [Scala School](http://twitter.github.io/scala_school/): since Twitter is developed with Scala they created a Scala tutorial
- [Scala for the Impatient](http://typesafe.com/resources/free-books): a book for Java, C++, and C# developers, first part is free and online
- [Online Interpreter](https://codebrew.io/): A Scala worksheet in your browser