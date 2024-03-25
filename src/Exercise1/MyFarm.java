package Exercise1;
import java.util.ArrayList;
import java.util.List;
public class MyFarm {
    public static void main(String[] args) {
        List<FarmAnimal> myFarmAnimals = new ArrayList<>();

        // Chickens

        myFarmAnimals.add(new Chicken("Albert", "male", 1.6, 2, "Cock-a-Doodle-doo"));
        myFarmAnimals.add(new Chicken("Amelia", "female", 1.8, 4, "Cluck Cluck"));
        myFarmAnimals.add(new Chicken("Dixie", "female", 1.7, 4, "Cluck Cluck"));

        // Cows

        myFarmAnimals.add(new Cow("Molly", "female", 1600.0, 3, "Moo Moo"));

        // Ducks
        myFarmAnimals.add(new Duck("Donald", "male", 3.2, 5, "Quack Quack"));
        myFarmAnimals.add(new Duck("Cheese", "female", 3.6, 5, "Quack Quack"));


        for (FarmAnimal animal : myFarmAnimals) {
            System.out.println(animal);
        }

        for (FarmAnimal animal : myFarmAnimals) {
            System.out.println(animal.feedLoadingSchedule());
        }
    }
}