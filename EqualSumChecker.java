public class Main {

    public static boolean hasEqualsSum(int p1, int p2, int p3){
        if( (p1+p2) == p3)
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasEqualsSum(1,1,1));
        System.out.println(hasEqualsSum(1,1,2));
        System.out.println(hasEqualsSum(1,-1,0));
    }
}
