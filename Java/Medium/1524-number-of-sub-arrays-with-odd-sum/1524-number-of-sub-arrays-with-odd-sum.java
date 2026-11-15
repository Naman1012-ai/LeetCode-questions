class Solution {
    public int numOfSubarrays(int[] arr) {
        int mod = 1_000_000_007;
        int even = 1, odd = 0, parity = 0;
        int ans = 0;

        for(int x : arr){
            parity ^= (x & 1);
            if(parity == 1){
                ans = (ans + even) % mod;
                odd++;
            }
            else{
                ans = (ans + odd) % mod;
                even++;
            }
        }
        return ans;
    }
}