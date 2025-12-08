import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_19599 {
    static int [] arr;

    //A에서 이분 탐색으로 val값을 찾기 위해 필요한 비교 횟수 반환
        public static int binary_search(int target, int left, int right) {
         int count = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (mid == target) {
                return count;
            }
            count++; // mid를 참조했으나 target이 아님 -> 참조 카운트 증가
            if (target < mid) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return count;
    }
    //A에서 삼분 탐색으로 val값을 찾기 위해 필요한 비교 횟수 반환
      public static int ternary_search(int target, int left, int right) {
        int count = 0;
        while (left <= right) {
            int left_third = left + (right - left) / 3;
            int right_third = right - (right - left) / 3;

            // 1. 왼쪽 1/3 지점 확인
            if (left_third == target) {
                return count;
            }
            count++; // left_third 참조했으나 실패

            // 2. 오른쪽 1/3 지점 확인
            if (right_third == target) {
                return count;
            }
            count++; // right_third 참조했으나 실패

            // 3. 다음 구간으로 이동
            if (target < left_third) {
                right = left_third - 1;
            } else if (target < right_third) {
                left = left_third + 1;
                right = right_third - 1;
            } else {
                left = right_third + 1;
            }
        }
        return count;
    }

    public static void main(String[] args)throws Exception{

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 입력 N 읽기
        String input = br.readLine();
        if (input == null) return;
        int N = Integer.parseInt(input);

        int winBinary = 0; // Bi < Ti
        int same = 0;      // Bi == Ti
        int winTernary = 0;// Bi > Ti

        // 0부터 N-1까지 모든 수를 타겟으로 시뮬레이션
        for (int i = 0; i < N; i++) {
            int b_cnt = binary_search(i, 0, N - 1);
            int t_cnt = ternary_search(i, 0, N - 1);

            if (b_cnt < t_cnt) {
                winBinary++;
            } else if (b_cnt > t_cnt) {
                winTernary++;
            } else {
                same++;
            }
        }

        System.out.println(winBinary);
        System.out.println(same);
        System.out.println(winTernary);
    }
}
