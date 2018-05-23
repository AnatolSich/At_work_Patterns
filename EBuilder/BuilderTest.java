package EBuilder;

public class BuilderTest {
    public static void main(String[] args) {

        Shoes shoes = null;
        ShoesDiscription shoesDiscription = null;

        Director director = new Director("shoes");
        director.selectShoesType(ShoesType.PUMPS);

        try {
            shoes = ((ShoesBuilder) director.builder).getResult();
        } catch (ClassCastException e) {
        }

        try {
            shoesDiscription = ((ShoesDiscrBuilder) director.builder).getResult();
        } catch (ClassCastException e) {
        }

        if (shoes != null) System.out.println("Shoes build:\n " + shoes);
        if (shoesDiscription != null) System.out.println("ShoesDiscription build:\n " + shoesDiscription.print());
        else System.out.println("ShoesDescription build:\n " + shoesDiscription);

        director = new Director("shoesDescription");
        director.selectShoesType(ShoesType.ESPADRILLES);

        try {
            shoes = ((ShoesBuilder) director.builder).getResult();
        } catch (ClassCastException e) {
        }

        try {
            shoesDiscription = ((ShoesDiscrBuilder) director.builder).getResult();
        } catch (ClassCastException e) {
        }

        if (shoes != null) System.out.println("Shoes build:\n " + shoes);
        if (shoesDiscription != null) System.out.println("ShoesDiscription build:\n " + shoesDiscription.print());
        else System.out.println("ShoesDescription build:\n " + shoesDiscription);

    }
}


interface Builder {

    void buildStyle(Style style);

    void buildLaces(boolean laces);

    void buildZipper(boolean zipper);

    void buildEyelets(int eyelets);

    void buildColor(String color);
}