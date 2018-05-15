package EBuilder;


public class Director {


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