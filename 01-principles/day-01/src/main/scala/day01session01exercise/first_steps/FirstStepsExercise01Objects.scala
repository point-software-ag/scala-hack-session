package day01session01exercise.first_steps

import java.text.SimpleDateFormat

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
 * =================================================================================
 * 
 * As you can see the class defined below is not equal to the file name. Further on
 * there are more class definitions in one file. Though it is good practice to have
 * class and file named equally. Also have a look at this file in the IDE's package explorer
 */
class ScalaFun {

  private val alive = true
  //define variables for dateFormat and constructionTime here
  var constructionTime = ???

  //Constructors with params are defined using "def this(params)".
  //The first call must always be the primary constructor "this()"
//  def this(constructionTime: Long) = {
//    ???
//  }
}

//Singleton objects: http://www.artima.com/pins1ed/classes-and-objects.html#4.3
//Scala is more OO than Java since it has not static members. Instead it has singletons
//Singleton members can be accessed like this: MySingleton.myField (compared to myClassInstance.myField)
//object SingletonObject

//this singleton is named like the class above. It is call Companion Object where the the class is the Companion Class.
//Both can access each other's private members
//Another good practice is to have both companion class and object within one file
object ScalaFun {
  //unlike Java imports can also be defined within a class or function
  import java.text.SimpleDateFormat

  //define dateFormat in this singleton
  val dateFormat:SimpleDateFormat = ???

}

//Another usage of singleton is to start a Scala application
//In your IDE just do a right click > Run As > Scala Application
//for this a main needs to be defined
//http://www.artima.com/pins1ed/classes-and-objects.html#4.4
object ScalaApp {
  def main(args: Array[String]) {
    val instance = new ScalaFun
    println("> " + instance + ": " + ScalaFun.dateFormat.format(instance.constructionTime))
  }

}