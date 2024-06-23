object Question3 {
  def main(args: Array[String]): Unit = {
    var normalHours = 40
    var otHours = 30
    val totalSalary = normalPay(normalHours) + overTimePay(otHours);
    val finalSalary = totalSalary - taxDecrement(totalSalary)
    println("Final salary of the employee = " + finalSalary)
  }

  def normalPay(normalHours: Int): Double = {
    250 * normalHours
  }

  def overTimePay(otHours: Int): Double = {
    85 * otHours
  }

  def taxDecrement(totalSalary: Double): Double = {
    totalSalary * 0.12
  }
}
