package PTemplateMethod;

public class TemplateMethodTest {
    public static void main(String[] args) {
        //builders for three type of houses
        HouseBuildAbstract houseBuildA = new HouseTypeA();
        HouseBuildAbstract houseBuildB = new HouseTypeB();
        HouseBuildAbstract houseBuildC = new HouseTypeC();

//houses of budget type
        House house1A = houseBuildA.templateMethod(8, 1, true);
        House house2A = houseBuildA.templateMethod(2, 5, false);
        System.out.println(house1A);
        System.out.println(house2A);

        //houses of medium type
        House house1B = houseBuildB.templateMethod(8, 1, true);
        House house2B = houseBuildB.templateMethod(2, 5, false);
        System.out.println(house1B);
        System.out.println(house2B);

        //houses of vip type
        House house1C = houseBuildC.templateMethod(8, 1, true);
        House house2C = houseBuildC.templateMethod(2, 5, false);
        System.out.println(house1C);
        System.out.println(house2C);
    }
}
