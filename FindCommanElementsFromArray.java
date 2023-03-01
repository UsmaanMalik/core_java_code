class FindCommanElementsFromArray {
    public static void main(String[] args) {
        int[] inputNumArray = { 20, 100, 45, 540, 256, 245, 0125, 245, 012, 0145, 455, 424, 254 };
        int[] inputNumArray1 = { 44, 754, 685, 6552, 458, 45, 458, 40, 20, 012, 452, 0145, 254, 100 };
        // loop through the first input array (inputarray) in the outer loop
        for (int i = 0; i < inputNumArray.length; i++) {
            /*
             * traversing through the second input array (inputAray1) in the outer loop
             * loops and compare the elements of the outer array (inputArray) with all the
             * elements of the inner array
             */
            for (int j = 0; j < inputNumArray.length; j++) {
                if (inputNumArray[i] == inputNumArray1[j]) {
                    System.out.println(inputNumArray[i]);
                    break;
                }
            }
        }
    }
}
