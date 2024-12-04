public class demo {
    public static int largestNum(int numbers[]) {
        int greatestNum = Integer.MIN_VALUE; // Initialize to smallest possible integer
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > greatestNum) {
                greatestNum = numbers[i];
            }
        }
        return greatestNum;
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int ans = largestNum(numbers);
        System.out.println(ans);
    }
}
