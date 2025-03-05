public class problem66 {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        int[] digits = { 1, 2, 3 };
        int[] result = plusOne(digits);
        for (int digit : result) {
            System.out.print(digit + " ");
        }
    }
}
