package Sibunsirpractice;
import java.util.Scanner;
public class nesteddowhileloopmultiplication {
    public static void main(String[] args) {
        System.out.print("Multiplication table\n");
        int i = 1;
        do {
            int j = 2;
            do {
                System.out.print(i * j + "\t");
                j++;
            } while (j <= 15);
            i++;
            System.out.println();
        } while (i <= 15);

    }
}
