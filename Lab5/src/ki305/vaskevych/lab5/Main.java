package ki305.vaskevych.lab5;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ExpressionCalculator calculator = new ExpressionCalculator();
        FileHandler fileHandler = new FileHandler();
        List<Double> results = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Введення даних та обчислення результатів
        while (true) {
            System.out.print("Введіть значення x (або 'exit' для виходу): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            else if (input.equalsIgnoreCase("text-read")) {
                // Читання результатів з текстового файлу
                try {
                    List<Double> readTextResults = fileHandler.readFromTextFile("results.txt");
                    System.out.println("Результати з текстового файлу:");
                    for (Double result : readTextResults) {
                        System.out.println(result);
                    }
                } catch (IOException e) {
                    System.out.println("Помилка при читанні текстового файлу: " + e.getMessage());
                }
            }

            else if (input.equalsIgnoreCase("binary-read")) {
                // Читання результатів з двійкового файлу
                try {
                    List<Double> readBinaryResults = fileHandler.readFromBinaryFile("binaryResults.dat");
                    System.out.println("Результати з двійкового файлу:");
                    for (Double result : readBinaryResults) {
                        System.out.println(result);
                    }
                } catch (IOException | ClassNotFoundException e) {
                    System.out.println("Помилка при читанні двійкового файлу: " + e.getMessage());
                }
            }

            else {
                try {
                    double x = Double.parseDouble(input);
                    double result = calculator.calculate(x);
                    System.out.println("Результат: " + result);
                    results.add(result);
                } catch (NumberFormatException e) {
                    System.out.println("Неправильний формат числа, спробуйте ще раз.");
                } catch (ArithmeticException e) {
                    System.out.println("Помилка: " + e.getMessage());
                }

                try {
                    // Запис у текстовий файл
                    fileHandler.writeToTextFile("results.txt", results);
                    // Запис у двійковий файл
                    fileHandler.writeToBinaryFile("binaryResults.dat", results);
                    System.out.println("Результати записано у файли.");
                } catch (IOException e) {
                    System.out.println("Помилка при запису у файл: " + e.getMessage());
                }
            }
        }
    }
}
