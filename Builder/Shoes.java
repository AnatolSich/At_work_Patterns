package Builder;

public class Shoes{
    private final Style style;
    private final boolean laces;
    private final boolean zipper;
    private final int eyelets;
    private final String color;

    public Shoes(Style style, boolean laces, boolean zipper, int eyelets, String color) {
        this.style = style;
        this.laces = laces;
        this.zipper = zipper;
        this.eyelets = eyelets;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shoes{" +
                "style=" + style +
                ", laces=" + laces +
                ", zipper=" + zipper +
                ", eyelets=" + eyelets +
                ", color='" + color + '\'' +
                '}';
    }
}

