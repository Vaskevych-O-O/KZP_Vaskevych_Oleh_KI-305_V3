package ki305.vaskevych.lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        float x;
        ExpressionCalculator calculator = new ExpressionCalculator();
        Scanner in = new Scanner(System.in); // read from CLI user input
        File dataFile = new File("MyFile.txt");
        PrintWriter fout = new PrintWriter(dataFile);

        System.out.println("Введіть значення x: ");
        x = in.nextFloat();
        in.nextLine();

        try {
            double result = calculator.calculate(x);
            System.out.println("Результат: " + result);
            fout.print(result);

        } catch (ArithmeticException e) {
            System.out.println("Помилка: " + e.getMessage());
        }

        fout.flush();
        fout.close();
    }
}
