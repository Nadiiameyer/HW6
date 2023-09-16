import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UaPhoneNumValidator {
    public static void main(String[] args) {
        String phoneNumber = "+380951234597";
        boolean isValid = isValidUaPhoneNumber(phoneNumber);
        if (isValid) {
            System.out.println("Phone number is valid.");
        } else {
            System.out.println("Phone number is not valid.");
        }
    }

    public static boolean isValidUaPhoneNumber(String phoneNumber) {
        String regex = "^\\+380\\d{9}$";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
}

