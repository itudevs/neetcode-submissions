class Solution {
    public boolean isValid(String s) {
        //assume its valid 
         boolean valid=true;
        Stack stack=new Stack<>();
        //convert string into char array
        char[] characters=s.toCharArray();
        //stack lifo (last in first out)
        Map<Character, Character> closeToOpen = new HashMap<>();
        closeToOpen.put(')', '(');
        closeToOpen.put(']', '[');
        closeToOpen.put('}', '{');
        for(char c:characters){
           if (closeToOpen.containsKey(c)) {
                if (!stack.isEmpty() && stack.peek() == closeToOpen.get(c)) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        if(!stack.isEmpty())  valid=false;
        return valid ;


    }
}
