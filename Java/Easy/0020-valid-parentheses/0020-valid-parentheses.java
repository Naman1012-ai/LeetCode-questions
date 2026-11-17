class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> m = new HashMap<>();

        m.put(')', '(');
        m.put(']', '[');
        m.put('}', '{');

        for(char c : s.toCharArray()){
            if(m.containsValue(c)){
                stack.push(c);
            }
            else if(m.containsKey(c)){
                if(stack.isEmpty() || m.get(c) != stack.pop()){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}