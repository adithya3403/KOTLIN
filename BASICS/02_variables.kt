fun main() {
    // val cannot be reassigned(they are immutable)
    val num = 10;
    println(nums);
    val str = "Hello";
    println(str);
    // assigning new value to num or str leads to a compiler error
    val num = 10;
    num = 12;
    // var keyword allows to declare that can be reassigned
    var test = 10;
    test = 21;
    // explicit declaration
    var num : Int = 42;
    val str : String = "Wont change";
}