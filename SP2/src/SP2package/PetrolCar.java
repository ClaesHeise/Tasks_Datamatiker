package SP2package;

public class PetrolCar extends Car {
    private int octaneAmount;
    private int kmPrL;

    public PetrolCar(int regNr, String brand, String model, int year, int doorAmount, int octaneAmount, int kmPrL) {
        super(regNr, brand, model, year, doorAmount);
        this.octaneAmount = octaneAmount;
        this.kmPrL = kmPrL;
    }

    @Override
    double calculateGreenPropertyTax() {
        double tax;
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

    public int getOctaneAmount() {
        return octaneAmount;
    }

    public void setOctaneAmount(int octaneAmount) {
        this.octaneAmount = octaneAmount;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return "PetrolCar{" +
                super.toString() +
                ", octaneAmount = " + octaneAmount +
                ", kmPrL = " + kmPrL +
                '}';
    }


}
