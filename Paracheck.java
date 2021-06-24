
// program to find a paranthesis is balanced or not balanced....

import java.util.Scanner;
import java.util.Stack;
public class Paracheck{
    boolean checker(String a){
         Stack <Character> stack = new Stack<Character>();
        int len = a.length();
        for(int i=0;i<len;i++){
            char x= a.charAt(i);
            if(x=='(' || x=='[' || x=='{'){
                stack.push(x);
                continue;
            }
            if(stack.empty())
            return false;
            char y;
            switch(x){
                case ')':
                y = stack.pop();
                if(y=='[' || y=='{'){
                    return false;
                }
                break;
                case '}':
                y = stack.pop();
                if(y=='[' || y=='('){
                    return false;
                }
                break;
                case ']':
                y = stack.pop();
                if(y=='(' || y=='{'){
                    return false;
                }
                break;
            }
        }
        
        return (stack.empty());
    }
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        Paracheck para = new Paracheck();
        String str = s.next();
        boolean a = para.checker(str);
        if(a){
            System.out.println("balanced");
        }
        else
        System.out.println("not balanced");
    }
}