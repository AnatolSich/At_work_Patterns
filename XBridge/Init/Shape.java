package XBridge.Init;

//Hierarchy with 6 bottom classes
//Adding one new shape type will add new 3 classes
//Adding one new color type will add new 2 classes
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape{

    @Override
    void draw() {
        System.out.println("Draw a circle!");
    }
}
class Square extends Shape{

    @Override
    void draw() {
        System.out.println("Draw a square!");
    }
}

class CircleRed extends Circle{
    @Override
    void draw() {
        super.draw();
        System.out.println("Painted in red!");
    }
}
class SquareRed extends Square{
    @Override
    void draw() {
        super.draw();
        System.out.println("Painted in red!");
    }
}

class CircleBlue extends Circle{
    @Override
    void draw() {
        super.draw();
        System.out.println("Painted in blue!");
    }
}
class SquareBlue extends Square{
    @Override
    void draw() {
        super.draw();
        System.out.println("Painted in blue!");
    }
}

class CircleGreen extends Circle{
    @Override
    void draw() {
        super.draw();
        System.out.println("Painted in green!");
    }
}
class SquareGreen extends Square{
    @Override
    void draw() {
        super.draw();
        System.out.println("Painted in green!");
    }
}
