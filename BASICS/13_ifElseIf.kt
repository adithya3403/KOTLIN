fun main() {
    var age = readLine()!!.toInt();
    if (age < 20) {
        println("Too young!");
    } else if (age > 50) {
        println("Too old!");
    } else {
        println("Welcome!");
    }
}