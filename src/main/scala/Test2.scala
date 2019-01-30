import org.scalajs.dom.document
import scalaz.zio.console.{getStrLn, putStrLn}
import scala.scalajs.js.annotation.JSExport

/*2nd scenario is use for comp in main and get the data and then pass
*it to the javascript function the problem in this scenario is how to
* to pass the returned value to the js at line 16
*/
object Test2 {

  def main(args: Array[String]): Unit = {
    val getNum= for {
      _ <- putStrLn("Enter a number ")
      num <-getStrLn
    }yield(num)
//   test(getNum)
  }

  @JSExport("test")
  def test(num:String): Unit = {
    val res = document.getElementById("p1")
    res.innerHTML = num
  }
}
