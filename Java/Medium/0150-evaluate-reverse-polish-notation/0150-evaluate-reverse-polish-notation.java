class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String c : tokens){
            if(c.equals("+")){
                stack.push(stack.pop() + stack.pop());
            }
            else if(c.equals("-")){
                int s = stack.pop();
                int f = stack.pop();
                stack.push(f - s);
            }
            else if(c.equals("*")){
                stack.push(stack.pop() * stack.pop());
            }
            else if(c.equals("/")){
                int s = stack.pop();
                int f = stack.pop();
                stack.push(f / s);
            }
            else{
                stack.push(Integer.parseInt(c));
            }
        }
        return stack.peek();
    }
}