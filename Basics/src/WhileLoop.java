import java.util.*;
import java.io.*;
public class WhileLoop {
    public static void main(String[] args) {
        // While loop
        int i = 0;
        while (i < 5) {
            System.out.println("i is = "+i);
            i ++;
        }

        // Do while
        int j = 0;
        do {
            System.out.println("j is = "+j);
            j++;
        } while (j < 5);
    }
}
