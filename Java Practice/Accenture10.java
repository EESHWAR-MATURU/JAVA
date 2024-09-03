// Evaluate expression Problem statement You are given a function, Int EvaluateExpression (char* expr); 
// The function accepts a mathematical expression 'expr' as a parameter. 
// Implement the function to evaluate the given expression. Assumption: 
// •You can assume there is no space in between any of the characters of the expression 'expr' •Expression 'expr' 
// contains only digits and operators

import java.util.*;

public class Accenture10 {

    public static int evaluateExpression(String expr) {
        Stack<Integer> numbers = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);

            // If the character is a digit, parse the number
            if (Character.isDigit(c)) {
                int num = 0;
                while (i < expr.length() && Character.isDigit(expr.charAt(i))) {
                    num = num * 10 + (expr.charAt(i) - '0');
                    i++;
                }
                i--;
                numbers.push(num);
            }
            // If the character is an operator
            else if (c == '+' || c == '-' || c == '*' || c == '/') {
                // While the top of the operator stack has the same or greater precedence
                while (!operators.isEmpty() && precedence(operators.peek()) >= precedence(c)) {
                    int b = numbers.pop();
                    int a = numbers.pop();
                    char op = operators.pop();
                    numbers.push(applyOperation(a, b, op));
                }
                // Push the current operator to the stack
                operators.push(c);
            }
        }

        // Process the remaining operators in the stack
        while (!operators.isEmpty()) {
            int b = numbers.pop();
            int a = numbers.pop();
            char op = operators.pop();
            numbers.push(applyOperation(a, b, op));
        }

        // The result will be the last number in the stack
        return numbers.pop();
    }

    // Helper function to define operator precedence
    private static int precedence(char op) {
        if (op == '+' || op == '-') {
            return 1;
        } else if (op == '*' || op == '/') {
            return 2;
        }
        return 0;
    }

    // Helper function to apply an operation to two numbers
    private static int applyOperation(int a, int b, char op) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    throw new UnsupportedOperationException("Cannot divide by zero");
                }
                return a / b;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expr = sc.nextLine();
        System.out.println(evaluateExpression(expr));
    }
}
