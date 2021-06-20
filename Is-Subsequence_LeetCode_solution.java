class Solution {
    public boolean isSubsequence(String s, String t) {
        char ch1[]=s.toCharArray();
        char ch2[]=t.toCharArray();
        Stack<Character> stack=new Stack<>();
        for(int i=ch1.length-1;i>=0;i--)
        {
            stack.push(ch1[i]);
        }
        if(stack.isEmpty())
        {
            return true;
        }
        for(int i=0;i<ch2.length;i++)
        {
            
            if(stack.peek()==ch2[i])
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                break;
            }
        }
        return stack.isEmpty();
    }
}
