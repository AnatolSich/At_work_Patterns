package KChainOfResponsibility;

public interface Handler {
    static int G500 = 0;
    static int G200 = 0;
    static int G100 = 0;
    static int G50 = 0;
    static int G20 = 0;
    static int G10 = 0;
    void setNext(Handler next);

    void handle(int money);
}

