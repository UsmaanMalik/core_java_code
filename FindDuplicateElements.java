/**
 * java program to find duplicate elements in an array
 * looping throw and elements compare
 */
class FindDuplicateElements {
    public static void main(String[] args) {
        int[] inputNumArray = { 10, 5, 10, 34, 24, 90, 24, 70, 100, 102, 100, 24 };
        for (int i = 0; i < inputNumArray.length; i++) {
            for (int j = i + 1; j < inputNumArray.length; j++) {
                if (inputNumArray[i] == inputNumArray[j]) {
                    System.out.println("Duplicate Elements found:" + inputNumArray[i]);
                }
            }
        }
    }
}