class User1 {
    var age : Int = 0;
    fun printInfo() {
        println("The user is $age years old.");
    }
}
class USer2 {
    var age : Int = 0;
    get() {
        return field + 2;
        // the field keyword refers to property age in this case
    }
}
fun main() {
    val obj = User1();
    obj.age = -12;
    obj.printInfo(); // The user is -12 years old.
}