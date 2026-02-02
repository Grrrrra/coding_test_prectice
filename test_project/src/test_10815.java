
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class test_10815 {
    // 이분 탐색 메서드 추가
    private static boolean binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
    private static void quickSort(int[] arr, int low, int high){
        if(low>=high){
            return;
        }
        int pivot = low+(high - low)/2;
        int pivotValue = arr[pivot];

        int left = low;
        int right = high;
        while(left<= right){
            while(arr[left]<pivotValue){
                left++;
            }
            while(arr[right] > pivotValue){
                right--;

            }
            if(left <= right){
                int tmp = arr[right];
                arr[right] = arr[left];
                arr[left] = tmp;
                left++;
                right --;
            }
        }
        quickSort(arr, low, right);
        quickSort(arr, left, high);
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int []arr1 = new int[N];
        
        String line = br.readLine();  // 한 줄 읽기
        String[] parts = line.split(" ");  // 공백 기준으로 나누기
        
        int i = 0;
        while(i<N){
            arr1[i] = Integer.parseInt(parts[i]);
            i++;
        }
        quickSort(arr1, 0, N - 1);

        int M = Integer.parseInt(br.readLine());
        int []arr2 = new int[M];
        
        line = br.readLine(); // 새로운 줄 읽기
        String[] parts2 = line.split(" ");
        i=0;
        while(i<M){
            arr2[i] = Integer.parseInt(parts2[i]);
            i++;
        }

        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < M; j++) {
            if(binarySearch(arr1, arr2[j])) {
                sb.append("1 ");
            } else {
                sb.append("0 ");
            }
        }
        System.out.println(sb.toString().trim());
    }
}
