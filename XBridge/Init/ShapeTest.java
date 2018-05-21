package XBridge.Init;

public class ShapeTest {
    public static void main(String[] args) {
        //Creating 3*2=6 instances of bottom classes
        Shape circleRed = new CircleRed();
        Shape circleBlue = new CircleBlue();
        Shape circleGreen = new CircleGreen();
        Shape squareRed = new SquareRed();
        Shape squareBlue = new SquareBlue();
        Shape squareGreen = new SquareGreen();

        circleRed.draw();
        circleBlue.draw();
        circleGreen.draw();
        squareRed.draw();
        squareBlue.draw();
        squareGreen.draw();

    }
}
