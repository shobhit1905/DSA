package STACK_QUEUE;

import java.util.Stack;

public class BalancedParanthesis {
    public static boolean balanced(char a , char b){
        return (a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']') ;
    }
    public static boolean paranthesis(String str){
        Stack<Character> stack = new Stack<>() ;

        for(int i=0 ; i<str.length() ; i++){
            Character ch = str.charAt(i) ;

            if(ch == '(' || ch == '{' || ch == '[')
                stack.push(ch) ;
            else{
                if(stack.isEmpty())
                return false ;
                if(balanced(stack.peek() , ch))
                stack.pop() ;
                else 
                return false ;
            }
        }

        return stack.isEmpty() ;
    }

    public static void main(String[] args) {
        
        String s1 = "((((())))){}{[]}" ;
        System.out.println(paranthesis(s1));
        String s2 = "(((({[}))))" ;
        System.out.println(paranthesis(s2));
        String s3 = "(){{}}[()]" ;
        System.out.println(paranthesis(s3));
        String s4 = "((((((())))" ;
        System.out.println(paranthesis(s4));
    }
}
