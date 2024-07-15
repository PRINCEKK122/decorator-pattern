package bad;

public class FacebookNotifier extends BadNotifier {
    public FacebookNotifier(String username) {
        super(username);
    }

    @Override
    public void send(String message) {
        String facebookMessage = databaseService.getFBNameFromUsername(getUsername());
        System.out.println("Sending " + message + " on Facebook to " + facebookMessage);
    }
}
