import bad.BadNotifier;
import bad.FacebookNotifier;
import bad.WhatsAppAndFacebookNotifier;

import bad.WhatsAppNotifier;
import util.Notifier;

public class Main {
    public static void main(String[] args) {
//        BadNotifier notifier = new WhatsAppAndFacebookNotifier("princekk122");
//        notifier.send("Message");

        BadNotifier notifier1 = new WhatsAppNotifier("raiden32");
        notifier1.send("connecting...");

        BadNotifier notifier2 = new FacebookNotifier("sophie");
        notifier2.send("hi");

//        INotifier notifier = new WhatsAppDecorator(new Notifier("princekk12"));
    }
}
