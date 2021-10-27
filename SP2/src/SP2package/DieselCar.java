package SP2package;

public class DieselCar extends Car {
    private boolean hasParticleFilter;
    private int kmPrL;

    public DieselCar(int regNr, String brand, String model, int year, int doorAmount, boolean hasParticleFilter, int kmPrL) {
        super(regNr, brand, model, year, doorAmount);
        this.hasParticleFilter = hasParticleFilter;
        this.kmPrL = kmPrL;
    }

    @Override
    double calculateGreenPropertyTax() {
        double tax;
        double equalizationTax;
        double particleTax = (hasParticleFilter ? 0.0 : 1000.0);
        if(kmPrL > 20 && kmPrL <= 50){
            tax = 330.0;
            equalizationTax = 130.0;
        }
        else if (kmPrL > 15 && kmPrL <= 20){
            tax = 1050.0;
            equalizationTax = 1390.0;
        }
        else if (kmPrL > 10 && kmPrL <= 15) {
            tax = 2340;
            equalizationTax = 1850.0;
        }
        else if (kmPrL > 5 && kmPrL <= 10){
            tax = 5500.0;
            equalizationTax = 2770.0;
        }
        else if (kmPrL <= 5){
            tax = 10470.0;
            equalizationTax = 15260;
        }
        // This is if the kmPrL is above 50 (if possible/error catching)
        else{
            tax = 0.0;
            equalizationTax = 0;
        }
        return tax + equalizationTax + particleTax;
    }

    public boolean isHasParticleFilter() {
        return hasParticleFilter;
    }

    public void setHasParticleFilter(boolean hasParticleFilter) {
        this.hasParticleFilter = hasParticleFilter;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return "DieselCar{" +
                super.toString() +
                ", hasParticleFilter = " + hasParticleFilter +
                ", kmPrL = " + kmPrL +
                ", greenTax = " + calculateGreenPropertyTax() + " kr." +
                '}';
    }

}
