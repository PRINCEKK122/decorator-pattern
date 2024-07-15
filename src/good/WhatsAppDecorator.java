package good;

public class WhatsAppDecorator extends BaseNotifierDecorator {
    public WhatsAppDecorator(INotifier wrapped) {
        super(wrapped);
    }

    public void send(String message) {
        super.send(message);
        String phoneNumber = databaseService.getPhoneNumberFromUsername(getUsername());
        System.out.println("Sending " + message + " by WhatsApp on " + phoneNumber);
    }
}
