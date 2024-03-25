package Exercise1;

public class Chicken extends FarmAnimal {

    private String sound;

    public Chicken(String name, String gender, double weight, int age, String sound) {
        super(name, gender, weight, age);
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    // implementing the feeding Schedule from FarmAnimal
    @Override
    public String feedLoadingSchedule() {
        return getName() + ": 8am-4pm";
    }

    //toString override
    @Override
    public String toString(){
        return "Chicken " + sound + " [name=" + getName() + ", gender=" + getGender() +
                ", weight=" + getWeight() + ", age=" + getAge() + "]";
    }
}