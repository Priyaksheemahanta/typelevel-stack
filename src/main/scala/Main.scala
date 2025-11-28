import cats.effect.*
import server.HttpServer

object Main extends IOApp.Simple:

  override def run: IO[Unit] =
    HttpServer.start
