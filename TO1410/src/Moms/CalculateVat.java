package Moms;

public class CalculateVat {
    final private int PRCVAT = 25;

    public double getVat(double userMoney) {
        return userMoney / 100 * PRCVAT;
    }
}
