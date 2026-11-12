class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();
        int top = 0, count = 0;

        for(int s : students){
            q.add(s);
        }

        while(!q.isEmpty() && count != q.size()){
            if(q.peek() == sandwiches[top]){
                count = 0;
                top++;
                q.poll();
            }
            else{
                q.add(q.poll());
                count++;
            }
        }
        return q.size();
    }
}