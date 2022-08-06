package autometiontest;

public class IfThenElse_Q3 {

    public static boolean isTeen(int age) {
        if (age <= 18) {
            return true;
        } else
            return false;
    }
    public static void main (String [] args){
        System.out.println("15 - " + isTeen(15));
        System.out.println("25 - " + isTeen(25));
    }

}
