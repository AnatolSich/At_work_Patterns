package KChainOfResponsibility.handlers;

public class G100Handler extends BaseHandler{
    public void handle(int money) {
        int q = money  / 100;
        if (q != 0) {
            System.out.println("G100 - " + q + " banknote(s)");
        }
        int remind = money - q * 100;
        if (remind > 0 & next != null)
            next.handle(remind);

    }
}
