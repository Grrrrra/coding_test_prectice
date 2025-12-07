import java.util.Scanner;
class Solution {
    public static int solution(int order) {
            int answer = 0;
            //
            //1
            /**
            String s = String.valueOf(order);
            for(int i = 0; i<s.length(); i++){
                char ch = s.charAt(i);
                if(ch == '3' || ch == '6'|| ch == '9')answer++;
            }

            //2
            while(order >0 ){
                if((order%10 == 3)||(order%10 == 6)||(order%10 == 9)){
                    answer++;
                }
                order = order /10;
            }
             */
            //3
            answer = String.valueOf(order).replaceAll("[^369]","").length();
            return answer;
        }
    public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println(solution(n));
        }
}