package XBridgeDevicesExample;


/*Пульты выступают «абстракцией», а приборы — «реализацией».
Одни и те же приборы могут работать с разными пультами,
а пульты управлять разными устройствами.
Применив паттерн Мост, мы можем изменять классы пультов и приборов
независимо друг от друга.*/

public class Demo {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}