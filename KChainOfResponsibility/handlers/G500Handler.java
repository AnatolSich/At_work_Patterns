package KChainOfResponsibility.handlers;


public class G500Handler extends BaseHandler {
    public void handle(int money) {
        int q = (money / 2) / 500;
        if (q != 0) {
            System.out.println("G500 - " + q + " banknote(s)");
        }
        int remind = money - q * 500;
        if (remind > 0 & next != null)
            next.handle(remind);
    }
}
