/**
 * Created by Tyler on 4/18/16.
 */
public interface Subject {
    public void register(Observer o);
    public void unregister(Observer o);
    public void notifyObserver();
}
