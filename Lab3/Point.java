 import java.lang.Math; // importing the math class  



public class Point{
    
    
    private int x;
    private int y;


    public Point(){} // default constructor
     // getters
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
    //setters
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }

    public double distanceToOtherPoint(Point p){ // pass in a parameter of another point
        //formula 
        return Math.sqrt(((x- p.x)*2)+((y - p.y)*2)); // returns the distance from the current point to the parameter point 
    }
    public static double distanceBetweenTwoPoints(Point p1, Point p2){
        return Math.sqrt(((p1.x- p2.x)*2)+((p1.y - p2.y)*2)); // retruns the distance between the 
    }
    public String toString(){
        return ("(" + x + "," + y + ")"); // prints out the coordinates 
    }
}
