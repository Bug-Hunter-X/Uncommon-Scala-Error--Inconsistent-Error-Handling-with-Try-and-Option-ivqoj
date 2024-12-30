```scala
import scala.util.Try

case class Result[T](value: T, error: Option[String] = None)

def processData(data: String): Result[Int] = {
  Try {
    val num = data.toInt
    if (num < 0) {
      return Result(0, Some(s"Input '$data' is negative. Number must be non-negative"))
    }
    Result(num)
  } match {
    case scala.util.Success(result) => result
    case scala.util.Failure(e) => Result(0, Some(s"Error processing '$data': ${e.getMessage}"))
  }
}

def main(args: Array[String]): Unit = {
  val result1 = processData("10")
  val result2 = processData("-5")
  val result3 = processData("abc")

  println(result1) 
  println(result2) 
  println(result3) 
}
```