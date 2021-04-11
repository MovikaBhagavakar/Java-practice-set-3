package PS_5;

import java.util.Scanner;

public class Ans_6 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        try{
            System.out.println("Enter the Number");
            int F= inp.nextInt();
            int x=1;
            int factorial=1;

            while(x<=F-1){
            x++;
            factorial=factorial*x;
        }
        System.out.println("Factorial is of"+F+"is:"+factorial);


        
        }
        finally{
        inp.close();}

        
        
    }
    
}
