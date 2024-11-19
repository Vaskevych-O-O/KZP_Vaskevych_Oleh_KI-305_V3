package ki305.vaskevych.lab6;

import java.util.ArrayList;
import java.util.List;

/**
 * Параметризований клас для побутового пакета.
 *
 * Клас представляє пакет, який може зберігати список елементів
 * заданого типу {@code T}. Елементи повинні реалізовувати інтерфейс {@link Comparable},
 * що дозволяє виконувати операції порівняння, такі як пошук мінімального та максимального значення.
 *
 * @param <T> тип елементів у пакеті; повинен реалізовувати {@link Comparable}
 */
public class HouseholdPackage<T extends Comparable<T>> {
    private List<T> items;

    /**
     * Конструктор для ініціалізації порожнього пакету.
     */
    public HouseholdPackage() {
        items = new ArrayList<>();
    }

    /**
     * Додає елемент до пакету.
     *
     * @param item елемент, що додається до пакету
     */
    public void addItem(T item) {
        items.add(item);
    }

    /**
     * Видаляє елемент з пакету.
     *
     * @param item елемент, що видаляється з пакету
     * @return {@code true}, якщо елемент було видалено, або {@code false}, якщо елемент не знайдено в пакеті
     */
    public boolean removeItem(T item) {
        return items.remove(item);
    }

    /**
     * Знаходить мінімальний елемент серед наявних у пакеті елементів.
     *
     * @return мінімальний елемент, або {@code null}, якщо пакет порожній
     */
    public T findMinimum() {
        if (items.isEmpty()) return null;
        T min = items.get(0);
        for (T item : items) {
            if (item.compareTo(min) < 0) {
                min = item;
            }
        }
        return min;
    }

    /**
     * Знаходить максимальний елемент серед наявних у пакеті елементів.
     *
     * @return максимальний елемент, або {@code null}, якщо пакет порожній
     */
    public T findMaximum() {
        if (items.isEmpty()) return null;
        T max = items.get(0);
        for (T item : items) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }
}
