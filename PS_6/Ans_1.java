package PS_6;

public class Ans_1 {
    public static void main(String[] args) {
        float arr[] = { 4.6f, 7.6f, 9.7f, 8.7f, 4.5f };
        float sum = 0f;

        System.out.println(arr.length);

        for (int x = 0; x <= arr.length - 1; x++) {
            System.out.print(arr[x] + " ");
            sum=sum+arr[x];

        }
        System.out.println(" \nsum of all the number of an array:" + sum);
    }

}
