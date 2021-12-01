import java.io.*;
import java.util.ArrayList;

public class DayOnePartOne {

    public static int count(ArrayList arr)
    {
        int count = 0;

        for (int i = 0; i < arr.size(); i++)
        {
            if (i < arr.size()-1)
            {
                int tmp1 = Integer.valueOf((String) arr.get(i));
                int tmp2 = Integer.valueOf((String) arr.get(i+1));

                if (tmp2 > tmp1)
                {
                    count++;
                }
            }
        }
        
        return count;
    }

	public static void main(String[] args) throws Exception
	{
		File file = new File("/Users/jason/day1.txt");
            
		BufferedReader br
			= new BufferedReader(new FileReader(file));
      
        String str;
        ArrayList arr = new ArrayList<>();
        
        while ((str = br.readLine()) != null)
        {
            arr.add(str);
            System.out.println(str);
        }
            
        br.close();

        int count = count(arr);
        System.out.println(count);
	}
}

