package NObserver;

public class ObserverTest {
    public static void main(String[] args) {
        Publisher meteoStation = new Meteostation();
        Subscriber console = new ConsoleWriter();
        Subscriber file = new FileWriter();

        meteoStation.mainBuisnessLogic(20, 745, "NE");

        meteoStation.subscribe(console);
        meteoStation.subscribe(file);

        meteoStation.mainBuisnessLogic(21, 744, "SSW");
        meteoStation.mainBuisnessLogic(22, 743, "NNW");

        meteoStation.unsubscribe(console);

        meteoStation.mainBuisnessLogic(23, 742, "WNW");
        meteoStation.mainBuisnessLogic(24, 741, "ESE");
    }


}
