package bad;

public class WhatsAppNotifier extends BadNotifier {
    public WhatsAppNotifier(String username) {
        super(username);
    }

    @Override
    public void send(String message) {
        String phoneNumber = databaseService.getPhoneNumberFromUsername(getUsername());
        System.out.println("Sending " + message + " by Whatsapp on " + phoneNumber);
    }
}
