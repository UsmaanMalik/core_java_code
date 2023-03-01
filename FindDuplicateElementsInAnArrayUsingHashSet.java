import java.util.HashSet;
import java.util.Set;

/**
 * Using program to find duplicate elements in an array using hashset
 */

class FindDuplicateElementsInAnArrayUsingHashSet {
    public static void main(String[] args) {
        int[] inputNumArray = { 10, 5, 10, 34, 70, 50, 50, 70, 60, 45, 24, 78, 24, 50, 89, 10 };
        Set<Integer> dupNumberSet = new HashSet<>();
        for (Integer number : inputNumArray) {
            if (!dupNumberSet.add(number)) {
                System.out.println("Duplicate Elements found" + " " + number);
            }
        }
    }
}
