trait A {
  def foo: Int = 2
}



trait B extends A

class C extends B