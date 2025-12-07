import java.util.Arrays;
import java.util.Scanner;

public class EX55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();//nextInt일때는 enter로 나눠도 되고 스페이스바로 나눠도 된다!
        }
        System.out.println("버블 정렬 전");
        System.out.println(Arrays.toString(arr));

        bubbleSort(arr);
        System.out.println("버블 정렬 후");
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr){//0번 자리와 1번자리의 숫자를 교환하여 숫자비교를 하여 작은것이 왼편에 큰것이 오른편에 오게 하는 방법이다.
        for (int i = 0; i< arr.length;i++ ){
            for (int j= i+1; j < arr.length;j++ ){
                if (arr[i] > arr [j]){//오름차순 (arr[i] < arr[j] 내림차순)
                    int temp = arr[i];
                    arr[i] = arr [j];
                    arr[j] = temp;
                }
            }//Arrays.sort(arr)과 동일한 내용
        }
    }
}
