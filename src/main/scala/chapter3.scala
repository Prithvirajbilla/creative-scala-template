import doodle.core._
import doodle.core.Image._
import doodle.syntax._
import doodle.jvm.Java2DCanvas._
import doodle.backend.StandardInterpreter._

object chapter3 extends App{
  val ex1 = Circle(1) on Circle(10) on Circle(100)
  ex1.draw
  val ex2 = Circle(30) on (Circle(10) beside Circle(10) beside Circle(10))
  ex2.draw
}
