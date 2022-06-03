fun main() {
    // input is taken using readLine() function
    val test = readLine();
    println("Your input is $test");
    // convert input to Int using toInt()
    var age = readLine()!!.toInt();
    println("You are $age years old");
    var dblTest = readLine()!!.toDouble();
    var longTest : Long = readLine()!!.toLong();
}