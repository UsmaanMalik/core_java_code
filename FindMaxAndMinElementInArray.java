//find largest and smallest number in array
class FindMaxAndMinElementInArray {

    public static void main(String[] args) {
        int[] inputNumArray = { 12, 54, 25, 421, 68, 457, 2546, 421, 5, 236, 145, 254, 256, 2455, 2568, 45, 10, 4 };

        int maxNumber = inputNumArray[0];
        int minNumber = inputNumArray[0];

        for (int i = 0; i < inputNumArray.length; i++) {
            if (maxNumber < inputNumArray[i]) {
                maxNumber = inputNumArray[i];
            } else if (minNumber > inputNumArray[i]) {
                minNumber = inputNumArray[i];
            }
        }
        System.out.println("Largest number:" + maxNumber + ",Smallest Number:" + minNumber);
    }

}
