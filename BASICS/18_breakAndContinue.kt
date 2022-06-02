fun main() {
    // break
    var x = 5;
    do {
        println(x);
        x--;
        if (x == 3) {
            break;
        }
    } while (x > 0);
    // output : 5 4



    // continue
    var x = 0;
    while (x < 5) {
        x++;
        if (x == 3) {
            continue;
        }
        println(x);
    }
    // output : 1 2 4 5
}