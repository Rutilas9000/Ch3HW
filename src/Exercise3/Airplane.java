package Exercise3;

public class Airplane implements Movement {
    private String model;
    private String yearBuilt;

    public Airplane(String model, String yearBuilt) {
        this.model = model;
        this.yearBuilt = yearBuilt;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(String yearBuilt) {
        this.yearBuilt = yearBuilt;
    }
    @Override
    public void fly() {
        System.out.println("I rely on my engine to fly.");
    }
    @Override
    public String toString() {
        return "Airplane " + "[model=" + getModel() + ", year=" + getYearBuilt() + "]: ";
    }
    @Override
    public void walk() {
        System.out.println("I tax on my wheels.");
    }
    @Override
    public void jump() {
        System.out.println("I cannot jump.");
    }
}