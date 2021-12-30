import com.scalapenos.riak.{RiakValue, RiakClient}
import spray.json.DefaultJsonProtocol._
import concurrent.Future
import scala.concurrent.duration.Duration
import scala.concurrent.{Await, Future}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

object Main extends App {
  val client = RiakClient("localhost", 8098)
  val val_to_be_stored: RiakValue = RiakValue("Dokument")
  val bucket = client.bucket("s23919")

  val store_result: Future[Unit] = bucket.store("scala_doc", val_to_be_stored)
  Await.ready(store_result, Duration.Inf)

  val val_fetched: Future[Option[RiakValue]] = bucket.fetch("scala_doc")
  Await.ready(val_fetched, Duration.Inf)
  println("Value stored/fetched : " + val_fetched)

  val modified_val_to_be_stored: RiakValue =
    RiakValue("THIS IS DIFFERENT THEN BEFORE")

  val modified_store_result: Future[Unit] =
    bucket.store("scala_doc", modified_val_to_be_stored)
  Await.ready(modified_store_result, Duration.Inf)

  val val_fetched_after_mod: Future[Option[RiakValue]] =
    bucket.fetch("scala_doc")
  Await.ready(val_fetched_after_mod, Duration.Inf)
  println("Value fetched : " + val_fetched_after_mod)

  val delete_result: Future[Unit] = bucket.delete("scala_doc")
  Await.ready(delete_result, Duration.Inf)
  println("Result  deleted : " + delete_result)

  val val_deleted: Future[Option[RiakValue]] = bucket.fetch("scala_doc")
  Await.ready(val_deleted, Duration.Inf)
  println("Value failed to retrieve : " + val_deleted)
}
