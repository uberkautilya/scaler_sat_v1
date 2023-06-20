import java.util.Arrays;

/**
 * Return true if any combination exists among the elements whose sum is zero
 */
public class SumZeroCombinationInArray {

    static Integer[] originalArray = new Integer[]{
            -100, 20, 12, -11, 50, 53, -2, -25, 1
    };

    public static void main(String[] args) {
        boolean doExist = combinationExists(originalArray, 0);

        if (doExist) {
            System.out.println("Combination exists whose sum is Zero");
        } else
            System.out.println("No such combination exists");
    }

    private static boolean combinationExists(Integer[] array, int sum) {

        for (int i = 0; i < array.length; i++) {
            int newSum = sum + array[i];
            if (newSum == 0) {
                printEffectiveArray(originalArray, removeElementAt(array, i));
                return true;
            }
            Integer[] newArray = removeElementAt(array, i);
            boolean doExist = combinationExists(newArray, newSum);
            if (doExist) {
                return true;
            }
        }
        return false;
    }

    private static void printEffectiveArray(Integer[] originalArray, Integer[] integers) {
        System.out.println("originalArray = " + Arrays.toString(originalArray));
        System.out.println("integers = " + Arrays.toString(integers));
        Integer[] effectiveArray = null;

        for (Integer val : integers) {
            effectiveArray = removeElement(originalArray, val);
        }
        System.out.println(Arrays.toString(effectiveArray));
    }

    private static Integer[] removeElementAt(Integer[] array, int index) {

        Integer[] newArray = new Integer[array.length - 1];
        for (int i = 0; i < array.length; i++) {
            if (i < index) {
                newArray[i] = array[i];
            } else if (i != array.length - 1) {
                newArray[i] = array[i + 1];
            }
        }
        return newArray;
    }

    private static Integer[] removeElement(Integer[] array, int el) {

        Integer[] newArray = new Integer[array.length];
        boolean isFound = false;
        for (int i = 0; i < array.length; i++) {

            if (!isFound && array[i] == el) {
                isFound = true;
            }
            if (!isFound) {
                newArray[i] = array[i];
            } else if (i != array.length - 1) {
                newArray[i] = array[i + 1];
            }
        }
        return isFound ? Arrays.copyOfRange(newArray, 0, array.length - 1) : array;
    }
}
