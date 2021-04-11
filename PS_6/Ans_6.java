package PS_6;

public class Ans_6 {
    public static void main(String[] args) {
        int arr[]={90,89,101,56,67};
        int max= arr[0];

        for(int i=0; i<= arr.length-1; i++){
            if(max<arr[i])
            max= arr[i];
                
    }
    System.out.println("The arr Maximum value is =" +max);
               

        
        
    }
    
}
