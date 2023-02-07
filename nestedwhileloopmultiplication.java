package Sibunsirpractice;
import java.util.Scanner;
public class nestedwhileloopmultiplication {
    public static void main(String[] args) {
        System.out.print("Multiplication table\n");
        int i=1;
        while(i<=15){
            int j=2;
            while(j<=15){
                System.out.print(i*j+"\t");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
