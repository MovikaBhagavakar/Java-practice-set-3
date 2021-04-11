package PS_5;

import java.util.Scanner;



public class Ans_2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        try {
            System.out.println("Enter the number");
            int evennum = inp.nextInt();

            int intial = 1;
            int sum = 0;

            while (intial <= evennum) {
                intial++;
                if (intial % 2 == 0) {

                    System.out.println(intial);
                    sum += intial;

                }

            }
            System.out.println("\n The sum of Even numbers are = " + sum);

        } finally {
            inp.close();
        }
    }

}
