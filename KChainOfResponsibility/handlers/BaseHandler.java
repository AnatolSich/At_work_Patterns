package KChainOfResponsibility.handlers;

import KChainOfResponsibility.Handler;

public class BaseHandler implements Handler {

    Handler next;

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handle(int money) {
        if (money < 50) {
            System.out.println("Sum is too small");
            return;
        } else if (money % 50 != 0) {
            System.out.println("Sum must be multiple 50");
            return;
        }
        if (next != null) {
            System.out.println("Outputs:");
            next.handle(money);
        }
    }
}
