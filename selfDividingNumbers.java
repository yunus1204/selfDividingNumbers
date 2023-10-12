
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) {
                result.add(i);
            }
        }
        return result;
    }

    public boolean isSelfDividing(int x) {
        int num = x;
        while (x > 0) {
            int digit = x % 10;
            if (digit == 0 || num % digit != 0) {
                return false;
            }
            x = x / 10;
        }
        return true;
    }
}
