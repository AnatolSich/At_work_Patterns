package CFactoryMethod;

public class FactoryMethodTest {
    public static void main(String[] args) {
       // String ZakazPrinter = "Color";
        String ZakazPrinter = "B@W";

        PrinterFactory printerFactory;

        if(ZakazPrinter.equalsIgnoreCase("color")) printerFactory= new ColorPrinterFactory();
        else printerFactory= new BWPrinterFactory();


        printerFactory.makePrinter().print();
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

interface PrinterFactory{
    Printer makePrinter();
}

class ColorPrinterFactory implements PrinterFactory{
    @Override
    public Printer makePrinter() {
        return new ColorPrinter();
    }
}
class BWPrinterFactory implements PrinterFactory{
    @Override
    public Printer makePrinter() {
        return new BWPrinter();
    }
}
