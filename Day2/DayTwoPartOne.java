import java.io.*;
import java.util.ArrayList;

public class DayTwoPartOne {

	public static void main(String[] args) throws Exception
	{
		File file = new File("/Users/jason/GitHub_file_management/Advent-Of-Code-Event-2021/Day2/day2.txt");
            
		BufferedReader br
			= new BufferedReader(new FileReader(file));
      
        String str;
        int horizontal = 0;
        int depth = 0;
        
        while ((str = br.readLine()) != null)
        {
            String[] split = str.split("\\s+");
            int value = Integer.valueOf(split[1]);
            
            if (split[0].equals("forward"))
            {
                horizontal += value;
            
            } else if (split[0].equals("up")) 
            {
                depth = depth - value;
                
            } else if (split[0].equals("down")) 
            {
                depth = depth + value;
            }
            
        }
            
        br.close();

        int finalValue = horizontal*depth;
        System.out.println(finalValue); 
	}
}

