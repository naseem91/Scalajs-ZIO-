import org.scalajs.dom.document
import scalaz.zio._
import scalaz.zio.console._


object Test extends App {
  val z: UIO[String] = IO.succeed("Hi")

  override def run(args: List[String]) =
    for {
      _ <- putStrLn("")
      y <- z
      s <- IO.succeedLazy((testJS(y)))
    } yield ()


  def testJS(str:String)={
    val s = document.getElementById("p1")
    s.innerHTML = str
  }
}