package Tasks1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MailCheck {
    public static void main(String[] args) {
        System.out.println(isGmailOrOutlook("@outlook.com"));
    }

    public static boolean isGmailOrOutlook(String email) {
        Pattern pattern = Pattern.compile(("[a-zA-Z0-9]+(@outlook.com)|[a-zA-Z0-9]+(@gmail.com)"));
        return pattern.matcher(email).matches();
    }

}
