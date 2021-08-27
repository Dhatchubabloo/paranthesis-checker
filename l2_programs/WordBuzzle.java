package l2_programs;

import java.util.ArrayList;
import java.util.Scanner;

public class WordBuzzle {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();
        char mat[][]=new char[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[i][j] = scan.next().charAt(0);
            }
        }
        ArrayList<String>input = new ArrayList<>();
        int size= scan.nextInt();
        for(int i=0;i<size;i++){
            input.add(scan.next());
        }
        for(int i=0;i<size;i++){
            String value = input.get(i);
            int x=0;
            int count=0;
            for(int j=0;j<row;j++) {
                int main = 0;
                for (int k = 0; k < col; k++) {
                    boolean flag = true;
                    if (mat[j][k] == value.charAt(x)) {
                        x++;
                        count++;
                        while (flag) {
                            if (mat[j][++k] == value.charAt(x) && k < col) {
                                count++;x++;
                            } else if (mat[++j][k] == value.charAt(x) && j < row) {
                                count++;x++;
                            } else
                                flag = false;
                        }
                    }
                    if(count==0){
                        main++;
                        break;
                    }
                    if(count==value.length())
                        System.out.println(value);
                }
               if(main==1){
                   break;
               }
            }
        }
    }
}
