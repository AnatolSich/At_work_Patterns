package IDecorator;

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
    Messaging wrappee;
    abstract int countMesages();

    public Decorator(Messaging wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void sendMessage() {
        wrappee.sendMessage();
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
       // count++;
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
      //  count++;
        System.out.println("Send facebook message");
        count++;
    }
}