public class JavaCompare {
    public static void main(String[] args){
        int x1 = 7;
        int y1 = 7;
        int x2 = 3;
        int y2 = 5;
        int result1 = Integer.compare(x1,y1);
        System.out.println("Result of compare(x1,y1)is:"+ result1);
        int result2 = Integer.compare(x2,y2);
        System.out.println("Result of compare(x2,y2)is:"+ result2);


    }
}
