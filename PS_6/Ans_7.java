package PS_6;

public class Ans_7 {
    public static void main(String[] args) 
    {
        
    
    int arr[]={78,56,89,90};
    int min= arr[0];

    for(int i=0; i<= arr.length-1; i++)
    {
        if(min>arr[i])
        min= arr[i];
    }
            

System.out.println("The arr Maximum value is =" +min);
}
}

            

