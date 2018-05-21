package XBridge.Bridge;

//Hierarchy of Implementation consist of 3 bottom classes
//Adding new color type will add only one new class
public interface ColorImplementation {
    void paint();
}

class ColorRedImplementation implements ColorImplementation{

    @Override
    public void paint() {
        System.out.println("Painted in red!");
    }
}

class ColorBlueImplementation implements ColorImplementation{

    @Override
    public void paint() {
        System.out.println("Painted in blue!");
    }
}

class ColorGreenImplementation implements ColorImplementation{

    @Override
    public void paint() {
        System.out.println("Painted in green!");
    }
}
