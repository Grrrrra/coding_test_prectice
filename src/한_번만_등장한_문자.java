import java.util.Arrays;

public class 한_번만_등장한_문자 {
    /**
     * 문자의 등장 횟수를 세어 한 번만 등장한 문자를 사전 순으로 반환
     */
    public String solution(String s) {
        int[] counts = new int[26]; //26개 알파벳 기준

        for (char c : s.toCharArray()) {
            counts[c - 'a']++;
        }

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            if (counts[i] == 1) {//정확히 1번 나온경우
                char onceChar = (char) ('a' + i);
                answer.append(onceChar);
            }
        }
        return answer.toString();
    }
    //2
    public String solution_2(String s) {
        String answer = "";

        for (int i = 0; i < 26; i++) {
            String a = String.valueOf((char) ('a' + i));
            int cnt = s.replace(a, "").length();
            if (s.length() < cnt) {
                answer += a;
            }
        }
        return answer;
    }

    public String solution_3(String s) {
        int[] a = new int[26];
        for (int i = 0; i < s.length(); i++) {
            a[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < a.length; i++) {
            String answer = "";
            if (a[i] == 1) answer += (char) (i + 'a');
        }
    }


}