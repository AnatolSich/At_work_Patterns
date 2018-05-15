package HAdapter;

public class AdapterTest {
    public static void main(String[] args) {
        RoundHole roundHole1 = new RoundHole(25);

        RoundPeg roundPeg1 = new RoundPeg(15);
        RoundPeg roundPeg2 = new RoundPeg(30);

        Fit.checkFit(roundHole1, roundPeg1);
        Fit.checkFit(roundHole1, roundPeg2);

        SquarePeg squarePeg1 = new SquarePeg(10, 20);
        SquarePeg squarePeg2 = new SquarePeg(30, 10);
        AdapterPeg adapterPeg1 = new AdapterPeg(squarePeg1);
        AdapterPeg adapterPeg2 = new AdapterPeg(squarePeg2);
        AdapterPPeg adapterPPeg1 = new AdapterPPeg(squarePeg1);
        AdapterPPeg adapterPPeg2 = new AdapterPPeg(squarePeg2);

        Fit.checkFit(roundHole1, adapterPeg1);
        Fit.checkFit(roundHole1, adapterPeg2);
        Fit.checkFit(roundHole1, adapterPPeg1);
        Fit.checkFit(roundHole1, adapterPPeg2);
    }
}

class Fit {
    static void checkFit(Round roundHole1, Round roundPeg2) {
        if (roundHole1.getRadius() >= roundPeg2.getRadius()) {
            System.out.println("Ok");
        } else System.out.println("No");
    }
}
//Адаптер на основе композиции
class AdapterPeg extends RoundPeg {
    SquarePeg squarePeg = null;

    public AdapterPeg(SquarePeg squarePeg) {
        super(getMaxDimension(squarePeg));
        this.squarePeg = squarePeg;
    }

    static int getMaxDimension(SquarePeg squarePeg) {
        int a = squarePeg.getX();
        int b = squarePeg.getY();
        if (a >= b) return a;
        else return b;
    }
}
//Адаптер на основе множественного наследования
class AdapterPPeg extends SquarePeg implements Round {


    public AdapterPPeg(SquarePeg squarePeg) {
        super(squarePeg.getX(), squarePeg.getY());
    }

    @Override
    public int getRadius() {
        int a = this.getX();
        int b = this.getY();
        if (a >= b) return a;
        else return b;
    }
}
