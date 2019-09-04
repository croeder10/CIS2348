public class BooleanOperator {
        public static void main(String[] args)  {

            int x = -2;

            boolean a = false;
            boolean b = false;
            boolean c = true;
            boolean d = true;

            // || is or
            // && is and
            // ! is not


            boolean result = !(((!a && b) || !(c || d)) && (!(a || d)) ^ !(b ^ !a))
            boolean newresult = !a && b;
            System.out.println("The result is: " + result);



        }

}
