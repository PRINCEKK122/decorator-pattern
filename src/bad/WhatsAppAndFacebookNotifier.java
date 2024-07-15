package bad;

public class WhatsAppAndFacebookNotifier extends BadNotifier {
    public WhatsAppAndFacebookNotifier(String username) {
        super(username);
    }

    @Override
    public void send(String message) {
        var whatsappNotification = new WhatsAppNotifier(getUsername());
        whatsappNotification.send(message);

        var facebookNotification = new FacebookNotifier(getUsername());
        facebookNotification.send(message);
    }

}
