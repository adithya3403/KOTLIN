fun main() {
    var x : Int = 4;
    x++;
    println(x);
    // same as x = x + 1
    // 5
    var y : Int = 4;
    y--;
    println(y);
    // same as y = y - 1
    // 3
    var a = 4;
    val b = ++a;
    // a is incremented, then assigned to b
    // b is 5
    var c = 4;
    val d = x++;
    // c is assigned to d, then incremented
    // d is 4
}