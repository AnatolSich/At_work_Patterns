package EBuilder;

public class ShoesBuilder implements Builder {

    private Style style;
    private boolean laces;
    private boolean zipper;
    private int eyelets;
    private String color;

    @Override
    public void buildStyle(Style style) {
        this.style = style;
    }

    @Override
    public void buildLaces(boolean laces) {
        this.laces = laces;
    }

    @Override
    public void buildZipper(boolean zipper) {
        this.zipper = zipper;
    }

    @Override
    public void buildEyelets(int eyelets) {
        this.eyelets = eyelets;
    }

    @Override
    public void buildColor(String color) {
        this.color = color;
    }

    public Shoes getResult(){
        return new Shoes(style,laces,zipper,eyelets,color);
    }
}
