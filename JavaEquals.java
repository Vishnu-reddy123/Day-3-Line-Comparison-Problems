public class JavaEquals {
    public static void main(String[] args){
        Integer x1 = 2;
        Integer y1 = 3;
        Integer x2 = 7;
        Integer y2 = 7;
        boolean result1 = x1.equals(y1);
        System.out.println("Result of equals()="+result1);
        boolean result2 = x2.equals(y2);
        System.out.println("Result of equals()="+result2);
    }
}
