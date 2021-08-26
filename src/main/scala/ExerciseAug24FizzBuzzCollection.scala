object ExerciseAug24FizzBuzzCollection extends App {
  //TODO create an Array[String] containing FizzBuzz values from 1 to 100 included and print it out
  //That is "1", "2", "3", "4", "Fizz", "6", "Buzz", "8" etc...

  val myNumbers = (1 to 100).toArray

  //you can either yield or map
  //I recommend creating a helper function
  def getFizzBuzzText(n: Int): String = {

    if (n % 5 == 0 && n % 7 == 0) "FizzBuzz"
    else if ( n % 5 == 0) "Fizz"
    else if (n % 7 == 0) "Buzz"
    else s"$n" // alternative since we have no other text we could do to n.toString
  }

  //yield approach
  val myFizzBuzz = for (n <- myNumbers) yield getFizzBuzzText(n)
  myFizzBuzz.foreach(println)

  //or we could also use map
  val myFizzBuzzToo = myNumbers.map(n => getFizzBuzzText(n))
  myFizzBuzzToo.foreach(println)
}
