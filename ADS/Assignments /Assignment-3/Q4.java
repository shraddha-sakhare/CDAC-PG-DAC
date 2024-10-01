
/*
4. Evaluate a postfix expression using a stack. 
 Test Case 1: 
Input: "5 3 + 2 *" 
Output: 16 
 Test Case 2: 
Input: "4 5 * 6 /" 
Output: 3 
*/



import java.util.Stack;

public class Q4 {

    public static int evaluatePostfix(String exp) {
        Stack<Integer> stack = new Stack<>();
        
        for (char c : exp.toCharArray()) {
            if (Character.isDigit(c)) {
                // If the character is a digit, convert it to integer and push to stack
                stack.push(c - '0');
            } else if (c == ' ') {
                // Ignore spaces in the input
                continue;
            } else {
                // Operator encountered, pop two operands
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                
                switch (c) {
                    case '+':
                        stack.push(operand1 + operand2);
                        break;
                    case '-':
                        stack.push(operand1 - operand2);
                        break;
                    case '*':
                        stack.push(operand1 * operand2);
                        break;
                    case '/':
                        stack.push(operand1 / operand2);
                        break;
                }
            }
        }
        
        // The final result will be the only element left in the stack
        return stack.pop();
    }

    public static void main(String[] args) {
        // Test Case 1
        String exp1 = "5 3 + 2 *"; // Expected output: 16
        System.out.println("Result of expression : " + evaluatePostfix(exp1));

        // Test Case 2
        String exp2 = "4 5 * 6 /"; // Expected output: 3
        System.out.println("Result of expression : " + evaluatePostfix(exp2));
    }
}

