/**
 * Created by Tyler on 4/18/16.
 */
public class GetPay {

    public static void main(String[] args){
        IncomeGrab incomeGrab = new IncomeGrab();

        PayObserver payObserver1 = new PayObserver(incomeGrab);

        incomeGrab.setTylerPay(78000.00);
        incomeGrab.setGeorgePay(73000.00);
        incomeGrab.setVivaldiPay(120000.00);

        PayObserver payObserver2 = new PayObserver(incomeGrab);

        incomeGrab.setVivaldiPay(95000.00);

        incomeGrab.unregister(payObserver2);

        incomeGrab.setTylerPay(85000);

    }
}
