package HAdapter;

public interface Round {
    int getRadius();
}

class RoundHole implements Round {
    int r;

    public RoundHole(int r) {
        this.r = r;
    }

    @Override
    public int getRadius() {
        return this.r;
    }
}

class RoundPeg implements Round {
    int r;

    public RoundPeg(int r) {
        this.r = r;
    }

    @Override
    public int getRadius() {
        return this.r;
    }
}

class SquarePeg {
    int x;
    int y;

    public SquarePeg(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}