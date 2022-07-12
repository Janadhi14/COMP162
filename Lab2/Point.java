import java.lang.Math; // importing the math class  



public class Point{
    
    
    private int x;
    private int y;


    public Point(){} // default constructor
    
    public Point(int x, int y){
        this.x = x; 
        this.y = y;   
    } // main constructor 
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public double dstanceToOtherPoint(Point p){
        return Sqrt(Point.x- p.x)*2+(Point.y - p.y)*2);
    }
    public static double distanceBetweenTwoPoints(Point p1, Point p2){
        return Sqrt(((p1.x- p2.x)*2)+((p1.y - p2.y)*2));
    }
    public String toString(){
        return ("The distance between P1 and P2 is" + );
    }
}
