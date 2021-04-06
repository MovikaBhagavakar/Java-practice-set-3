package PS_4;

import java.util.Scanner;

public class Que_3 {
    public static void main(String[] args)
     {

        Scanner M= new Scanner(System.in);

        System.out.println("Enter your Amount");
        Long A= M.nextLong();
        
        
       
        
        
        
        if(250000 <A && 500000>A){
            float result= (A*5)/100;
            System.out.println("You need to pay 5% of your salary total " +result  +"tax per month");
        }
        else if 
            (500000<A && 100000>A ){
                float result=(A*20)/100;
                System.out.println("you need to pay 20% of your salary total " +result+ "tax per month");
             } 
        else if(100000<A)
        {
            float result=(A*30)/100;
            System.out.println("you need to pay 30% of your salary total  "+ result +"tax per month");

        }
        else {
            System.out.println("Nothing paid of your salary");
        }
        
       
                 
       
       

 
        
    }
    
}
