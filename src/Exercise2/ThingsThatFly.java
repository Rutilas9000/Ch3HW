package Exercise2;
public class ThingsThatFly {
    public static void main(String[] args) {
        Airplane plane = new Airplane("Boeing 747", "2016");
        Bird eagle = new Bird("Eagle");
        Bird hummmingbird = new Bird("Hummingbird");

        Flight[] instances = new Flight[3];
        instances[0] = plane;
        instances[1] = eagle;
        instances[2] = hummmingbird;

        for (int i = 0; i < instances.length; i++) {
            System.out.print(instances[i].toString());
            instances[i].fly();
        }
    }
}