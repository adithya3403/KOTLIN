class Student(var name : String, var age : Int) {
    init {
        println("Student : $name");
        println("Age : $age");
    }
}

// example
class Student(name : String, age : Int) {
    init {
        println("this will print first");
    }
    init {
        var sname = name;
        println("Using a variable declared above $name");
    }
}