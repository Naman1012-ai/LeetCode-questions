class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);;
            if(!st.isEmpty()){
                char l = st.peek();
                if( (l == '(' && c == ')') ||
                    (l == '[' && c == ']') ||
                    (l == '{' && c == '}')){
                    st.pop();
                    continue;
                }
            }
            st.push(c);
        }
        return st.isEmpty();
    }

    private boolean ispair(char l, char c){
        return  (l == '(' && c == ')') ||
                (l == '[' && c == ']') ||
                (l == '{' && c == '}');
    }
}