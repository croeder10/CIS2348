public class assignment {

    public static void main(String[] args) {

        // manager pay rate
        final double manager = 23.40;

        // overtime rate
        final double overtime = 30.00;

        // initiating operation pay
        double pay;

        // pay is (pay rate * hours up to 40) + (overtime rate * hours over 40)
        pay = (manager * 40) + (overtime * 7);

        // print the total pay
        System.out.println(pay);

    }
}
