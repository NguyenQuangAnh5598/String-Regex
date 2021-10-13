import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Class {
    private static Pattern pattern;

    private static final String CLASSNAME_REGEX = "^[CAP][0-9]{4}[G-M]$";

    public Class() {
        pattern = Pattern.compile(CLASSNAME_REGEX);
    }

    public boolean validate(String regex) {
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
