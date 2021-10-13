public class ClassTest {
    public static final String[] validClassName = {"C4567K", "A7812L", "P8979H"};
    public static final String[] invalidClassName = {"W6854K", "C45623L", "C5646Q"};

    public static void main(String[] args) {
        Class aClass = new Class();
        for (String name : validClassName) {
            boolean isvalid = aClass.validate(name);
            System.out.println("ClassName " + name + " is : " + isvalid);
        }
        for (String name : invalidClassName) {
            boolean isvalid = aClass.validate(name);
            System.out.println("ClassName " + name + " is : " + isvalid);
        }
    }
}
