import java.util.*;
import java.io.*;


public class test_19599 {
    static int [] arr;
    public static int binary_search(int []A, int value, int left, int right) {
        int mid =(left + right) / 2;
        if (A[mid] == value)
            return mid;
        else if (value < A[mid])
            return binary_search(A, value, left, mid - 1);
        else
            return binary_search(A, value, mid + 1, right);
    }
     public static int ternary_search(int []A, int value, int left, int right) {
        int left_third = left + ((right-left) / 3);
        int right_third = right - ((right-left) / 3);
        if (A[left_third] == value)
            return left_third;
        else if (A[right_third] == value)
            return right_third;
        else if (value < A[left_third])
            return ternary_search(A, value, left, left_third-1);
        else if (value < A[right_third])
            return ternary_search(A, value, left_third + 1, right_third - 1);
        else
            return ternary_search(A, value, right_third + 1, right);
    }

    public static void solution()throws IOException{
        Arrays.sort(arr);


    }
    public static void main(String[] args)throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int A = Integer.parseInt(st.nextToken());

    int [] arr = new int [A];
    for (int i=0;i<A;i++){
        arr[i] = i;
    }


    }
}