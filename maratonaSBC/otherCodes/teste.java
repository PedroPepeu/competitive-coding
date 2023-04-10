class Solution {
    public int[] plusOne(int[] digits) {
        int sum = 0;
        for(int i = digits.length(), int counter = 1; i > 0; i--) {
            sum += digits[i] * counter;
        }
        sum++
    }
}
