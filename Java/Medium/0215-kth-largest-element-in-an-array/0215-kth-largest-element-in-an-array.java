class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());

        for(int n : nums){
            heap.offer(n);
        }
        
        int top = 0;
        while(k > 0){
            top = heap.poll();
            k--;
        }
        return top;
    }
}