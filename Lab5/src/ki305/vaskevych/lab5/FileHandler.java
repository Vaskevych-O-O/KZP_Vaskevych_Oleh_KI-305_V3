package ki305.vaskevych.lab5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Клас FileHandler надає методи для роботи з файлами, включаючи запис і читання
 * результатів у текстових та бінарних файлах.
 */
public class FileHandler {

    /**
     * Записує список результатів у текстовий файл. Кожен результат записується на новому рядку.
     *
     * @param filename ім'я файлу, в який будуть записані результати.
     * @param results список результатів типу Double для запису в файл.
     * @throws IOException якщо виникає помилка вводу-виводу під час запису у файл.
     */
    public void writeToTextFile(String filename, List<Double> results) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            for (Double result : results) {
                writer.println("Результат: " + result);
            }
        }
    }

    /**
     * Читає список результатів з текстового файлу. Передбачається, що кожен рядок має формат "Результат: <значення>".
     *
     * @param filename ім'я файлу, з якого будуть зчитані результати.
     * @return список результатів типу Double, зчитаних з файлу.
     * @throws IOException якщо виникає помилка вводу-виводу під час читання з файлу.
     */
    public List<Double> readFromTextFile(String filename) throws IOException {
        List<Double> results = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Спробуємо парсити результат як Double
                try {
                    String[] parts = line.split(":");
                    results.add(Double.parseDouble(parts[1].trim()));
                } catch (NumberFormatException e) {
                    System.out.println("Помилка формату в рядку: " + line);
                }
            }
        }
        return results;
    }

    /**
     * Записує список результатів у бінарний файл.
     *
     * @param filename ім'я файлу, в який будуть записані результати.
     * @param results список результатів типу Double для запису в бінарний файл.
     * @throws IOException якщо виникає помилка вводу-виводу під час запису у файл.
     */
    public void writeToBinaryFile(String filename, List<Double> results) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(results);
        }
    }

    /**
     * Читає список результатів з бінарного файлу.
     *
     * @param filename ім'я файлу, з якого будуть зчитані результати.
     * @return список результатів типу Double, зчитаних з бінарного файлу.
     * @throws IOException якщо виникає помилка вводу-виводу під час читання з файлу.
     * @throws ClassNotFoundException якщо клас не знайдено під час десеріалізації об'єкта.
     */
    public List<Double> readFromBinaryFile(String filename) throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            return (List<Double>) in.readObject();
        }
    }
}
