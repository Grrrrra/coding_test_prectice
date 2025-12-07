import java.util.*;

class 특이한_정렬 {
    public int[] 특이한_정렬(int[] numlist, int n) {
        Arrays.sort(numlist);


        for (int i = 0; i < numlist.length; i++) {
            for (int j = 0; j < numlist.length; j++) {
                if(Math.abs(numlist[i]-n)<=Math.abs (numlist[j]-n)) {
                    int temp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = temp;
                }
            }
        }
        return numlist;
    }
}