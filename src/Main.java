import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        первая задача
        int[] arr = new int[]{0,1,1,2,3,5,8,13,21,34,55,89,144,233,377};
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                System.out.println(arr[i]);
            }

        вторая задача
        int max = 0;
        int min = 0;
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] =  ((int) (Math.random() * 120)-70);
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);;
        System.out.println(Arrays.toString((arr)));
        */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int k = 0;
        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
            if (arr[0] == arr[i]){
                k += 1;
            }
        }
        if(k==arr.length){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
        System.out.println(Arrays.toString(arr));

    }

}