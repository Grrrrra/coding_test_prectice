import java.util.*;
public class test_30802 {
    public static void main(String[] args){
        //티셔츠는 S,M,L,XL,XXL,XXXL 총 6가지 같은 사이즈로 T장 묶음으로 구매 가능
        // 펜은 한 종류로, P자루씩 묶음으로 주문하거나 한 자루씩 주문할 수 있다.
        //티셔츠는 남아도 되지만 부족해서는 안되고 신청한 사이즈 대로 나눠주어야 합니다.
        // 펜은 남거나 부족해서는 안 되고 정확히 참가자 수만큼 준비되어야 한다.
        // 첫줄에 참가자의 수 N이 주어진다.
        Scanner sc = new Scanner(System.in);
        int person = sc.nextInt();
        sc.nextLine();
        int [] arr = new int[6];
        
        String line = sc.nextLine();
        String [] parts = line.split(" ");

        for(int i = 0; i<6; i++){
            arr[i] = Integer.parseInt(parts[i]);
        }
        //셋째 줄에 정수 티셔츠와 펜의 묶음 수를 의미하는 정수 T와 P가 공백으로 구분되어 주어집니다.
        line = sc.nextLine();
        parts = line.split(" ");
        int T = Integer.parseInt(parts[0]);
        int P = Integer.parseInt(parts[1]);
        int total_T = 0;
        for(int i = 0; i<6;i++){
            int shirts = arr[i];
            if(shirts%T == 0){
                total_T += shirts/T;
            }else{
             total_T += shirts/T +1;
            }
        }
        int total_P = person/P;
        int remain_P = person%P;
        System.out.println(total_T);
        System.out.print(total_P + " " + remain_P);
        sc.close();
    }
}
