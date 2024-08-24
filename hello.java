
Conversation opened. 1 unread message.

Skip to content
Using Gmail with screen readers
1 of 2,631
(no subject)
Inbox

Sahil Kashyap <rk4852115@gmail.com>
18:56 (3 minutes ago)
to 5940, me

import java.util.Scanner;

public class SumOfEven {
    public static void main(String[] args) {
        int sum = 0;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value: ");
        n = sc.nextInt();
        int user = n;
        sumOfEven(n, sum, user);
    }
    static void sumOfEven(int n, int sum, int user) {

        if(n > 0){
            sum = sum + n;
            n--;
            sumOfEven(n, sum, user);
        } else {
            System.out.println("Sum of even numbers between 1 to "+user +": " + sum);
        }
    }
}
