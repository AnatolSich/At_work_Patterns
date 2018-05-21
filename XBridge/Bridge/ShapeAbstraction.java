package XBridge.Bridge;


//Hierarchy of Abstraction consist of 2 bottom classes
//Adding new shape type will add only one new class
abstract class ShapeAbstraction {
    protected ColorImplementation color;

    public ShapeAbstraction(ColorImplementation color) {
        this.color = color;
    }

    abstract void draw();
}

class Circle extends ShapeAbstraction{

    public Circle(ColorImplementation color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.println("Draw a circle!");
        color.paint();
    }
}

class Square extends ShapeAbstraction{

    public Square(ColorImplementation color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.println("Draw a square!");
        color.paint();
    }
}

