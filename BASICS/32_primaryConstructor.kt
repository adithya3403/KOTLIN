class USer constructor(var name : String) {
    fun sayHi() {
        println("Hello, $name");
    }
}
fun main() {
    val obj = User(readLine()!!);
    obj.sayHi();
}

// example
class Student(var age : Int) {
    fun printAge() {
        println("I am $age years old.");
    }
}