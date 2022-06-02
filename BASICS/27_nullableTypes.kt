fun main() {
    var str : String = "HelloWorld";
    /*
    str = null;
    this generates a compiler error
    kotlin's type system tries to eliminate NullPointerException
    */
    println(str.length);
    var str : String? = "HelloWorld";
    str = null;
    /* no errors for above code */
    var str : String? = "HelloWorld";
    println(str.length);
    /* causes a compile-time error, as now str can be null */
    // to safely access, use
    println(str?.length);
}