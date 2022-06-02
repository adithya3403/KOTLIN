fun printIt1(arg : Any) {
    println(arg);
}
fun printIt2(arg : Any) {
    if (arg is String) {
        println("Length is ${arg.length}");
    }
    println(arg);
}
fun main(args: Array<String>) {
    printIt1("Some String");
    printIt1(42);
}