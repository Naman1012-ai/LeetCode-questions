class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length < 2) return stones[0];
        
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());

        for(int s : stones){
            heap.offer(s);
        }

        while(heap.size() != 1){
            int n = heap.poll();
            int m = heap.poll();

            heap.offer(n - m);
        }

        return heap.isEmpty() ? 0 : heap.peek();
    }
}