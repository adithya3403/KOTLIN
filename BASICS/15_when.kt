fun main() {
    /*
    when (variable) {
        condition -> statement
    }
    */
    val num = 15;
    when (num) {
        10 -> println("Case 1");
        15 -> println("Case 2");
        20 -> println("Case 3");
        else -> println("Default case");
    }
    // example
    var age = readLine()!!.toInt();
    when {
        age < 22 -> println("Too young!");
        age > 50 -> println("Too old!");
        else -> println("Welcome!");
    }
    // example
    var x = 5;
    when (x) {
        1, 3, 5, 7, 9 -> println("Odd");
        2, 4, 6, 8, 10 -> println("Even");
        else -> println("Unknown");
    }
    // example
    var grade = 88;
    var result = when {
        grade < 50 -> "Failed!";
        grade > 50 && grade < 80 -> "Good!";
        grade > 80 -> "Awesome!";
        else -> "Unknown!";
    }
}