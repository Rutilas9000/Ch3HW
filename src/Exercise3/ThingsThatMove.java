package Exercise3;

public class ThingsThatMove {
    public static void main(String[] args) {
        Airplane plane = new Airplane("Boeing 747", "2016");
        Bird eagle = new Bird("Eagle");
        Bird hummmingbird = new Bird("Hummingbird");

        Movement[] instances = new Movement[3];
        instances[0] = plane;
        instances[1] = eagle;
        instances[2] = hummmingbird;

        for (int i = 0; i < instances.length; i++) {
            System.out.println(instances[i].toString());
            instances[i].fly();
            instances[i].walk();
            instances[i].jump();
        }
    }
}