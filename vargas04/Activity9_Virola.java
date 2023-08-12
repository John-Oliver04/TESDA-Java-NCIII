package vargas04;

//main class
public class Activity9_Virola {
//    static long variable
    static long contactNumber = 9457330255L;
//    local float variable
    private float bodyTemperature;

//    class constructor
    public Activity9_Virola(float temperature) {
//        declaring variable come from parameter then pass it to local variable
        this.bodyTemperature = temperature;
    }

//    main method
    public static void main(String[] args) {
//        variable firstName
        String firstName = "John Oliver";
//        variable lastName
        String lastName = "Virola";

        // Create an instance of the class or object
        Activity9_Virola person = new Activity9_Virola(36.6f);

        // Access the instance variable using the created object using sout
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Contacts: " + contactNumber);
        System.out.println("Body Temperature: " + person.bodyTemperature);
    }
}
