package day01session03.functions.solution

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
object Functions02Naming {
  //The naming conventions in Scala are less strict e.g. compared to Java
  //The "+" operator is actually a function from Double. There are more functions like that:
  //Double.+(), Double.-(), Double.*(), Double.%(), etc.
  //Since Scala allows to call methods without a "." it looks more natural: "1 + 3" is actually "1d.+(3)"

  //Let's have a look at some execution and return behaviors:
  object Calculator2 {
    def add1(a: Double, b: Double) = {
      a +
        b
    }
    def add2(a: Double, b: Double) = {
      a
      +b
    }
  }
  //Now try call both functions with valus 2 and 3
  //What happens? This is called "Semicolon inference": http://www.artima.com/pins1ed/classes-and-objects.html#4.2
  Calculator2.add1(2, 3)                          //> res0: Double = 5.0
  Calculator2.add2(2, 3)                          //> res1: Double = 3.0
  //For a better understanding change both functions above and replace "+" by "-"
  
}