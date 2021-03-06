import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;


public class ReversePolishNotation {

	
	public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the RPN expression: ");
		String RPNexp = input.nextLine();
		RPNexp = RPNexp.replaceAll("\\p{Z}","");
		
		System.out.println(RPNexp);
		
		String [] tokensPlus = RPNexp.split("");

		String [] tokens = Arrays.copyOfRange(tokensPlus, 1, tokensPlus.length);
		
		System.out.println("\nThe solution is " + EvaluateRPN(tokens));
		
		
		

	}
	
	public static int EvaluateRPN(String[] tokens){
		
		int solution = 0;
		
		String operators = "+-*/";
		 
        Stack<String> stack = new Stack<String>();
 
        for(String t : tokens){
            if(!operators.contains(t)){
                stack.push(t);
            }else{
                int a = Integer.valueOf(stack.pop());
                int b = Integer.valueOf(stack.pop());
                int index = operators.indexOf(t);
                switch(index){
                    case 0:
                        stack.push(String.valueOf(a+b));
                        break;
                    case 1:
                        stack.push(String.valueOf(b-a));
                        break;
                    case 2:
                        stack.push(String.valueOf(a*b));
                        break;
                    case 3:
                        stack.push(String.valueOf(b/a));
                        break;
                }
            }
        }
 
        solution = Integer.valueOf(stack.pop());
 
        return solution;
        
	}    
		
}
