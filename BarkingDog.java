public class Main {

    public static boolean bark(boolean barking, int hourOfDay){
        if(barking == true){
            if(0 > hourOfDay || hourOfDay > 23)
                return false;
            if(8 <= hourOfDay && hourOfDay <= 23 )
                return false;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(Main.bark(true, 1));
        System.out.println(Main.bark(false, 2));
        System.out.println(Main.bark(true, 8));
        System.out.println(Main.bark(true, -1));
    }
}
