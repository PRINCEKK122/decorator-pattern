import good.FacebookDecorator;
import good.INotifier;
import good.WhatsAppDecorator;
import good.Notifier;

public class Main {
    public static void main(String[] args) {
//        BadNotifier notifier = new WhatsAppAndFacebookNotifier("princekk122");
//        notifier.send("hello");

//        BadNotifier notifier1 = new WhatsAppNotifier("raiden32");
//        notifier1.send("connecting...");
//
//        BadNotifier notifier2 = new FacebookNotifier("sophie");
//        notifier2.send("hi");

        INotifier notifier3 = new FacebookDecorator(new WhatsAppDecorator(new Notifier("princekk12")));
        notifier3.send("yooo");
    }
}
