fun main() {
    var myRange = 1..10;
    for (x in myRange) {
        println(x);
    }
    var evenRange = 0..10 step 2;
    for (i in evenRange) {
        println(i);
    }
}