package ki305.vaskevych.lab3;

import java.io.FileNotFoundException;

/**
 * Represents an experimental dog that can be trained and perform tricks.
 * Extends the Dog class and implements the Trainable interface.
 * Provides methods for training, performing tricks, and logging actions.
 */
public class ExperimentalDog extends Dog implements Trainable {

    /**
     * Constructs an ExperimentalDog object with the specified owner, breed, and dog tag.
     *
     * @param owner   the owner of the dog
     * @param breed   the breed of the dog
     * @param dogTag  the dog's tag information
     * @throws FileNotFoundException if the log file cannot be found
     */
    public ExperimentalDog(Owner owner, Breed breed, DogTag dogTag) throws FileNotFoundException {
        super(owner, breed, dogTag);
    }

    /**
     * Trains the experimental dog by logging and displaying a training message.
     */
    public void train() {
        log("Experimental dog is being trained.");
        System.out.println("Experimental dog training...");
    }

    /**
     * Makes the experimental dog perform a trick by logging and displaying a trick message.
     */
    @Override
    public void performTrick() {
        log("Experimental dog is performing a trick.");
        System.out.println("Experimental dog is performing a trick!");
    }

    /**
     * Logs a given message to the log file.
     *
     * @param message the message to log
     */
    public void log(String message) {
        super.log(message);
    }

    /**
     * Closes the PrintWriter used for logging.
     *
     * @throws Exception if an I/O error occurs while closing the log writer
     */
    @Override
    public void close() throws Exception {
        super.close();
    }
}
