public class ImprovedAssignment {

    public static void main(String[] args) {

        // payrate, overtime rate, and hours are defined as variables
        double payrate = 23.40;
        double overtimerate = 30.00;
        double hours = 30;

        // if the hours are less than or equal to 40 multiply hours by payrate
        if(hours <= 40)
        {
            System.out.println(hours * payrate);
        }
        // if hours are greater than 40, subtract 40 from hours and multiply by overtime rate, then add the payrate multiplied by 40
        else if(hours > 40)
        {
            System.out.println(((hours - 40) * overtimerate) + (payrate * 40));
        }

    }
}