package SVisitor;

public interface Component {
    void accept(Visitor visitor);
}

//realization of structure carBody-->Wheel-->Bolt

class Bolt implements Component {

    int boltNumber;

    public Bolt(int boltNumber) {
        this.boltNumber = boltNumber;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.change(this);
    }
}

class Wheel implements Component {

    String position;

    public Wheel(String position) {
        this.position = position;
    }

    Bolt[] bolts = new Bolt[6];

    //setting bolt to first found empty place
    public void setBolt(Bolt bolt) {
        for (int i = 0; i < 6; i++) {
            if(bolts[i]==null) {
                bolts[i]=bolt;
                return;
            }
        }
    }

    @Override
    public void accept(Visitor visitor) {
        for (Bolt bolt : bolts
                ) {
            bolt.accept(visitor);
        }
        visitor.change(this);
    }
}

class CarBody implements Component {

    Wheel[] wheels = new Wheel[4];

    //setting wheel to first found empty place
    public void setWheel(Wheel wheel) {
        for (int i = 0; i < 4; i++) {
            if(wheels[i]==null){
                wheels[i]=wheel;
                return;
            }
        }
    }

    @Override
    public void accept(Visitor visitor) {
        for (Wheel wheel : wheels
                ) {
            wheel.accept(visitor);
        }
        visitor.change(this);
    }
}




