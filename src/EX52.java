import java.util.Scanner;
/**
 * 선형검색 (순차검색)
 */
public class EX52 {
    public static void main (String[] args) {
        int[] arr = {1, 3, 65, 4, 78, 6, 5, 4, 7, 2};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int idx = SequenceSearch.search(arr, n);

        if(idx == -1){
            System.out.println("숫자가 없습니다.");

        }
        else{
            System.out.println(String.format("찾는 숫자 %d 는 arr[%d]에 존재합니다.",n,idx));
        }
    }
}//하위 클래스를 상위 클래스로 상속받는 경우 (오버라이딩)
class SequenceSearch{ //만약에 클래스가 엄청 많을때 static을 그대로 올려서 사용하는 형식은 오버클럭 일어날 수 있다.
    static int search(int [] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) return i;//배열에서 순차 검색을 하게된다.
        }
            return -1;//찾으려는 숫자가없으면 리턴 -1
        }// 배열에 데이터 10억개 이상 되면 시간 초가 유의
    }
