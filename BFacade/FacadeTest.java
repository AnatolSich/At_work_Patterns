package BFacade;

public class FacadeTest {
    public static void main(String[] args) {
        new Facade().setNewZakaz();
    }
}

class Zakaz{
    int id = 1;
}
class Suplayer{
    boolean isAvailable(int id){
        if (id>0) return true;
        else return false;
    }
    void getToStorage(Zakaz zakaz){
        zakaz.id=0;
        System.out.println("Заказ на складе");
    }
}
class Courier {
    void getToClient(Zakaz zakaz){
        if (zakaz.id==0){
            zakaz.id=-1;
            System.out.println("Заказ доставлен");
        }
    }
}

class Facade{
    void setNewZakaz(){
        Zakaz zakaz = new Zakaz();
        System.out.println("Заказ "+zakaz.id);
        Suplayer suplayer = new Suplayer();
        if(suplayer.isAvailable(zakaz.id)) suplayer.getToStorage(zakaz);
        new Courier().getToClient(zakaz);
    }
}