// basic syntax of a fucntion looks like : 

/*


fun name(parameter : type = default value) : return type{
    statements
}


*/


fun greetUser() {
    println("Hello user!");
}

fun square(x : Int) : Int {
    return x * x;
}

// main function
fun main() {
    greetUser(); // Hello user!
    println(square(8)); // 64
}