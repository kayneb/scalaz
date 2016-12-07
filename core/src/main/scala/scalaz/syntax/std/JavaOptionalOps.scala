package scalaz
package syntax
package std

final class JavaOptionalOps[T](val self: java.util.Optional[T]) extends AnyVal {
  def toOption: Option[T] = if (self.isPresent) Some(self.get) else None
}

trait ToJavaOptionalOps {
  implicit def ToJavaOptionalOpsFromJavaOptional[T](o: Optional[T]): JavaOptionalOps[T] = new JavaOptionalOps(o)
}
