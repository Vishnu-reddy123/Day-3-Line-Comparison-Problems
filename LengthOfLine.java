import java.lang.Math.*;
public class LengthOfLine {
    public static void main(String[] args){
       int x1=2;
       int y1=6;
       int x2=9;
       int y2=4;
        double len = Math.sqrt((x2-x1)^2 + (y2-y1)^2);
        System.out.println("Length Of Line is:"+len);
    }
}
