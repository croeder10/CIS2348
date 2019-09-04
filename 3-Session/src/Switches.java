public class Switches {

    public static void main(String[] args) {

        int i = 20;

        // when testing a variable for equality use switch statements not if (i == #)
        switch (i) {
            case 10:
                System.out.println("i is 10");
                break;

            case 15:
                System.out.println("i is 15");
                break;

            case 20:
                System.out.println("i is 20");
                break;

            default:
                System.out.println("i is not present");
                break;

        }
    }
}
