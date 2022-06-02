fun greetUSer(name : String) {
    println("Hello $name !");
}
fun printSum(a : Int, b : Int) {
    println("Sum is ${a + b}");
}
fun getProduct(a : Int, b : Int) : Int {
    return a * b;
}
fun main() {
    greetUser("Max"); // Hello Max !
    val a = 4;
    val b = 5;
    printSum(a, b); // Sum is 9
    val product = getProduct(a, b);
    println("Product is $product"); // Product is 20
    // or we can print it as 
    // println("Product is ${getProduct(a, b)}");
}