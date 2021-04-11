package PS_6;

public class Ans_4 {
    public static void main(String[] args) {
        int arr [][]=new int[2][3];

        arr[0][0] = 45; 
        arr[0][1] = 78; 
        arr[0][2] = 02;
        arr[1][0] = 67;
        arr[1][1] = 89;
        arr[1][2] = 78;
        

        for(int i =0; i <=arr.length-1; i++){
            for(int j=0; j<=arr[i].length-1; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }

        

        

        

        



    }
    
}
