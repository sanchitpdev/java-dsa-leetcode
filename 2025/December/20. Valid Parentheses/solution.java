class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<s.length();i++){
            char curr = s.charAt(i);
            if(curr == '('||curr == '{'|| curr == '['){
                stack.push(curr);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                if(stack.peek() == '(' && curr == ')' || 
                   stack.peek() == '{' && curr == '}' || 
                   stack.peek() == '[' && curr == ']'){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
