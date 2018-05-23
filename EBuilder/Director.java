package EBuilder;


public class Director {

    Builder builder;

    public String BuilderType;
    ShoesType shoesType;

    public Director(String builderType) {
        this.selectBuilderType(builderType);
    }


    public void selectBuilderType(String type) {

        if (!type.isEmpty() & type != null) {
            if (type.equalsIgnoreCase("shoes")) {
                this.builder = new ShoesBuilder();
                this.BuilderType = type;
            } else if (type.equalsIgnoreCase("shoesDescription")) {
                this.builder = new ShoesDiscrBuilder();
                this.BuilderType = type;
            } else System.out.println("There is no such BuilderType");
        }
    }

    public void selectShoesType(ShoesType shoesType) {
        if (shoesType.equals(ShoesType.OXFORDS)) {
            this.constructOxfords(builder);
        } else if (shoesType.equals(ShoesType.ESPADRILLES)) {
            this.constructEspadrilles(builder);
        } else if (shoesType.equals(ShoesType.BOOTS)) {
            this.constructBoots(builder);
        } else if (shoesType.equals(ShoesType.SNEAKERS)) {
            this.constructSneakers(builder);
        } else if (shoesType.equals(ShoesType.LOAFERS)) {
            this.constructLoafers(builder);
        } else if (shoesType.equals(ShoesType.CLEATS)) {
            this.constructCleats(builder);
        } else if (shoesType.equals(ShoesType.PUMPS)) {
            this.constructPumps(builder);
        }
    }

    public void constructOxfords(Builder builder) {
        builder.buildStyle(Style.CLASSIC);
        builder.buildLaces(true);
        builder.buildEyelets(6);
        builder.buildZipper(false);
        builder.buildColor("Dark or Calm light");
    }

    public void constructEspadrilles(Builder builder) {
        builder.buildStyle(Style.CASUAL);
        builder.buildLaces(false);
        builder.buildZipper(false);
        builder.buildColor("Various");
    }

    public void constructBoots(Builder builder) {
        builder.buildStyle(Style.MILITARY);
        builder.buildLaces(true);
        builder.buildEyelets(12);
        builder.buildZipper(true);
        builder.buildColor("Dark");
    }

    public void constructSneakers(Builder builder) {
        builder.buildStyle(Style.SPORT);
        builder.buildLaces(true);
        builder.buildEyelets(8);
        builder.buildZipper(false);
        builder.buildColor("Various");
    }

    public void constructLoafers(Builder builder) {
        builder.buildStyle(Style.CASUAL);
        builder.buildLaces(false);
        builder.buildZipper(false);
        builder.buildColor("Various");
    }

    public void constructCleats(Builder builder) {
        builder.buildStyle(Style.SPORT);
        builder.buildLaces(true);
        builder.buildEyelets(6);
        builder.buildZipper(false);
        builder.buildColor("Various");
    }

    public void constructPumps(Builder builder) {
        builder.buildStyle(Style.CLASSIC);
        builder.buildLaces(false);
        builder.buildZipper(false);
        builder.buildColor("Various");
    }

}

enum ShoesType {
    OXFORDS,
    ESPADRILLES,
    BOOTS,
    SNEAKERS,
    LOAFERS,
    CLEATS,
    PUMPS
}

enum Style {
    SPORT,
    MILITARY,
    CLASSIC,
    CASUAL
}