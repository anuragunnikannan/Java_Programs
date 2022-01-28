import java.util.*;
public class ConvertInfixToPostfix
{
    public int getPrecedence(char x)
    {
        switch(x)
        {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }

    /* public boolean isRightAssociative(char x)
    {
        if(x == '^')
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean hasHigherPrecedence(char top, char x)
    {
        int pr1 = getPrecedence(top);
        int pr2 = getPrecedence(x);
        if(pr1 == pr2)
        {
            if(isRightAssociative(top))
            {
                return false;       //Left Associative Operand is given higher priority than Right Associative Operand
            }
            else
            {
                return true;
            }
        }
        else
        {
            return pr1 > pr2 ? true : false;
        }
    } */

    public String infixToPostfix(String exp)
    {
        String res = "";
        Stack<Character> st = new Stack<>();
        for(int i = 0;i<exp.length();i++)
        {
            char c = exp.charAt(i);
            if(Character.isLetter(c) || Character.isDigit(c))
            {
                res = res + c;
            }
            else if(c == '(')
            {
                st.push(c);
            }
            else if(c == ')')
            {
                while(!st.isEmpty() && st.peek() != '(')
                {
                    res = res + st.pop();
                }
                st.pop();   //removing the opening bracket
            }
            else if(c == '+' || c == '-' || c == '*' || c == '/' || c == '^')
            {
                while(!st.empty() && st.peek() != '(' && getPrecedence(st.peek()) >= getPrecedence(c))
                {
                    res = res + st.pop();
                }
                st.push(c);
            }
        }
        while(!st.isEmpty())
        {
            res = res + st.pop();
        }
        return res;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter infix expression:");
        String exp = sc.nextLine();
        /* String exp = "a+b*(c^d-e)^(f+g*h)-i"; */
        ConvertInfixToPostfix obj = new ConvertInfixToPostfix();
        System.out.println(obj.infixToPostfix(exp));
        sc.close();
    }
}