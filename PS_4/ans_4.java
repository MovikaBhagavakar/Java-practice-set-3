package PS_4;

import java.util.Scanner;

public class ans_4 {
    public static void main(String[] args) {
        Scanner month= new Scanner(System.in);

        System.out.println("Enter the number");
        int week= month.nextInt();

        switch(week){
           case 1: 
           System.out.println("Monday");
           break;

           case 2:
           System.out.println("Tuesday");
           break;

           case 3:
           System.out.println("wensday");
           break;

           case 4:
           System.out.println("Thursday");
           break;

           case 5:
           System.out.println("Friday");
           break;

           case 6:
           System.out.println("Saturday");
           break;

           case 7:
           System.out.println("Sunday");
           break;

           default:
           System.out.println("Nothing");

        }   

    }
    
}
