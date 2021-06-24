
//program for remove the unbalanced paranthesis....

import java.util.Scanner;
public class Pararemove{
    public static void main(String  [] args){
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int len = str.length();
        char a[] = str.toCharArray();
        int open=0;
        int close=0;
        for(int start=0,end=len-1;start<len;start++,end--){
            if(a[start]=='(' || a[start]=='{' || a[start]=='['){
                open++;
            }
            else if(a[start]==')' || a[start]=='}' || a[start]==']'){
                open--;
            }
            if(a[end]==')' || a[end]=='}' || a[end]==']'){
                close++;
            }
            else if(a[end]=='(' || a[end]=='{' || a[end]=='['){
                close--;
            }
            if(open<0){
                a[start] = '#';
                open=0;
            }
            if(close<0){
                a[end] = '#';
                close=0;
            }
        }
        str = new String(a);
        for(int i=0;i<len;i++){
            if(str.charAt(i)!=('#')){
                System.out.print(str.charAt(i));
            }
        }
    }
}