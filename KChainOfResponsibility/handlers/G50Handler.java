package KChainOfResponsibility.handlers;

public class G50Handler extends BaseHandler {
    public void handle(int money) {
        int q = money / 50;
        if (q != 0) {
            System.out.println("G50 - " + q + " banknote(s)");
        }
        int remind = money - q * 50;
        if (remind > 0 & next != null)
            next.handle(remind);
    }
}
