package day01session01.first_steps.solution

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
 */
object FirstSteps02Variables {

  /**
   * A constant variable is defined using val. Examples:
   * val name:String = "Hello, World";
   * val value:Int = 1;
   *
   */
  //Change the ??? e.g. by an String value like "Hello, World"
  val message: String = "Hello, World"            //> message  : String = Hello, World

  /**
   * Scala uses type inference as far as possible. In this case a type is not needed. The value type also defines the val type.
   */
  val answer = "Hello, Scala friend!"             //> answer  : String = Hello, Scala friend!

  /**
   * A constant for SimpleDateFormat with the pattern "dd:MM:yyyy HH:mm:ss:SSS"
   * In Scala it is legitimate to use Java classes.
   */
  val dateFormat = new SimpleDateFormat("dd:MM:yyyy HH:mm:ss:SSS")
                                                  //> dateFormat  : java.text.SimpleDateFormat = java.text.SimpleDateFormat@c22b5
                                                  //| 439

  /**
   * An assignable variable allows re-assigning the variable with another value at any time.
   *
   */
  var constructionTime = System.currentTimeMillis()
                                                  //> constructionTime  : Long = 1391095159238
  
  //reassign constructionTime with a new current time plus one second
  constructionTime = System.currentTimeMillis() + 1000
  //print the time using the dateFormat
  println(dateFormat.format(constructionTime))    //> 30:01:2014 16:19:20:238
  
  
}