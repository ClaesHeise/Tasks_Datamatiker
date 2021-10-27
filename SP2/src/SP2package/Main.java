package SP2package;

public class Main {

    public static void main(String[] args) {
        Car petrol = new PetrolCar(1, "Toyota", "Corolla", 2019, 4, 1000, 22);
        Car diesel = new DieselCar(2, "Volvo", "Sedan", 2007, 5, true, 15);
        Car electric = new ElectricCar(3, "Tesla", "X", 2020, 2, 100, 6);

        /* Uncomment/write the cars up as this, if you want to acces the setters and getters for the subtype of cars.
         per example, if you want to acces setkmPrL in the PetrolCar class, you can't if you do as above (Car pertrolCar = ...),
         but if you instigate it as underneath, you can. The actual assignment can be completed with just the above way, as it
         can also be seen on the prints, so this is just extra/for future reference. */

        //  PetrolCar petrol = new PetrolCar(1, "Toyota", "Corolla", 2019, 4, 1000, 22);
        //  DieselCar diesel = new DieselCar(2, "Volvo", "Sedan", 2007, 5, true, 15);
        //  ElectricCar electric = new ElectricCar(3, "Tesla", "X", 2020, 2, 100, 6);
        Garage garage = new Garage();

        garage.addCars(petrol);
        garage.addCars(diesel);
        garage.addCars(electric);

        System.out.println(garage);

        System.out.println("The green tax on all cars in the garage is: " + garage.calculateGreenPropertyTaxCarpark() + " kr.");
    }
}
