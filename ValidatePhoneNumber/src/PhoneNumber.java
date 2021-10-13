import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    Pattern pattern;
    public static final String PHONENUMBER_REGEX = "\\([0-9]{2}\\)-\\([0-9]{9}\\)$";

    public PhoneNumber() {
        pattern = Pattern.compile(PHONENUMBER_REGEX);
    }

    public boolean validate(String regex) {
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
