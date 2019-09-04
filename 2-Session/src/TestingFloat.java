public class TestingFloat {

    public static void main(String[] args) {

        double x = 1.23;
        int sum;

        sum = 1+5;

        System.out.println(sum);



        int i = 5;
        double d = 34.0;

        // implicit type conversion
        d = i;
        // i = d; // error loss of precision. less precision to more precision, not the other way around
        d = 4.7;
        // explicit type conversion
        i = (int)d;


        // use final as a constant value
        final double RATE = 1.02;



    }
}
