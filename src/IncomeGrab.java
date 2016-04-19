import java.util.Vector;

/**
 * Created by Tyler on 4/18/16.
 */
public class IncomeGrab implements Subject {

    private Vector<Observer> observers;
    private double tylerPay;
    private double georgePay;
    private double vivaldiPay;

    public IncomeGrab() {
         observers = new Vector<>();
    }

    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        int observerIndex = observers.indexOf(o);
        System.out.println("Deleting observer: " + (observerIndex+1));
        observers.remove(observerIndex);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observers){
            observer.update(tylerPay, georgePay, vivaldiPay);
        }
    }

    public void setTylerPay(double pay){
        this.tylerPay = pay;
        notifyObserver();
    }

    public void setGeorgePay(double pay){
        this.georgePay = pay;
        notifyObserver();
    }

    public void setVivaldiPay(double pay) {
        this.vivaldiPay = pay;
        notifyObserver();
    }
}
