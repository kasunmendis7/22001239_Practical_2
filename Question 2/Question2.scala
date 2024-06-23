/*
2. Use the following declaration and initialization to convert them to
acceptable Scala statements.
int a = 2, b = 3, c = 4, d = 5;
float k = 4.3f;
and evaluate the following expressions
a) println( - -b * a + c *d - -);
b) println(a++);
c) println (–2 * ( g – k ) +c);
d) println (c=c++);
e) println (c=++c*a++);
 */

object Question2 {
  def main(args: Array[String]): Unit = {
    var a = 2
    var b = 3
    var c = 4
    var d = 5
    var k = 4.3f
    println("- -b * a + c *d - - = " + (b * a + c * d));
    a+=1
    println("a++ = " + a);
    println("-2 * ( g - k ) +c = " + (-2 * (b - k) + c));
    println("c = "+ c);
    c+=1
    c+=1
    println("c = " +c * a);

  }
}
