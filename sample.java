
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

import java.util.*;
public class sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int count = 0;
        int flag = 0;
        String name = "";
        int price = 0;
        System.out.println("Enter name and price of the goods purchased('s' to stop):");
        while (true) {
            name = sc.next();
            if (name.equals("s")) {
                break;
            }
            price = sc.nextInt();
            total = total + price;
            count++;
        }
        if (total < 500) {
            System.out.println("Bill generated is as follows:");
            for (int i = 0; i < count; i++) {
                System.out.println(name + " " + price);
            }
            System.out.println("Total Bill is Rs." + total);
        } else {
            System.out.println("Total Bill " + total + " is more than 500, enter name of an item to remove from list");
            while (true) {
                name = sc.next();
                if (name.equals("s")) {
                    break;
                }
                for (int i = 0; i < count; i++) {
                    if (name.equals(name)) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 1) {
                    System.out.println(name + " is removed from the bill");
                    flag = 0;
                } else {
                    System.out.println(name + " is not in the list");
                }
            }
            System.out.println("Congratulations:");
            System.out.println("you final bill:");
            for (int i = 0; i < count; i++) {
                System.out.println("item	price");
                System.out.println(name + "	" + price);
            }
            System.out.println("Bill amount is Rs." + total);
        }
        sc.close();
    }
}