package KChainOfResponsibility.handlers;

public class G200Handler extends BaseHandler {
    public void handle(int money) {
        int q = (int) ((money * 0.8) / 200);
        if (q != 0) {
            System.out.println("G200 - " + q + " banknote(s)");
        }
        int remind = money - q * 200;
        if (remind > 0 & next != null)
            next.handle(remind);
    }
}
