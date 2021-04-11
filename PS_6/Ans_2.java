package PS_6;

import java.util.Scanner;

public class Ans_2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        try {
            System.out.println("Enter the integer");
            int x = inp.nextInt();

            int arr[] = { 58, 78, 67, 62 };
            for (int i = 0; i <= arr.length - 1; i++) {
                if (x == arr[i]) {
                    System.out.println(x + " num is present in  an array");

                }

            }
            System.out.println(x + " num is not present in an array");

        } finally {
            inp.close();
        }

    }

}
