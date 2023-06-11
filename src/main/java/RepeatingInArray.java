import java.util.ArrayList;
import java.util.Map;

public class RepeatingInArray {
    public static void main(String[] args) {

    }

    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {

        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

/*      //Also works
        for (int a : A) {
            if (B.contains(a)) {
                result.add(a);
                B.remove(Integer.valueOf(a));
            }
        }*/

        while (i < A.size() && j < B.size()) {
            int a = A.get(i);
            int b = B.get(j);
            if (a == b) {

                result.add(a);
                A.remove(i);
                B.remove(j);
                j = 0;
            } else {

                j++;
                if (j == B.size()) {
                    j = 0;
                    i++;
                }
            }
        }

        return result;
    }

}
