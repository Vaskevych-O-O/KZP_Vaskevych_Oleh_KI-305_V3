package ki305.vaskevych.lab2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Represents a Dog with attributes such as owner, breed, and dog tag.
 * The Dog class also supports various actions like barking, fetching, and grooming,
 * and logs these actions to a file.
 */
public class Dog implements AutoCloseable {
    private Owner owner;
    private Breed breed;
    private DogTag dogTag;
    private final PrintWriter fout;

    /**
     * Constructs a Dog instance with the specified owner, breed, and dog tag.
     *
     * @param owner the owner of the dog
     * @param breed the breed of the dog
     * @param dogTag the dog tag associated with the dog
     * @throws FileNotFoundException if the log file cannot be created or accessed
     */
    public Dog(Owner owner, Breed breed, DogTag dogTag) throws FileNotFoundException {
        this.owner = owner;
        this.breed = breed;
        this.dogTag = dogTag;
        this.fout = new PrintWriter(new File("Log.txt"));
    }

    /**
     * Gets the owner of the dog.
     *
     * @return the owner of the dog
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     * Sets the owner of the dog and logs the change.
     *
     * @param owner the new owner of the dog
     */
    public void setOwner(Owner owner) {
        this.owner = owner;
        log("Owner set to: " + owner.getName());
    }

    /**
     * Gets the breed of the dog.
     *
     * @return the breed of the dog
     */
    public Breed getBreed() {
        return breed;
    }

    /**
     * Sets the breed of the dog and logs the change.
     *
     * @param breed the new breed of the dog
     */
    public void setBreed(Breed breed) {
        this.breed = breed;
        log("Breed set to: " + breed.getName());
    }

    /**
     * Gets the dog tag of the dog.
     *
     * @return the dog tag associated with the dog
     */
    public DogTag getDogTag() {
        return dogTag;
    }

    /**
     * Sets the dog tag of the dog and logs the change.
     *
     * @param dogTag the new dog tag for the dog
     */
    public void setDogTag(DogTag dogTag) {
        this.dogTag = dogTag;
        log("Dog tag set to: " + dogTag.getRegistrationNumber());
    }

    /**
     * Makes the dog bark and logs the action.
     */
    public void bark() {
        log("Dog is barking!");
        System.out.println("Woof!");
    }

    /**
     * Makes the dog fetch a specified item and logs the action.
     *
     * @param item the item to fetch
     */
    public void fetch(String item) {
        log("Dog fetched: " + item);
        System.out.println("Fetched: " + item);
    }

    /**
     * Makes the dog sit and logs the action.
     */
    public void sit() {
        log("Dog is sitting.");
        System.out.println("Dog sits down.");
    }

    /**
     * Makes the dog roll over and logs the action.
     */
    public void rollOver() {
        log("Dog rolled over.");
        System.out.println("Dog rolls over.");
    }

    /**
     * Makes the dog eat specified food and logs the action.
     *
     * @param food the food the dog is eating
     */
    public void eat(String food) {
        log("Dog is eating: " + food);
        System.out.println("Eating: " + food);
    }

    /**
     * Makes the dog sleep and logs the action.
     */
    public void sleep() {
        log("Dog is sleeping.");
        System.out.println("Zzz...");
    }

    /**
     * Makes the dog play with a specified toy and logs the action.
     *
     * @param toy the toy the dog is playing with
     */
    public void play(String toy) {
        log("Dog is playing with: " + toy);
        System.out.println("Playing with: " + toy);
    }

    /**
     * Makes the dog groomed and logs the action.
     */
    public void groom() {
        log("Dog is being groomed.");
        System.out.println("Grooming the dog.");
    }

    /**
     * Logs a message to the log file.
     *
     * @param message the message to log
     */
    public void log(String message) {
        fout.println(message);
        fout.flush(); // Ensure the log is written immediately
    }

    /**
     * Closes the PrintWriter used for logging.
     *
     * @throws Exception if an I/O error occurs
     */
    @Override
    public void close() throws Exception {
        fout.close();
    }
}
