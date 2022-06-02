fun main() {
    if (hour < 12) {
        println("Good morning!");
    } else {
        println("Good day!");
    }
    // example
    val hour = 11;
    val isMorning : Boolean = (hour < 12);
    if (isMorning) {
        println("Good morning!");
    } else {
        println("Good day!");
    }
    // if is an expression
    val max = if (15 > 25) 15 else 25;
    println(max); // 25
}