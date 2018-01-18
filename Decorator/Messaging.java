package Decorator;

public interface Messaging {
    void sendMessage();
}

class MobilSend implements Messaging{
    @Override
    public void sendMessage() {
        System.out.println("Send SMS");
    }
}

class InternetSend implements Messaging{
    @Override
    public void sendMessage() {
        System.out.println("Send inet message");
    }
}

abstract class Decorator implements Messaging{
    Messaging messaging;
    abstract int countMesages();

    public Decorator(Messaging messaging) {
        this.messaging = messaging;
    }

    @Override
    public void sendMessage() {
        messaging.sendMessage();
    }
}


class ViberMobilSendDec extends Decorator{
    int count;

    public ViberMobilSendDec(Messaging messaging) {
        super(messaging);
    }

    @Override
    int countMesages() {
        return this.count;
    }

    @Override
    public void sendMessage() {
        super.sendMessage();
        count++;
        System.out.println("Send viber message");
        count++;
    }
}
class FacebookInetSendDec extends Decorator{
    int count;

    public FacebookInetSendDec(Messaging messaging) {
        super(messaging);
    }

    @Override
    int countMesages() {
        return this.count;
    }

    @Override
    public void sendMessage() {
        super.sendMessage();
        count++;
        System.out.println("Send facebook message");
        count++;
    }
}