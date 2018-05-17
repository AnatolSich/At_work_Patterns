package SVisitor;

public interface Visitor {
    void change(Bolt bolt);

    void change(Wheel wheel);

    void change(CarBody carBody);
}

class HooliganVisitor implements Visitor {

    @Override
    public void change(Bolt bolt) {
        System.out.println("Bolt is turned off");
    }

    @Override
    public void change(Wheel wheel) {
        System.out.println("Wheel is punctured");
    }

    @Override
    public void change(CarBody carBody) {
        System.out.println("Car-body is scratched");
    }
}

class MechanicVisitor implements Visitor {

    @Override
    public void change(Bolt bolt) {
        System.out.println("Bolt is tightened");
    }

    @Override
    public void change(Wheel wheel) {
        System.out.println("Wheel is inflated");
    }

    @Override
    public void change(CarBody carBody) {
        System.out.println("Car-body is polished");
    }
}

