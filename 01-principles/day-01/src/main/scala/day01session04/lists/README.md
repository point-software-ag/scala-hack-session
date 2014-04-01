List Methods
======================
# Types and Hierarchies
https://gist.github.com/taitruong/9758813

In this example there are 4 lists with different types. The first list consists of integer elements. AnyVal is the super class of the value classes including Int and Boolean. The parent of AnyVal is Any. Any [(ScalaDoc)](http://www.scala-lang.org/api/current/#scala.Any) is Scala's top class in the hierarchy and implements methods like '==' and '!=' allowing instances of any type to compare with each other. Read more about Scala's hierarchy [here](http://www.artima.com/pins1ed/scalas-hierarchy.html):
![Scala class hierarchy](https://github.com/mbonaci/scala/blob/master/resources/Scala-class-hierarchy.gif)
Source: [Java developer's Scala cheatsheet - One huge Scala reference card](http://mbonaci.github.io/scala/)

The type Nothing of the last list is a special case and represents a [bottom type](http://www.artima.com/pins1ed/scalas-hierarchy.html#11.3) for all types. This is helpful like when you define a function requiring a special return type. In your function you may want to handle exceptions. In this case you can return the bottom type Nothing which is valid to all types:
https://gist.github.com/taitruong/9761806

# Basic List Operations
## Nil and Pattern Matching
A special implementation of List is [Nil](http://www.scala-lang.org/api/current/#scala.collection.immutable.Nil$). It is an empty list representation. Since Nil extends List[Nothing] you can do pattern matching using a type pattern:
https://gist.github.com/taitruong/9762544

## Construction
In the above example you have this list construction: List(1,2)
From a [previous session](http://www.pointsoftware.ch/de/a-hack-session-about-scala-principles-functions-basics/) you know an apply method is a convenience way for creating new instances. Here it is compiled to call the singleton's object method '<b>List.apply[A](xs: A*): List[A]</b>':
(http://github.com/scala/scala/blob/v2.10.3/src/library/scala/collection/immutable/List.scala#L398:L400)

Another convenience to construct a list is the infix operator '::':
https://gist.github.com/taitruong/9764205

The '::' operator (aka 'cons' operator) allows to prepend an element to a list. The general syntax is: x :: xs (x is prepended to the list xs).
Since you know that an infix operator is a method call you can look at [Int's ScalaDoc](http://www.scala-lang.org/api/current/#scala.Int). But wait a minute... there is no such method! It gets even weird because you can find in the [List ScalaDoc](http://www.scala-lang.org/api/current/#scala.collection.immutable.List) the cons method stating:
> '... Adds an element at the beginning of this list.'

So you can do this call:
```
list1.::(2)
```

In your IDE you can hover over the cons method of 'list1.::(2)'. If you click on it the IDE jumps to the cons method in the List class. So for 'x :: xs' it calls on the right operand 'xs.::(x)'. In Scala the last character determines the associativity of an operator. In case the [last character is a colon](http://www.artima.com/pins1ed/basic-types-and-operations.html#5.8) then it is right-associative. You can test this yourself by defining a new operator '=:':
https://gist.github.com/taitruong/9765071

I will not go further on this but if you check the [List source code](https://github.com/scala/scala/blob/v2.10.3/src/library/scala/collection/immutable/List.scala) you can see the cons method creates a new list instance of type '::' in package scala.collection.immutable:
```
  def ::[B >: A] (x: B): List[B] =
    new scala.collection.immutable.::(x, this)
```

The '::' class is like Nil an implementation of List. Read more on the infix operator '::' on [Stack Overflow](http://stackoverflow.com/questions/3181745/understanding-infix-method-call-and-cons-operator-in-scala).

## Concatenation
Instead of appending one element to a list it is also possible to concatenate two lists. The infix operation for this is ':::'.
[Quiz] Here we have two lists: list1 and list2. What is in the list when you (a) call 'list1 ::: list2' and (b) call 'list1.:::(list2)'?
```
val list1 = 1 :: 2 :: Nil
val list2 = 3 :: 4 :: Nil
```

[Answer] Looking again into the List class you can see this method: <b>def :::[B >: A](prefix: List[B]): List[B]</b>. In our case the input parameter is list2 for list1 and leads to a list containing 3, 4, 1, and 2. But if you use the infix operator you know the operator is right-associativ (because of colon being the last character). 'list1 ::: list2' is basically a 'list2.:::(list1)' call and leads to the result 1, 2, 3, and 4.
https://gist.github.com/taitruong/9808421

# Pattern Matching on List
Pattern matching on a list allows you to do something on different cases like for an empty list, a list containing one or more elements:
https://gist.github.com/taitruong/9766470

In this example it is worth to mention the cons pattern 'x :: xs'. On one hand using a cons pattern in an expression for example when you create a list like 'val list = "element" :: anotherList' the infix operation is actually a method call. On the other hand [the cons pattern 'x :: xs' is a constructor pattern](http://www.artima.com/pins1ed/working-with-lists.html#16.5) for the case class ::(x, xs).

# Simple List Methods: head, tail, init, last, take, drop, splitAt, reverse, and flatten
Have a look at these list operations:
https://gist.github.com/taitruong/9913696

- List.head(): returns the first element in a list.
- List.tail(): returns a list with all elements except the first in a list.
- List.init(): returns a list with all elements except the last in a list.
- List.last(): returns the last element in a list.
- List.take(n: Int): returns a list with first nth elements.
- List.drop(n: Int): returns a list after nth element.
- List.splitAt(n: Int): returns two lists splitted at the nth element.
- List.reverse(): returns a list in reverse order in front of this list.
- List.flatten(): returns a flattened list from nested lists in a list.

# Interlude: Option Type
## Some or None...
Though in Scala you have the possibility to deal with null it is rarely used. Instead you have the [Option type](http://www.scala-lang.org/api/current/#scala.Option). There are two sub classes for Option:

1. Some(x: A): a case class for wrapping a value (of type A) like Some(1)
2. None: a case object representing a non-existing value (Nothing)

[Quiz] Refactor our calculator example to return None in case a divide by zero is called:
```
def divide(a: Double, b: Double) = a / b
```

[Answer] In this case you have to have to put an if-else condition:
https://gist.github.com/taitruong/9785015

Read more on the Option type in the [Scala book](http://www.artima.com/pins1ed/case-classes-and-pattern-matching.html#15.6). If you look at the source code you may wonder about the possibility of defining case objects besides case classes as well. On Stack Overflow it is explained about the [difference between case object and object](http://stackoverflow.com/questions/5270752/difference-between-case-object-and-object). And here is a good example of using [case objects as enums](http://samedi9999.wordpress.com/2011/03/15/scala-case-objects-as-enums/).

## Pattern Matching
Options are excessively used for pattern matching. Take a look at these two examples:
https://gist.github.com/taitruong/9786648

Here in the first example an Option value is mapped into another Option value (an Int multiply by ten). In the second example an Option value is converted into a list.

# Higher-Order Methods
## List.map(f: A => B)
The map operation allows you to map a list into another list:
https://gist.github.com/taitruong/9766962

Here you pass a function literal which is called on every list element. The returned value of the function literal is then added and returned to a new list. Instead of defining a function literal like 'element => element.intValue' the second map call uses underscore for simplification.

# List.flatMap(f: A => B)
The flatMap operator is similar to the map operator except that it returns a flattened list in case the result is a nested list:
https://gist.github.com/taitruong/9767410

List.foreach(f: A => B)#
The foreach operation let you iterate through each element but does not return anything (returns Unit):
https://gist.github.com/taitruong/9767665

The last line demonstrates a combination of map and foreach. A String has a toList method and allows you to perform another list operation and each element.

# More Higher-Order Methods
Here is a quick walk-through of further higher-order methods:
https://gist.github.com/taitruong/9913977

- List.filter(p: A => Boolean): Returns a list of all elements which satisfies the predicate.
- List.find(p: A => Boolean): Returns the first element wrapped in an Option type when the predicate is fulfilled. Otherwise None (extends Option) is returned.
- List.partition(p: A => Boolean): Returns two lists where the first list satifies the predicate and the second list contains the remaining elements.
- List.takeWhile(p: A => Boolean): Returns a list with the first elements as long as the predicate is satisfied.
- List.dropWhile(p: A => Boolean): Inversion of takeWhile returning a list of the last elements not satisfying the predicate.
- List.span(p: A => Boolean): Combines takeWhile and dropWhile returning two lists.

# List Operations on Other Types
There are other types implementing most of the list operations as well. Like for String:
https://gist.github.com/taitruong/9786928

Above I mentioned options are excessively used with pattern matching which means that your code is harder to read and not very compact.
[Quiz] Have a look at my pattern example above and refactor it using list operations provided by the Option type:
https://gist.github.com/taitruong/9786648

[Answer] A better way is to use higher-order methods like toList and map on Option:
https://gist.github.com/taitruong/9786919

Compared to the pattern example this is much more readable and shorter. There is an [Option Cheat Sheet](http://blog.tmorris.net/posts/scalaoption-cheat-sheet/) covering most of the patterns.

# More on Lists
In Odersky's Scala book you can read more about other [collections like arrays, maps, list and array buffers, queues, and stacks](http://www.artima.com/pins1ed/collections.html). Here is an exercise about [implementing your own stack](http://amitdev.github.io/coding/2013/12/31/Functional-Stack/) to get a better understanding.

There is a Scala Cookbook from Alvin Alexander. In his [blog](http://alvinalexander.com/scala/scala-list-class-examples) you can find lots of list examples.

## Immutable vs. Mutable
On Stack Overflow there is a good answer what [immutable and mutable collections](http://stackoverflow.com/questions/8287425/mutable-vs-immutable-in-scala-collections) means.
In the Scala book it discusses also [when to use immutable or mutable collections](http://www.artima.com/pins1ed/collections.html#17.4). For example in most cases the number of elements are often small rather than big. In this case it is preferred to use immutable collections since they consume less memory compared to their mutable counterparts. The default HashMap for instance takes about 80 bytes and for each entry 16 bytes whereas an empty immutable Map is a single object.

In general and as mentioned by Odersky the idiomatic way is to use immutable and [avoid mutable collections](http://stackoverflow.com/questions/11049213/which-scala-mutable-list-to-use). Also check this discussion about [when to use ListBuffer or List](http://stackoverflow.com/questions/1241166/preferred-way-to-create-a-scala-list).

## Performance and Memory consumption

What if you add or remove elements from a list? Prepending an element to an immutable list does internally no create a new list. Instead when you prepend an element to a list [a new pointer is created](http://stackoverflow.com/questions/2123290/why-is-the-operator-for-list-deprecated-in-scala#comment2062773_2123428) and links the element with the existing list. The List class does not offer an append operation - in fact there was an [+ operation but it was deprecated](http://stackoverflow.com/questions/2123290/why-is-the-operator-for-list-deprecated-in-scala). As stated [here](http://www.artima.com/pins1ed/next-steps-in-scala.html#step8):
> '... Class List does not offer an append operation, because the time it takes to append to a list grows linearly with the size of the list, whereas prepending with :: takes constant time. Your options if you want to build a list by appending elements is to prepend them, then when you're done call reverse; or use a ListBuffer, a mutable list that does offer an append operation, and when you're done call toList.'

There is another Stack Overflow [discussion about the performance and memory consumption](http://stackoverflow.com/questions/1308682/scala-mutable-vs-immutable-object-performance-outofmemoryerror) on Map dealing with one million elements.

A more detailed [performance analysis on sorting an immutable lists](http://robsscala.blogspot.ch/2012/12/sorting-immutable-list-in-scala.html) is discussed in this other blog. It concludes that sorting lists in a functional programming style is not more efficient compared to imperative programming.

# Summary
Congratulations! You have gone a long way, maybe have tasted blood and want to learn more about Scala. In this last session you have learned all about list operations. There are simple, first-order methods like head and tail, but also higher-order methods like map and filter. Lists are used very often. What you also have realized is that pattern matching is another key feature. In many cases you can use higher-order methods instead of pattern matching.

I hope this blog series helped you into taking the first steps of learning Scala. Of course there is much more to learn. I advise you to have a look at how to use [pairs and tuples](http://www.artima.com/pins1ed/collections.html#17.6). For further advanced Scala topics have a look at [The Neophyte's Guide to Scala](http://danielwestheide.com/scala/neophytes.html). Or get a hard cover of Odersky's [Programming in Scala](http://www.artima.com/shop/programming_in_scala_2ed). In found this blog also great providing a good [Scala overview and functional programming](http://docs.huihoo.com/scala/programming-scala/ch08.html).

# Resources

Working with Lists
- http://www.artima.com/pins1ed/working-with-lists.html
- http://alvinalexander.com/scala/scala-list-class-examples

Higher-Order Functions
- Higher-order methods on class List: http://www.artima.com/pins1ed/working-with-lists.html#16.7
- http://www.scala-lang.org/old/node/134
