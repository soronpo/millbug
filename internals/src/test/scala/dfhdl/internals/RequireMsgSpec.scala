package internals
import scala.compiletime.testing.typeCheckErrors

val x = typeCheckErrors("""customError()""")