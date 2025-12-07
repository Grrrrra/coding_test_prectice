import java.util.Arrays;

public class Ex56 {
    /**
     * 선택 정렬
     * @param args
     */
    public static void main(String[] args) {
        int [] x = {1,7,5,4,10,6,12,16,20,2};
        System.out.println("선택 정렬 전");
        System.out.println(Arrays.toString(x));
        selectionSort(x);
        System.out.println("선택 정렬 후");
        System.out.println(Arrays.toString(x));
    }//교환 선택 삽입 알고리즘 3개 있다.
    static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            int idx = i;
            for (int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[idx]){//최소값을 찾아 해당 인덱스 변경
                    idx = j;
                }
                int tmp = arr[i];
                arr[i] =arr[idx];
                arr[idx] = tmp;
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
