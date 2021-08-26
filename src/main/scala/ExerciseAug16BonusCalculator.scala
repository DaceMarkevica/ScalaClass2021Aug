import scala.io.StdIn.readLine

object ExerciseAug16BonusCalculator extends App {
  println("Xmas bonus calculator")
  //TODO
  //Ask for person's name
  //Ask for how long they have worked at the firm
  //Ask for monthly wage
  //Calculate Xmas bonus if they have worked at least 2  years
  //Bonus is years worked over 2 years * 15% of monthly wage
  //so 5 years worked, 1000 Euros wage would give 450 Euro bonus (3 years * 150)

  //if they are not eligible for bonus you should say so


  val name = readLine("What's your name?")
  val workTime = readLine(s"How long you have been working here, $name?").toInt
  val monthlyWage = readLine(s"Please tell your monthly salary, $name.").toDouble
  //  val offsetYears = 2
  val bonusPeriod = (workTime - 2)
  val bonusAmount = (bonusPeriod * 15 / 100 * monthlyWage)
  if (bonusPeriod > 2) println(s"$name, your Xmas bonus will be $bonusAmount")
  else println(s"Sorry,$name, you will not have Xmas bonus this year.")

  // correction to offsetYears line
}
