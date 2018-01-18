package Builder;

public class BuilderTest {
    public static void main(String[] args) {
        ShoesType shoesType = ShoesType.PUMPS;
        String productType = "shoes";

        Director director = new Director();
        Builder builder = null;


        if (productType.equalsIgnoreCase("shoes")) {
            builder = new ShoesBuilder();
        } else if (productType.equalsIgnoreCase("shoesDiscription")) {
            builder = new ShoesDiscrBuilder();
        }

        if (shoesType.equals(ShoesType.OXFORDS)) {
            director.constructOxfords(builder);
        } else if (shoesType.equals(ShoesType.ESPADRILLES)) {
            director.constructEspadrilles(builder);
        } else if (shoesType.equals(ShoesType.BOOTS)) {
            director.constructBoots(builder);
        } else if (shoesType.equals(ShoesType.SNEAKERS)) {
            director.constructSneakers(builder);
        } else if (shoesType.equals(ShoesType.LOAFERS)) {
            director.constructLoafers(builder);
        } else if (shoesType.equals(ShoesType.CLEATS)) {
            director.constructCleats(builder);
        } else if (shoesType.equals(ShoesType.PUMPS)) {
            director.constructPumps(builder);
        }


        Shoes shoes = null;
        ShoesDiscription shoesDiscription = null;

        try {
            shoes = ((ShoesBuilder) builder).getResult();
        } catch (ClassCastException e) {
        }

        try {
            shoesDiscription = ((ShoesDiscrBuilder) builder).getResult();
        } catch (ClassCastException e) {
        }


        System.out.println("Shoes build:\n " + shoes);
        if (shoesDiscription != null) System.out.println("ShoesDiscription build:\n " + shoesDiscription.print());
        else System.out.println("ShoesDiscription build:\n " + shoesDiscription);

    }
}


interface Builder {

    void buildStyle(Style style);

    void buildLaces(boolean laces);

    void buildZipper(boolean zipper);

    void buildEyelets(int eyelets);

    void buildColor(String color);
}