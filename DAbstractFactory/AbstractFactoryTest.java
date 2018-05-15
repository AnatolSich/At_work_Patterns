package DAbstractFactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        String color= "BW";
        DeviceFactory deviceFactory=null;
        switch (color){
            case "color":{
                deviceFactory=new ColorDeviceFactory();
                break;
            }
            case "BW": {
                deviceFactory=new BWDeviceFactory();
            }
        }

        deviceFactory.createPrinter().print();
        deviceFactory.createScanner().scan();
    }
}
interface Printer{
    void print();
}

class ColorPrinter implements Printer{
    @Override
    public void print() {
        System.out.println("Color printing");
    }
}
class BWPrinter implements Printer{
    @Override
    public void print() {
        System.out.println("Black@White printing");
    }
}
interface Scanner{
    void scan();
}

class ColorScanner implements Scanner{
    @Override
    public void scan() {
        System.out.println("Color scanning");
    }
}

class BWScanner implements Scanner{
    @Override
    public void scan() {
        System.out.println("Black@White scanning");
    }
}

interface DeviceFactory{
    Printer createPrinter();
    Scanner createScanner();
}

class ColorDeviceFactory implements DeviceFactory{
    @Override
    public Printer createPrinter() {
        return new ColorPrinter();
    }

    @Override
    public Scanner createScanner() {
        return new ColorScanner();
    }
}

class BWDeviceFactory implements DeviceFactory{
    @Override
    public Printer createPrinter() {
        return new BWPrinter();
    }

    @Override
    public Scanner createScanner() {
        return new BWScanner();
    }
}