import java.util.*;

class test_1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();  // 개행문자 소비
        
        String[] arrString = new String[n];
        for(int i = 0; i < n; i++) {
            arrString[i] = sc.nextLine();
        }
        
        Set<String> arrSet = new HashSet<>(Arrays.asList(arrString));
        String[] uniqueArray = arrSet.toArray(new String[0]);
        Arrays.sort(uniqueArray,new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                if(s1.length() == s2.length()){
                    return s1.compareTo(s2);
                }
                return s1.length()-s2.length();
            }
        });
        for (int i = 0; i < uniqueArray.length; i++) {
            System.out.println(uniqueArray[i]);
        }
        sc.close();
    }
}
