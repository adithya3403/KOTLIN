fun getSum1(a : Int, b : Int, c : Int) : Int {
    return a + b + c;
}
fun getSum2(a : Int, b : Int, c : Int = 0) : Int {
    return a + b + c;
}
fun getSum(a : Int, b : Int) {
    return a + b;
}
fun main() {
    val a = 4;
    val b = 5;
    val c = 6;
    println("The sum is ${getSum1(a, b, c)}"); // The sum is 15
    println("The sum is ${getSum2(a, b, c)}"); // The sum is 15
    println(getSum(a = 42, b = 8)); // The sum is 50
}