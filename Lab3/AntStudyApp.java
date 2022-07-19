import java.text.DecimalFormat;
public class AntStudyApp{
    public static void main(String[] Args){
        // AntJourney test_ant = new AntJourney("test ant", "2,1: 3,4: 1,6: 4,7: 6,4: 3,1: 1,4" );
        String coordinates = "2,1: 3,4: 1,6: 4,7: 6,4: 3,1: 1,4";
        splitter(coordinates);
    }
    public static void splitter(String coordinates){
            String[] split = coordinates.split(":",-1);
            // now we have a string array that is split by the ":"
            // lets use a for loop now to go through the split array and split into a new array 
            // create a new array that is 2 times the length of the split array  
            String[] intCor = new String[2*split.length];
            
            for(int i = 0; i < intCor.length; i = i+2){
                intCor[i] = split[i].split(":", -1);
                
            }
            
            system;



            
    }
            
            
    }

//the format of the output for an ant:  Blue Ant: 2,1: 3,4: 1,6: 4,7: 6,4: 3,1: 1,4 