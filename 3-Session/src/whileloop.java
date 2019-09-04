public class whileloop {
    public static void main(String[] args) {

        boolean expression = true;
        int counter = 0;
        while (expression) {
            int interInsideWHile = 10;
            counter++;

            if(counter == 5) {
                expression = false; //exit strategy
            }

            /* Or use this to exit explicitly
            if (counter == 5) {
                break;
            }

             */
        }
        System.out.println("We are done with the loop and counter is: " + counter);
    }
}
