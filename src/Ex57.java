import java.util.Arrays;

/**
 * 삽입 정렬
 */
public class Ex57 {
    public static void main(String[] args) {
        int []x = {1, 7, 5, 4, 10, 6, 12, 16, 20, 2};
        System.out.println("삽입 정렬 전");
        System.out.println(Arrays.toString(x));
        insertSort(x);
        System.out.println("삽입 정렬 후");
        System.out.println(Arrays.toString(x));
    }
    static void insertSort(int[] arr) {
        for (int i =1; i< arr.length;i++){
            int j;
            int tmp = arr[i];
            for (j=i;j>0 && arr[j-1]>tmp; j--){
                arr[j] = arr[j-1];
            }
            arr[j] = tmp; //기준점에서 앞에있는 숫자가 기준점보다 크게 된다면 교환하여 정렬하는 방식
            System.out.println(Arrays.toString(arr));
        }
    }
}
