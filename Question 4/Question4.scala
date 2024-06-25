/* 
4. Imagine the owner of a movie theater who has complete freedom in setting 
ticket prices. The more he charges, the fewer the people who can afford tickets.
In a recent experiment the owner determined a precise relationship between the
price of a ticket and average attendance. 
At a price of Rs 15.00 per ticket, 120 people attend a performance. Decreasing 
the price by 5 Rupees increases attendance by 20 and increasing the price by 5 
Rupees decreases attendance by 20. 
Unfortunately, the increased attendance also comes at an increased cost. Every 
performance costs the owner Rs.500. Each attendee costs another 3 Rupees. 
The owner would like to know the exact relationship between profit and ticket 
price so that he can determine the price at which he can make the highest profit. 
Implement a functional program to find out the best ticket price */
object Question4 {
  def main(args: Array[String]): Unit = {
    println("Current profit gained from the movie theater = Rs." + profit(15, 120))
    println(
      "Profit gained from the movie theater if price is increased = Rs." + priceIncrement(15, 120)
    )
    println(
      "Profit gained from the movie theater if price is decreased = Rs." + priceDecrement(15, 120)
    )
  }

  def profit(price: Double, attendance: Int): Double = {
    (price * attendance) - 500 - (attendance*3)
  }

  def priceIncrement(price: Double, attendance: Int): Double = {
    (price + 5) * (attendance - 20) - 500 - ((attendance-20)*3)
  }

  def priceDecrement(price: Double, attendance: Int): Double = {
    (price - 5) * (attendance + 20) - 500 - ((attendance+20)*3)
  }

}
