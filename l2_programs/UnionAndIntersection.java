package l2_programs;

import java.util.ArrayList;
import java.util.Scanner;

public class UnionAndIntersection {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        ArrayList <Integer>list1 = new ArrayList();
        ArrayList <Integer>list2 = new ArrayList();
        int size= scan.nextInt();
        for(int i=0;i<size;i++){
            list1.add(scan.nextInt());
        }
        int size1= scan.nextInt();
        for(int i=0;i<size1;i++){
            list2.add(scan.nextInt());
        }
        System.out.println("Intersection");
        for(int i=0;i<size;i++){
            for(int j=0;j<size1;j++){
                if(list1.get(i)== list2.get(j))
                    System.out.print(list1.get(i)+" ");
            }
        }
        System.out.println();
        System.out.println("Union");
        for(int i=0;i<size;i++){
            System.out.print(list1.get(i)+" ");
        }

        for(int i=0;i<size1;i++){
            int count=0;
            for(int j=0;j<size;j++){
                if(list2.get(i)==list1.get(j)){
                    count++;
                }
            }
            if(count==0){
                System.out.print(list2.get(i)+" ");
            }
        }
    }
}
