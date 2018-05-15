package EBuilder;

public class ShoesDiscription {
    private final Style style;
    private final boolean laces;
    private final boolean zipper;
    private final int eyelets;
    private final String color;

    public ShoesDiscription(Style style, boolean laces, boolean zipper, int eyelets, String color) {
        this.style = style;
        this.laces = laces;
        this.zipper = zipper;
        this.eyelets = eyelets;
        this.color = color;
    }

    public String print() {
        return "Style: " + style.name() +
                "; Laces: " + laces +
                "; Zipper: " + zipper +
                "; Eyelets: " + eyelets +
                "; Color: " + color;
    }
}
