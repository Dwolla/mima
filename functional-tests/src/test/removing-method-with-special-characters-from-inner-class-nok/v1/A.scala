package foo

// See https://github.com/lightbend/migration-manager/issues/158
// `<` would be filtered out, therefore not reporting the missing method
object A {
  abstract class < {
    def f: Int
  }
  abstract class B {
    def f: Int
  }
}
