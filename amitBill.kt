
/*Amit’s mother given him 500 Rs. and tell him to purchase goods like soap, shampoo, oil, sugar and salt. Amit completes his shopping in a supermarket. If bill is less than 500 then he will pay. But if finds that bill is crossing 500, then he decides to remove items from the list.

Sample Output:

Enter name and price of the goods purchased('s' to stop):
enter item name
rice
enter price
200
enter item name
oil
enter price
300
enter item name
shampoo
enter price
400
enter item name
s
Bill generated is as follows:
rice 200
oil 300
shampoo 400
Total Bill is Rs.900
Total Bill 900 is more than 500, enter name of an item to remove from list
shamp
enter item shamp is not in the list
Total Bill 900 is more than 500, enter name of an item to remove from list
shampoo
shampoo is removed from the bill
Congratulations:
you final bill:
item	price
rice	200
oil	300
Bill amount is Rs.500
*/


fun main() {
    println("Enter name and price of the goods purchased('s' to stop):")
    var total: Int = 0
    var items: ArrayList<String> = ArrayList()
    var prices: ArrayList<Int> = ArrayList()
    while (true) {
        println("enter item name:")
        var item = readLine()!!
        if (item == "s") {
            break
        }
        println("enter price:")
        var price = readLine()!!.toInt()
        total += price
        items.add(item)
        prices.add(price)
    }
    println("Bill generated is as follows:")
    for (i in 0 until items.size) {
        println(items[i] + " " + prices[i])
    }
    println("Total Bill is Rs.$total")
    var flag = 0
    while (total > 500) {
        println("Total Bill $total is more than 500, enter name of an item to remove from list")
        var item = readLine()!!
        for (i in 0..items.size - 1) {
            if (item == items[i]) {
                println("$item is removed from the bill")
                total -= prices[i]
                items.removeAt(i)
                prices.removeAt(i)
                flag = 1
                break
            }
        }
        if (flag == 0) {
            println("enter item $item is not in the list")
        }
    }
    if (flag == 1) {
        println("Congratulations:")
        println("you final bill:")
        println("item\tprice")
        for (i in 0..items.size - 1) {
            println("${items[i]}\t${prices[i]}")
        }
        println("Bill amount is Rs.$total")
    }
}