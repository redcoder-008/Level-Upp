
    import java.util.Stack;

public class SmallestNumberAfterRemovingKDigits {
    public String removeKdigits(String num, int k) {
        // Edge case: if k is equal to or greater than the number of digits
        if (k >= num.length()) return "0";

        Stack<Character> stack = new Stack<>();

        // Iterate through each digit in the number
        for (char digit : num.toCharArray()) {
            // Remove digits from the stack if:
            // 1. Stack is not empty
            // 2. The current digit is smaller than the top of the stack
            // 3. We still need to remove more digits (k > 0)
            while (!stack.isEmpty() && stack.peek() > digit && k > 0) {
                stack.pop();
                k--;
            }
            // Add the current digit to the stack
            stack.push(digit);
        }

        // If there are still digits to remove, remove them from the end
        while (k > 0) {
            stack.pop();
            k--;
        }

        // Build the resulting number from the stack
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }

        // Remove leading zeros
        while (result.length() > 0 && result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }

        // If the result is empty, return "0"
        return result.length() == 0 ? "0" : result.toString();
    }

    public static void main(String[] args) {
        SmallestNumberAfterRemovingKDigits solution = new SmallestNumberAfterRemovingKDigits();
        System.out.println(solution.removeKdigits("1432219", 3)); // Output: "1219"
        System.out.println(solution.removeKdigits("10200", 1));   // Output: "200"
        System.out.println(solution.removeKdigits("10", 2));      // Output: "0"
    }
}

    

