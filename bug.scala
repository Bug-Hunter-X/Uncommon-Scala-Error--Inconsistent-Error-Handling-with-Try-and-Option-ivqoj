```scala
import scala.util.Try

case class Result[T](value: T, error: Option[Throwable] = None)

def processData(data: String): Result[Int] = {
  Try {
    val num = data.toInt
    if (num < 0) {
      throw new IllegalArgumentException("Number must be non-negative")
    }
    Result(num)
  } match {
    case scala.util.Success(result) => result
    case scala.util.Failure(e) => Result(0, Some(e))
  }
}

def main(args: Array[String]): Unit = {
  val result1 = processData("10")
  val result2 = processData("-5")
  val result3 = processData("abc")

  println(result1) // Result(10,None)
  println(result2) // Result(0,Some(IllegalArgumentException("Number must be non-negative")))
  println(result3) // Result(0,Some(NumberFormatException("For input string: "abc"")))
}
```