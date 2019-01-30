import scalaz.zio._
import scalaz.zio.console._
import org.scalajs.dom
import dom.document

import scala.scalajs.js.annotation.JSExport
//1'st scenario is to let the main function which return an IO
//to call the javascript function
object Test extends App{

  def run(args: List[String]): IO[Nothing, ExitStatus] = {
    test.attempt.map(_.fold(_ => 1, _ => 0)).map(ExitStatus.ExitNow(_))
  }

  val test= for {
    _ <- putStrLn("Enter a number ")
    num <-getStrLn
    _ <-viewNumber(num)
  }yield()

  //another signature def viewNumber (num:IO[IOException,String]):IO[Nothing,Unit]={
  @JSExport
  def viewNumber (num:String):IO[Nothing,Unit]={
    val res = document.getElementById("p1")
    res.innerHTML = num
    IO.unit
  }
}
