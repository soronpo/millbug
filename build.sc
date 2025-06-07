//format: off
import mill._
import mill.scalalib._
val projectName = "foo"
val compilerVersion = "3.7.1"

object internals extends ScalaModule {
  def scalaVersion = compilerVersion
}
