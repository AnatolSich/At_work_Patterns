package Composite;

public class CompositeTest {
    public static void main(String[] args) {
        Line line1 = new Line(1, 1, 5);
        Arc arc2 = new Arc(2, 2, 6);
        Line line3 = new Line(3, 3, 7);
        Arc arc4 = new Arc(4, 4, 8);
        CompoundShape compound1 = new CompoundShape();
        compound1.addComponent(line1);
        compound1.addComponent(arc2);
        compound1.addComponent(line3);
        compound1.addComponent(arc4);


        Line line5 = new Line(1, 1, 5);
        Arc arc6 = new Arc(2, 2, 6);
        Line line7 = new Line(3, 3, 7);
        Arc arc8 = new Arc(4, 4, 8);

        CompoundShape compound2 = new CompoundShape();
        compound2.addComponent(compound1);
        compound2.addComponent(line5);
        compound2.addComponent(arc6);
        compound2.addComponent(line7);
        compound2.addComponent(arc8);

        compound2.draw();
    }
}

interface Shape {
    void move(int x,int y);

    int getStartX();

    int getStartY();

    int getEndX();

    int getEndY();

    void draw();
}

