package class10.dsa.stack.structure;

import class10.dsa.stack.data.stackNode;

public class MultiBracket {

    stack stack = new stack();

    public MultiBracket(stack stack) {
        this.stack = stack;
    }

    public boolean validateBrackets(String brackets)
    {
        for (int i = 0; i < brackets.length(); i++) {
            if (brackets.charAt(i) == '(' || brackets.charAt(i) == '[' || brackets.charAt(i) == '{')
            {
                stack.push(String.valueOf(brackets.charAt(i)));
            }
            else {
                String top = String.valueOf(stack.peek());
                if (    (brackets.charAt(i) == ')' && top.contains("(")) ||
                        (brackets.charAt(i) == ']' && top.contains("[")) ||
                        (brackets.charAt(i) == '}' &&top.contains("{")))
                {
//                        System.out.println(stack.peek());
                        stack.pop();
                    }
                    else if(brackets.charAt(i) == ')' || brackets.charAt(i) == ']' || brackets.charAt(i) == '}')
                    {
                        return false;
                    }
                }
            }
        if(stack.isEmpty()){
            return true;
        }
        return false;
        }

}


