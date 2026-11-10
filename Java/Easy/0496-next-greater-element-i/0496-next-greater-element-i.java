class Solution {
    private int checkElement(int x, int[] nums2){
        for(int i = 0 ; i < nums2.length; i++){
            if(i == (nums2.length - 1)) return -1;
            if(nums2[i] == x){
                for(int j = i + 1; j < nums2.length; j++){
                    if(nums2[j] > x){
                        return nums2[j];
                    }
                }
            }
        }
        return -1;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        int i = 0;
        for(int x : nums1){
            int c = checkElement(x, nums2);
            ans[i++] = c;
        }

        return ans;
    }
}