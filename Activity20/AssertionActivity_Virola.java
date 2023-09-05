package Activity20;

public class AssertionActivity_Virola {

    public static void main(String[] args) {
        String[] weekends = {"Friday", "Saturday", "Sunday","Monday"};

        // Check if there are exactly 2 weekends
        assert  weekends.length != 2 : "There are only two (2) weekends in a week." ;

        System.out.println("There are 2 weekends in a week.");
    }
}
