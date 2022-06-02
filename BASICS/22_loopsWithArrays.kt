fun main() {
    var nums : IntArray = intArrayOf(4, 5, -5, 12);
    for (n in nums) {
        println("Value : $n");
    }
    // example
    var nums : IntArray = intArrayOf(4, 5, -5, 12);
    var index : Int = 0;
    while (index < 4) {
        println("Value : ${nums[index]}");
        ++index;
    }
    // example2
    var nums : IntArray = intArrayOf(4, 5, -5, 12);
    for (ix in nums.indices) {
        println("Value : ${nums[ix]}");
    }
}