/**
 * Created by Tyler on 4/18/16.
 */
public class PayObserver implements Observer {

    private double tylerPay;
    private double georgePay;
    private double vivaldiPay;

    private static int observerIDTracker = 0;
    private int observerID;

    private Subject incomeGrab;

    public PayObserver(Subject incomeGrab){
        this.incomeGrab = incomeGrab;
        this.observerID = ++observerIDTracker;

        System.out.println("New Observer: " + this.observerID);

        incomeGrab.register(this);
    }

    @Override
    public void update(double tylerPay, double georgePay, double vivaldiPay) {
        this.tylerPay = tylerPay;
        this.georgePay = georgePay;
        this.vivaldiPay = vivaldiPay;

        printPay();
    }

    public void printPay(){
        System.out.println(observerID + "\n\tTyler: " + tylerPay + "\n\tGeorge: " + georgePay +
                "\n\tVivaldi: " + vivaldiPay);
    }
}
