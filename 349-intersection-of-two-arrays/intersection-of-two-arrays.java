class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        boolean[] seen = new boolean[1001];
        for (int i = 0; i < nums1.length; i++) {
            seen[nums1[i]] = true;
        }

        boolean[] added = new boolean[1001];
        int count = 0;
        for (int i = 0; i < nums2.length; i++) {
            int num = nums2[i];
            if (seen[num] && !added[num]) {
                added[num] = true;
                count++;
            }
        }

        int[] result = new int[count];
        int idx = 0;
        for (int i = 0; i <= 1000; i++) {
            if (added[i]) {
                result[idx++] = i;
            }
        }

        return result;
    }
}