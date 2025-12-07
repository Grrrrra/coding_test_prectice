import java.util.*;

/**
 * 이진 검색
 * 반드시 오름차순 또는 내림차순이 선행되어야 한다.
 *
 */

public class EX53 {
    public static void main(String[] args){
        int[] arr = {1, 3, 65, 4, 78, 6, 5, 10, 7, 2};
        //1,2,3,4,5,6,7,10,65,78
        /**
         * 내가 찾는 숫자와 반을 때었을때 크기를 비교한다
         * 내가 찾는 숫자보다 왼쪽이 작으면 뒤에껀 무시하고 다시 왼쪽있는 반에서 또 반을 나눈다.
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int idx = SequenceSearch.search(arr, n);

        if(idx == -1) System.out.println("숫자가 없습니다.");
        else System.out.println(String.format("찾는 숫자 %d 는 arr[%d]에 존재합니다.",n,idx));

    }
}
class BinSearch{
    static int search(int[]arr, int key){//static은 c언어의 포인터같이 주소를 가져오는 형태로 기억하면 된다.
        //정렬
        Arrays.sort(arr); //1,2,3,4,5,6,7,10,65,78 (오름차순)
        //시작 번호 만들기 배열의 첫번째 인덱스
        int start = 0;
        int end = arr.length-1;//배열의 마지막 인덱스
        do {
            //가운데 인덱스 찾기
            int center = (start + end) / 2;
            if (arr[center] == key){
                return center;
            }
            if (key > arr[center]){
                start = center + 1;//키값이 중간 값보다 크다? 중간값 기준에서 +1한 값을 시작점으로 리셋

            }else end =center-1;// 키값이 중간 값보다 작다? 중간값 기준에서 -1한 값을 종단점으로 리셋
        }
        while(start <=end);
        return -1;
    }
}