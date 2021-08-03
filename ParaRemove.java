
//program for remove the unbalanced paranthesis....

import java.util.Scanner;
public class ParaRemove{
    public static void main(String  [] args){
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int len = word.length();
        char display[] = word.toCharArray();
        int open=0;
        int close=0;
        for(int start=0,end=len-1;start<len;start++,end--){
            if(display[start]=='(' || display[start]=='{' || display[start]=='['){
                open++;
            }
            else if(display[start]==')' || display[start]=='}' || display[start]==']'){
                open--;
            }
            if(display[end]==')' || display[end]=='}' || display[end]==']'){
                close++;
            }
            else if(display[end]=='(' || display[end]=='{' || display[end]=='['){
                close--;
            }
            if(open<0){
                display[start] = '#';
                open=0;
            }
            if(close<0){
                display[end] = '#';
                close=0;
            }
        }
        word = new String(display);
        for(int i=0;i<len;i++){
            if(word.charAt(i)!=('#')){
                System.out.print(word.charAt(i));
            }
        }
    }
}
