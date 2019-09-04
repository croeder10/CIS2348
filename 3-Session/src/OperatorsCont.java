public class OperatorsCont {
    public static void main(String[] args)  {

        int x = -2;

        // if(x>0) then(?) x=100 elseif(:) (x>-10) then x=-5, elseif (x>-3) then x=6 else -2
        x = (x > 0) ? 100 : (x > -10) ? (x > -3) ? -2 : 6 : -5;

        System.out.print(x);

        // if (x>0) then x=100* (+=) 110
        x += ( x >0) ? 100 : -100;

        System.out.println(x);



    }
}
