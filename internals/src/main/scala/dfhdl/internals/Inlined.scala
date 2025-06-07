package internals
import scala.quoted.*

inline def customError(): Unit = ${ customErrorMacro() }

def customErrorMacro()(using Quotes): Expr[Unit] = 
  '{compiletime.error("customError")}
