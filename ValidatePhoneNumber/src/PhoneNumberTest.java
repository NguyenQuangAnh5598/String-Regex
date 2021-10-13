public class PhoneNumberTest {
    public static final String[] phoneNumber = {"(45)-(465578315)", "(789)-(465578315)", "(12)-(5465578315)", "(465)-(4653578315)", "(78)-(569478315)",};

    public static void main(String[] args) {
        PhoneNumber phoneNumber1 = new PhoneNumber();
        for (String x : phoneNumber) {
            boolean isvalid = phoneNumber1.validate(x);
            System.out.println("Phone Number " + x + " is valid " + isvalid);
        }
    }
}
