fun main() {
    // to create a range we can use the rangeTo() function
    var myRange = 1.rangeTo(10);
    // to create a decreasing range, use downTo()
    var decRaneg = 8.downTo(2);
    // we can define using .. operator
    var myRange = 1..10;
    println(myRange);
    // example
    var myRange = 1..10;
    if (5 in myRange) {
        println("5 is in the range");
    }
    // !in can be used to check if it is not in the range
}