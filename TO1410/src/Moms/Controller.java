package Moms;

public class Controller {
    private View view = new View();
    private CalculateVat vat = new CalculateVat();
    private Dialog dialog = new Dialog();

    public void runController() {
        double userIn = dialog.getDiag();
        double moms = vat.getVat(userIn);
        view.doView(moms);
    }
}
