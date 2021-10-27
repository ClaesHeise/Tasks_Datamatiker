package SP2package;

public class ElectricCar extends Car {
    private int batteryCapacitykWh;
    private double maxKm;
    private int whPrKm;

    public ElectricCar(int regNr, String brand, String model, int year, int doorAmount, int batteryCapacitykWh, int whPrKm) {
        super(regNr, brand, model, year, doorAmount);
        this.batteryCapacitykWh = batteryCapacitykWh;
        this.maxKm = batteryCapacitykWh / whPrKm;
        this.whPrKm = whPrKm;
    }


    @Override
    double calculateGreenPropertyTax() {
        double tax;
        double kmPrL = 100 / (whPrKm / 91.25);
        if(kmPrL > 20 && kmPrL <= 50){
            tax = 330.0;
        }
        else if (kmPrL > 15 && kmPrL <= 20){
            tax = 1050.0;
        }
        else if (kmPrL > 10 && kmPrL <= 15) {
            tax = 2340;
        }
        else if (kmPrL > 5 && kmPrL <= 10){
            tax = 5500.0;
        }
        else if (kmPrL <= 5){
            tax = 10470.0;
        }
        // This is if the kmPrL is above 50 (if possible/error catching)
        else{
            tax = 0.0;
        }
        return tax;
    }

    public int getBatteryCapacitykWh() {
        return batteryCapacitykWh;
    }

    public void setBatteryCapacitykWh(int batteryCapacitykWh) {
        this.batteryCapacitykWh = batteryCapacitykWh;
    }

    public double getMaxKm() {
        return maxKm;
    }

    public int getWhPrKm() {
        return whPrKm;
    }

    public void setWhPrKm(int whPrKm) {
        this.whPrKm = whPrKm;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                super.toString() +
                ", batteryCapacitykWh = " + batteryCapacitykWh +
                ", maxKm = " + maxKm +
                ", whPrKm = " + whPrKm +
                ", greenTax = " + calculateGreenPropertyTax() + " kr." +
                '}';
    }
}
