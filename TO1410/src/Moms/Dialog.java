package Moms;

import java.util.Scanner;

public class Dialog {
    public double getDiag() {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Indtast varens pris: ");
        return myScan.nextDouble();
    }
}
