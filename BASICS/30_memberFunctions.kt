class User1 {
    fun printHello() {
        println("Hello");
    }
}
class USer2 {
    var name : String = "";
    fun printHello() {
        println("Hello, $name");
    }
}
fun main() {
    val obj = User1();
    obj.printHello(); // Hello
}