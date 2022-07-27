import java.text.DecimalFormat;
public class AntStudyApp{
    public static void main(String[] Args){
        // AntJourney test_ant = new AntJourney("test ant", "2,1: 3,4: 1,6: 4,7: 6,4: 3,1: 1,4" )
        Point[] journeyData = new Point[1];
        try {
            // want to create a scanner

            Scanner sc = new Scanner(new File("AntJourneys.txt"));
            // creating a string for each line
            // we need to run a while loop
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                // now we want to scan through the line
                Scanner Linescan = new Scanner(line);
                // need to use a delimiter
                Linescan.useDelimiter(":");
                // we now need to go through the string and put it into an array 
            }

        } catch (Exception e) {
            // prints this out wehn we want to handle the exception 
            System.out.println("there is some error in the format of the file");
        }}
     
    }
                        
}

//the format of the output for an ant:  Blue Ant: 2,1: 3,4: 1,6: 4,7: 6,4: 3,1: 1,4 
