public class BicycleApp{
    public static void main(String[] args){
        Bicycle [] Bikes = {new Bicycle(610, false),
            new Bicycle(697,true),
            new Bicycle(660,false)};
        for(Bicycle bike: Bikes){
            System.out.println(bike);
        }
            
    }

}