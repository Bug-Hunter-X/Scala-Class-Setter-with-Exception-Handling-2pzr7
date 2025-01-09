```scala
class MyClass(val name: String) {
  private var _age: Int = 0

  def age: Int = _age
  def age_=(newAge: Int): Unit = {
    if (newAge >= 0) _age = newAge
    else throw new IllegalArgumentException("Age cannot be negative")
  }
}

object Main extends App {
  val person = new MyClass("John")
  person.age = 30 // this is fine
  person.age = -1 // this throws exception
  println(person.age)
}
```