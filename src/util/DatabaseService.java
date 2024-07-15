package util;

public class DatabaseService {
    public String getMailFromUsername(String username) {
        return username + "@Mail";
    }

    public String getPhoneNumberFromUsername(String username) {
        return username + "@WhatsApp";
    }

    public String getFBNameFromUsername(String username) {
        return username + "@Facebook";
    }

//    public String getWhatsAppAndFacebookUsername(String username) {
//        var whatsAppNotification = getPhoneNumberFromUsername(username);
//        var facebookNotification = getFBNameFromUsername(username);
//        return whatsAppNotification + "\n" + facebookNotification;
//    }
}
