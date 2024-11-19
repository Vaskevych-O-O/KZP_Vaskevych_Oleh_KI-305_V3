package ki305.vaskevych.lab3;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            ExperimentalDog dog = createDog();
            Trainable trainableDog = createDog();
            // Demonstrating various methods of the Dog class
            dog.fetch("ball");
            dog.sit();
            dog.rollOver();
            dog.eat("dog food");
            dog.sleep();
            dog.play(" frisbee");
            dog.groom();
            dog.train();

            // Demonstrating created interface
            dog.performTrick();
            trainableDog.train();

            // Changing attributes and demonstrating logging
            Owner newOwner = new Owner("Alice", 30, "USA");
            dog.setOwner(newOwner);
            Breed newBreed = new Breed("Golden Retriever", "Scotland");
            dog.setBreed(newBreed);
            DogTag newDogTag = new DogTag(1, 123456);
            dog.setDogTag(newDogTag);
        } catch (FileNotFoundException e) {
            System.err.println("Log file not found: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    private static ExperimentalDog createDog() throws FileNotFoundException {
        Owner owner = new Owner("Bob", 25, "Canada");
        Breed breed = new Breed("Labrador", "Canada");
        DogTag dogTag = new DogTag(1, 987654);
        return new ExperimentalDog(owner, breed, dogTag);
    }
}

