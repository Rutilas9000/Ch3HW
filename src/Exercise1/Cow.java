package Exercise1;

public class Cow extends FarmAnimal {
    private String sound;

    public Cow(String name, String gender, double weight, int age, String sound) {
        super(name, gender, weight, age);
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public String feedLoadingSchedule() {
        return getName() + ": 6am - 4pm";
    }

    @Override
    public String toString() {
        return "Cow " + sound + " [name=" + getName() + ", gender=" + getGender() +
                ", weight=" + getWeight() + ", age=" + getAge() + "]";
    }
}
