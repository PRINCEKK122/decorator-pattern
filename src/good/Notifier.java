package good;

import good.INotifier;
import util.DatabaseService;

public class Notifier implements INotifier {
    private final String username;
    protected final DatabaseService databaseService;

    public Notifier(String username) {
        this.username = username;
        databaseService = new DatabaseService();
    }

    public void send(String message) {
        var mail = databaseService.getMailFromUsername(username);
        System.out.println("Sending " + message + " by Mail to " + mail);
    }

    public String getUsername() {
        return username;
    }
}
