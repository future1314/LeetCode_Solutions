package leetcode;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
 
public class SortTextFile 
{      
    public static void main(String[] args)
    {    
        BufferedReader reader = null; 
         
        BufferedWriter writer = null;
                 
        //Create an ArrayList object to hold the lines of input file
         
        ArrayList<String> lines = new ArrayList<String>();
         
        try
        {
            //Creating BufferedReader object to read the input file
             
            reader = new BufferedReader(new FileReader("C:\\Users\\tianyue\\Desktop\\input.txt"));
             
            //Reading all the lines of input file one by one and adding them into ArrayList
             
            String currentLine = reader.readLine();
             
            while (currentLine != null) 
            {
                lines.add(currentLine);
                 
                currentLine = reader.readLine();
            }
             
            //Sorting the ArrayList
            Comparator<String> comp = new Comparator<String>() {
				@Override
				public int compare(String a, String b) {
					// TODO Auto-generated method stub
					if(a.equals("")) a="0 a";
					if(b.equals("")) b="0 a";
					String[] aa = a.split(" ");
            		String[] bb = b.split(" ");
            		return Integer.parseInt(aa[0])-Integer.parseInt(bb[0]);
				}
            };
             
            
            HashSet<String> set = new HashSet();
            List<String> list = new ArrayList();
            for(String line: lines) {
            	set.add(line);
            }
            list.addAll(set);
            Collections.sort(list,comp);
            
            //Creating BufferedWriter object to write into output file
             
            writer = new BufferedWriter(new FileWriter("C:\\Users\\tianyue\\Desktop\\output.txt"));
             
            //Writing sorted lines into output file
             
            for (String line : list)
            {
                writer.write(line);
                 
                writer.newLine();
            }
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        finally
        {
            //Closing the resources
             
            try
            {
                if (reader != null)
                {
                    reader.close();
                }
                 
                if(writer != null)
                {
                    writer.close();
                }
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
    }    
}
