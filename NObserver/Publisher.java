package NObserver;

import java.util.ArrayList;
import java.util.List;

public interface Publisher {
    void subscribe(Subscriber subscriber);

    void unsubscribe(Subscriber subscriber);
    public void mainBuisnessLogic(int temperature, int pressure, String windDirection);
}

class Meteostation implements Publisher {

    private int temperature;
    private int pressure;
    private String windDirection;

    List<Subscriber> subscriberList = new ArrayList<>();

    public void mainBuisnessLogic(int temperature, int pressure, String windDirection) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.windDirection = windDirection;
        notifySubcribers();
    }


    void notifySubcribers() {
        for (Subscriber subscriber : subscriberList
                ) {
            subscriber.handleEvent(this.temperature, this.pressure, this.windDirection);
        }
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }


}
