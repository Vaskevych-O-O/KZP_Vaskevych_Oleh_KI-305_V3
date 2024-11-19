package ki305.vaskevych.lab2;

public class DogTag {

    private int id;

    private int registrationNumber;

    public DogTag(int id, int registrationNumber) {
        this.id = id;
        this.registrationNumber = registrationNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}
