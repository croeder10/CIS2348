public class StringOperatopr {
        public static void main(String[] args)  {

            String s1 = "hi";
            String s2 = "Hi";
            String s3 = new String( "Hi");
            boolean stringsAreTheSame = s1 == s2;
            boolean sTwoAndsThreeAreTheSame = s2 == s3;

            System.out.println("s1 is the same as s2: " + stringsAreTheSame);
            System.out.println("s2 is the same as s3: " + sTwoAndsThreeAreTheSame);

            System.out.println("My strings are: " + s1 + " " + s2 + " " + s3);

            boolean correctComparison = s1.equals(s3);
            System.out.println("s1 is the same as s3: " +  correctComparison);



        }

}
