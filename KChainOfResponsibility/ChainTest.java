package KChainOfResponsibility;

import KChainOfResponsibility.handlers.*;

public class ChainTest {
    public static void main(String[] args) {
        BaseHandler baseHandler = new BaseHandler();
        BaseHandler g500 = new G500Handler();
        BaseHandler g200 = new G200Handler();
        BaseHandler g100 = new G100Handler();
        BaseHandler g50 = new G50Handler();

        baseHandler.setNext(g500);
        g500.setNext(g200);
        g200.setNext(g100);
        g100.setNext(g50);

        baseHandler.handle(4850);
    }
}
