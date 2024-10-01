import java.util.Stack;
/*
5. Convert an infix expression to postfix using a stack. 
 Test Case 1: 
Input: "A + B * C" 
Output: "A B C * +" 
 Test Case 2: 
Input: "A * B + C / D" 
Output: "A B * C D / +" 
*/
public class Q5 {
    public static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public static String infixToPostfix(String exp) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
for (char c : exp.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String exp = "A+B*C";
        System.out.println(infixToPostfix(exp));
		String exp1 = "A*B+C/D";
        System.out.println(infixToPostfix(exp1));
    }
}
