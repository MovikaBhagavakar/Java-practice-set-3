package PS_4;

import java.util.Scanner;
 
public class ans_5 {
    public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);

    System.out.println("Enter the year");
    int year = inp.nextInt();

    if( year %4==0){ 
        System.out.println(" The year "+year+" is a leapyear");
    }
    else {
        System.out.println(" The year "+year+" is not a leapyear");
    }
    
    
 
        
    }
    
}
