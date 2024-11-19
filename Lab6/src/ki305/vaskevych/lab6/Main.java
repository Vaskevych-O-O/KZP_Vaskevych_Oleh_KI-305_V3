package ki305.vaskevych.lab6;

public class Main {
    public static void main(String[] args) {
        HouseholdPackage<Integer> intPackage = new HouseholdPackage<>();
        intPackage.addItem(5);
        intPackage.addItem(2);
        intPackage.addItem(9);
        intPackage.addItem(1);

        System.out.println("Мінімальний елемент: " + intPackage.findMinimum());
        System.out.println("Максимальний елемент: " + intPackage.findMaximum());

        HouseholdPackage<String> stringPackage = new HouseholdPackage<>();
        stringPackage.addItem("Apple");
        stringPackage.addItem("Banana");
        stringPackage.addItem("Cherry");

        System.out.println("Мінімальний елемент: " + stringPackage.findMinimum());
        System.out.println("Максимальний елемент: " + stringPackage.findMaximum());
    }
}