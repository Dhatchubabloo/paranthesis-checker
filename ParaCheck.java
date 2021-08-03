
// program to find a paranthesis is balanced or not balanced....

import java.util.Scanner;
import java.util.Stack;
public class ParaCheck{
    boolean checker(String word){
         Stack <Character> stack = new Stack<Character>();
        int len = word.length();
        for(int i=0;i<len;i++){
            char value = word.charAt(i);
            if(value=='(' || value=='[' || value=='{'){
                stack.push(value);
                continue;
            }
            if(stack.empty())
            return false;
            char need;
            switch(value){
                case ')':
                need = stack.pop();
                if(need=='[' || need=='{'){
                    return false;
                }
                break;
                case '}':
                need = stack.pop();
                if(need=='[' || need=='('){
                    return false;
                }
                break;
                case ']':
                need = stack.pop();
                if(need=='(' || need=='{'){
                    return false;
                }
                break;
            }
        }
        
        return (stack.empty());
    }
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        Paracheck para = new Paracheck();
        String word = scan.next();
        boolean result = para.checker(word);
        if(result){
            System.out.println("balanced");
        }
        else
        System.out.println("not balanced");
    }
}
