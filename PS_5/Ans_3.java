package PS_5;

import java. util.Scanner;

public class Ans_3 {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);

        try{
            System.out.println("Enter The Number");
            int table= inp.nextInt();

            for(int num= 1; num<=10; num++ ){
            
                System.out.println(table + "*"  + num+   "="  +table*num );
            }
        }
        finally{
            inp.close();
        }
        
    }
    
}
