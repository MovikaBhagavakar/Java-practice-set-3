package PS_4;

import java.util.Scanner;

public class ans_6 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter your Url");
        String site = inp.nextLine();

        if(site.endsWith(".com") ){
            System.out.println("you website "+site+"  is Commercial Website");

        }
        else if (site.endsWith(".in") ){
            System.out.println("you website "+site+"  is Indian Website");
        }

        else if (site.endsWith(".org")){
            System.out.println("you website "+site+"  is Organization Website");
        }
        else{
            System.out.println("unable to open the wabpage");
        }


            
        

        

        



        

        
        
    }
    
}
