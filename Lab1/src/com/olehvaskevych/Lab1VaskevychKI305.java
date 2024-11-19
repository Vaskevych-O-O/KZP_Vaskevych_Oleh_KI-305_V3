package com.olehvaskevych;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lab1VaskevychKI305 {

    // throws FileNotFoundException - checked exception
    public static void main(String[] args) throws FileNotFoundException {
        int nRows;
        char[][] arr;
        String filler;
        Scanner in = new Scanner(System.in); // read from CLI user input
        File dataFile = new File("MyFile.txt");
        PrintWriter fout = new PrintWriter(dataFile);

        System.out.print("Введіть розмір квадратної матриці: ");
        nRows = in.nextInt();
        in.nextLine();

        arr = new char[nRows / 2][];
        for (int i = 0; i < nRows / 2; i++) {
            arr[i] = new char[nRows - (i * 2)];
        }

        System.out.print("\nВведіть символ-заповнювач: ");
        filler = in.nextLine();
        if (filler.isEmpty()) {
            System.out.print("\nНе введено символ заповнювач");
            return;
        } else if (filler.length() > 1) {
            System.out.print("\nЗабагато символів заповнювачів");
            return;
        }

        String leftAlgin;
        for (int i = 0; i < arr.length; i++) {
            leftAlgin = " ".repeat(i * 2);

            System.out.print(leftAlgin);
            fout.print(leftAlgin);

            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (char) filler.codePointAt(0);
                System.out.print(arr[i][j] + " ");
                fout.print(arr[i][j] + " ");
            }

            if (i < arr.length - 1) {
                System.out.print("\n");
                fout.print("\n");
            }
        }

        fout.flush();
        fout.close();
    }
}
