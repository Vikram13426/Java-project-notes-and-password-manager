
import java.util.*;
import java.util.Scanner;
import java.io.*;

class Main {
    public static void main(String args[]) {
        int[] arr = new int[100];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 100; i++) {
            arr[i] = i;
        }
        System.out.print("Enter the array index to search:");
        int index = sc.nextInt();

        try {

            System.out.println("The element at the given index is :" + arr[index]);
        }

        catch (Exception e) {
            System.out.println(e);
        }

    }
}