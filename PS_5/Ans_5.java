package PS_5;

import java.util.Scanner;

public class Ans_5 {
    public static void main(String[] args) {
        
        Scanner inp= new Scanner(System.in);
        try{
        System.out.println("Enter the factorial");
        int num= inp.nextInt();
        int factorial=1;

        for(int x= 1; x<=num; x++){
            factorial=factorial*x;
            
        }
        System.out.println("Factorial of " +num+ " is:" + factorial);
        }
        finally{
            inp.close();
        }
    }

        
    
    
}
