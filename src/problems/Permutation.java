package problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {

    public static void main(String[] args) {
        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        String str = "abc";
        StringBuffer strBuf = new StringBuffer(str);
        Permutations(strBuf,str.length());
    }
    private static void Permutations(StringBuffer str, int index){

        if(index <= 0)
            System.out.println(str);
        else {
            Permutations(str, index-1);
            int currPos = str.length()-index;
            for (int i = currPos+1; i < str.length(); i++) {
                swap(str,currPos, i);
                Permutations(str, index-1);
                swap(str,i, currPos);
            }
        }
    }
    private  static void swap(StringBuffer str, int pos1, int pos2){
        char t1 = str.charAt(pos1);
        str.setCharAt(pos1, str.charAt(pos2));
        str.setCharAt(pos2, t1);
    }
}

