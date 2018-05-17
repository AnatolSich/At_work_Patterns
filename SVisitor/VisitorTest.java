package SVisitor;

import java.util.ArrayList;
import java.util.List;

public class VisitorTest {
    public static void main(String[] args) {

        //creating all objects for structure
        CarBody carBody = new CarBody();

        Wheel wheel1 = new Wheel("front-left");
        Wheel wheel2 = new Wheel("front-right");
        Wheel wheel3 = new Wheel("rear-left");
        Wheel wheel4 = new Wheel("rear-right");

        List<Bolt> bolts = new ArrayList<>();
        for (int i = 0; i < 24; i++) {
            bolts.add(i, new Bolt(i));
        }

        //setting bolts on wheels
        for (int i = 0; i < 6; i++) {
            wheel1.setBolt(bolts.get(i));
        }
        for (int i = 0; i < 6; i++) {
            wheel2.setBolt(bolts.get(i));
        }
        for (int i = 0; i < 6; i++) {
            wheel3.setBolt(bolts.get(i));
        }
        for (int i = 0; i < 6; i++) {
            wheel4.setBolt(bolts.get(i));
        }

        //setting wheels on carBody
        carBody.setWheel(wheel1);
        carBody.setWheel(wheel2);
        carBody.setWheel(wheel3);
        carBody.setWheel(wheel4);

        //creating visitors
        Visitor hooligan = new HooliganVisitor();
        Visitor mechanic = new MechanicVisitor();

        //implementation visitors on carBody structure
        carBody.accept(hooligan);
        carBody.accept(mechanic);

    }
}
