fun main() {
    var x = 5;
    var s1 = "Value is $x";
    // output : Value is 5
    var x = 5;
    var y = 6;
    val sum = "Sum is ${x + y}";
    println(sum);
    // output : Sum is 11
    var x = 5;
    var s1 = "Value is $x";
    var s2 = "${s1.replace("is", "was")}, but now is ${x + 2}";
    println(s2);
    // output : "Value was 5, but now is 7"
}