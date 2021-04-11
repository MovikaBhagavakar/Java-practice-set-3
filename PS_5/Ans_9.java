package PS_5;

import java.util.Scanner;

public class Ans_9 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        try {

            System.out.println("Enter your number");
            int sum = inp.nextInt();

            int evensum = 1;

            for (int x = 1; x <= sum; x++) {
                if (x % 2 == 0) {

                    System.out.println(x);
                    evensum = evensum + x;

                }

            }
            System.out.println("\n The sum of Even numbers are = " + evensum);

        } finally {
            inp.close();
        }

    }

}
