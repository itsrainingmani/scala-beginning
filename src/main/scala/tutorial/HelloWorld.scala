package tutorial

/**
  * Created by zeus on 7/1/17.
  */
object HelloWorld extends App{
  var capital = Map("US" -> "Washington", "France" -> "Paris")
  capital += ("Japan" -> "Tokyo")
//  println(capital("France"))

  def factorial(x: BigInt): BigInt =
    if (x==0) 1 else x * factorial(x-1)

  var msg = "Hello, World"

  var donutsToBuy: Int = 5
  donutsToBuy = 10

  lazy val donutService = "blah"
  var leastFavorite: String = _
  leastFavorite = "Blah"

  val donutByte: Byte = 0xa


}
