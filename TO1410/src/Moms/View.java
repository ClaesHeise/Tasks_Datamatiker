package Moms;

public class View {
    final private String MSG = "MOMS";
    final private String CURRENCY = "Kr";

    public void doView(double moms){
        System.out.printf("Du betaler %.2f%3s i %s%n",moms,CURRENCY,MSG);
    }
}
