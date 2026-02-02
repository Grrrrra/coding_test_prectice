import java.io.IOException;
import java.util.Scanner;

public class test_1436 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 1;
        int num = 666;
        //문제에서 말하길 666의 종말의 숫자가 1개씩 나올때마다 count를 1증가시킨다. 이때 
        //6666이 되는 경우는 총 13가지일 것이다. 왜냐면 666/6에도 포함 6/666에도 포함이 될 것이니까.
        //만약 a입력값이 count와 동일해지는 순간 num++가 없어져 1을 입력해도 666이 출력된다.
        while(count != a){
            num++;
            if(String.valueOf(num).contains("666")){
                count++;
            }
            
        }
        System.out.println(num);

        sc.close();
    }
}
