package Decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        MobilSend mobilSend = new MobilSend();
        InternetSend internetSend = new InternetSend();

        SendMessages.send(mobilSend);
        SendMessages.send(internetSend);

        ViberMobilSendDec viberMobilSendDec1 = new ViberMobilSendDec(mobilSend);
        FacebookInetSendDec facebookInetSendDec2 = new FacebookInetSendDec(viberMobilSendDec1);
        ViberMobilSendDec viberMobilSendDec3 = new ViberMobilSendDec(facebookInetSendDec2);
        FacebookInetSendDec facebookInetSendDec4 = new FacebookInetSendDec(viberMobilSendDec3);

        SendMessages.send(viberMobilSendDec1);
        SendMessages.send(facebookInetSendDec2);
        SendMessages.send(facebookInetSendDec2);
        SendMessages.send(viberMobilSendDec3);
        SendMessages.send(viberMobilSendDec3);
        SendMessages.send(viberMobilSendDec3);
        SendMessages.send(facebookInetSendDec4);
        SendMessages.send(facebookInetSendDec4);
        SendMessages.send(facebookInetSendDec4);
        SendMessages.send(facebookInetSendDec4);


        SendMessages.printCount(viberMobilSendDec1);
        SendMessages.printCount(facebookInetSendDec2);
        SendMessages.printCount(viberMobilSendDec3);
        SendMessages.printCount(facebookInetSendDec4);
    }
}

class SendMessages {
    static void send(Messaging messaging) {
        messaging.sendMessage();
    }

    static void printCount(Decorator decorator) {
        System.out.println(decorator.countMesages());
    }
}