import java.util.Scanner;


public class Bicycle{
    public static void main(String [] args){
        private int wheelDia;
        private boolean electric;
        private String colour;

    }
    Bicycle();

    Bicycle(int wheelDia, boolean electric ){
        this.wheelDia = wheelDia;
        this.electric = electric;

    }
    public void setColour(){
        Scanner sc = new Scanner(System.in); // creating a scanner 
        String newcolour = sc.nexLine(); // setting the new colour equal to teh input from the scanner.
        String colour = newcolour; // setting the colour to the new scanner 
    }
    public boolean isElectric(){
        return electric = true;   
        }
    }
    public double getImperial(){
        return (wheelDia/25.4); // wheel diameter 
    }
    public int getMetric(){
        return wheelDia;
    }
    public String isElectric2(boolean electric){
        if(electric = true){
            return "Electric";
        }else:{
            return "Push-Bike";
        }
    }
    
    public String toString(){
        return ("Bicycle is" + colour + ". Wheel size is" + getMetric() +  "inches." + isElectric2())
    }




}