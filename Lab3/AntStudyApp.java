import java.text.DecimalFormat;
public class AntStudyApp{
    public static void main(String[] Args){
        // AntJourney test_ant = new AntJourney("test ant", "2,1: 3,4: 1,6: 4,7: 6,4: 3,1: 1,4" );
        String dfg = "2,1: 3,4: 1,6: 4,7: 6,4: 3,1: 1,4";
        methodDD(dfg);
    }
    public static void methodDD(String dfg){
            String[] split = dfg.split(":",-1);
            for (int i=0; i<split.length; i++)
                System.out.println(split[i]);
                
            System.out.println("Done");
            
    }
}

//the format of the input for an ant:  Blue Ant: 2,1: 3,4: 1,6: 4,7: 6,4: 3,1: 1,4 