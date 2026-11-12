class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int one = 0, zero = 0;
        for(int s : students){
            if(s == 0) zero++;
            else one++;
        }

        for(int s : sandwiches){
            if(s == 0){
                if(zero == 0) return one;
                zero--;
            }
            else{
                if(one == 0) return zero;
                one--;
            }
        }
        return 0;
    }
}