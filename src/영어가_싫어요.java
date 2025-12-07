import java.util.Scanner;

public class 영어가_싫어요 {
    public static long solution(String numbers){

        String [] num_arr ={"zero","one","two","three","four","five","six","seven","eight","nine"};

        for (int i = 0; i < num_arr.length; i++) {
            numbers = numbers.replaceAll(num_arr[i], String.valueOf(i));
        }

        long answer = Long.parseLong(numbers);
        return answer;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        System.out.println(영어가_싫어요.solution(n));
        sc.close();
    }
}
