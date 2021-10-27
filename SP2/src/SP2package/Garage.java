package SP2package;

import java.util.ArrayList;


public class Garage {
    ArrayList<Car> cars = new ArrayList<Car>();

    public void addCars(Car car) {
        this.cars.add(car);
    }

    @Override
    public String toString() {
        String parkedCars = "";
        for (Car c : cars){
            parkedCars += c.toString() + "\n";
        }
        return parkedCars;
    }

    public double calculateGreenPropertyTaxCarpark(){
        double sumGreenTax = 0;
        for (Car c : cars){
            sumGreenTax += c.calculateGreenPropertyTax();
        }
        return sumGreenTax;
    }
}
