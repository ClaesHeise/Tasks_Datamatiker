package SP2package;

public abstract class Car {
    private int regNr;
    private String brand;
    private String model;
    private int year;
    private int doorAmount;

    public Car(int regNr, String brand, String model, int year, int doorAmount) {
        this.regNr = regNr;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.doorAmount = doorAmount;
    }

    abstract double calculateGreenPropertyTax();

    public int getRegNr() {
        return regNr;
    }

    public void setRegNr(int regNr) {
        this.regNr = regNr;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDoorAmount() {
        return doorAmount;
    }

    public void setDoorAmount(int doorAmount) {
        this.doorAmount = doorAmount;
    }

    // Have overriden toString() here aswell, so it wouldn't be necesarry to call
    // all these values in the subclasses, but instead super.toString() can just be called
    // and the subclasses will print all of these automatically
    @Override
    public String toString() {
        return "regNr = " + regNr +
                ", brand = '" + brand + '\'' +
                ", model = '" + model + '\'' +
                ", year = " + year +
                ", doorAmount = " + doorAmount;
    }
}
