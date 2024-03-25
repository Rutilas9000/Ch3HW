package Exercise2;

public class Airplane implements Flight{
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
        System.out.println("I'm an airplane that relies on an engine to fly.");
    }
    public String toString() {
        return "Airplane " + "[model=" + getModel() + ", year=" + getYearBuilt() + "]: ";
    }
}