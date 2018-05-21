package XBridge.Bridge;

public class BridgeTest {
    public static void main(String[] args) {

        //Creating 3+2=5 instances of bottom classes

        ColorImplementation[] colors = new ColorImplementation[]
                {new ColorRedImplementation(), new ColorBlueImplementation(), new ColorGreenImplementation()};


        for (ColorImplementation color: colors
             ) {
            ShapeAbstraction shape = new Circle(color);
            shape.draw();
        }

        for (ColorImplementation color: colors
             ) {
            ShapeAbstraction shape = new Square(color);
            shape.draw();
        }
    }
}
