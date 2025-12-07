import java.util.Arrays;
import java.util.Scanner;

public class EX54 {
    public static void main(String[] args) {
        /**
         * 이진 검색
         */
        int[] arr = {1, 3, 65, 4, 78, 6, 5, 10, 7, 2};

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Arrays.sort(arr);
        int idx = Arrays.binarySearch(arr, n);
        System.out.println(idx);
    }
}
