package good;

public class FacebookDecorator extends BaseNotifierDecorator {
    public FacebookDecorator(INotifier wrapped) {
        super(wrapped);
    }

    public void send(String message) {
        super.send(message);
        String fbName = databaseService.getFBNameFromUsername(getUsername());
        System.out.println("Sending " + message + " on Facebook to " + fbName);
    }
}
