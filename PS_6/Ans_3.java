package PS_6;

public class Ans_3 {
    public static void main(String[] args) {

        int arr[] = { 78, 90, 89 };
        float avarage = 0;
        for (int i : arr) {

            avarage = avarage + i;

        }
        System.out.println("The value  of average marks is " + avarage /arr.length);

    }

}
