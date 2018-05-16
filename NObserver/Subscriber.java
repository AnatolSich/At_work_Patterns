package NObserver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public interface Subscriber {
    void handleEvent(int temperature, int pressure, String windDirection);
}

class ConsoleWriter implements Subscriber {

    @Override
    public void handleEvent(int temperature, int pressure, String windDirection) {
        System.out.println("Temperature, °C - " + temperature);
        System.out.println("Pressure, mm Hg - " + pressure);
        System.out.println("WindDirection - " + windDirection);
    }
}

class FileWriter implements Subscriber {

    @Override
    public void handleEvent(int temperature, int pressure, String windDirection) {
        File dir = new File("D:\\Work\\Workspace\\Patterns\\src\\NObserver");
        File file;
        try {
            file = File.createTempFile("meteostation", "Event", dir);
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println("Temperature, °C - " + temperature);
            printWriter.println("Pressure, mm Hg - " + pressure);
            printWriter.println("WindDirection - " + windDirection);
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



