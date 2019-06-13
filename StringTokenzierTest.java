import java.util.StringTokenizer;
import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class StringTokenzierTest {

	static HashMap<String, Integer> hm = new HashMap<String, Integer>();
	static Iterator<String> keys = hm.keySet().iterator();
	
	public static void main(String[] args) {
		String line;
		String fname = "C:/Users/Kai/Desktop/oil.html";
		
		//Scanner input = new Scanner(System.in);
		//String temp = input.next();
		
		try
		{
			FileInputStream fis = new FileInputStream(fname);
			InputStreamReader isr = new InputStreamReader(fis);
			System.out.println(isr.getEncoding());
			BufferedReader br = new BufferedReader(isr);
			System.out.println();
			
			while((line = br.readLine()) != null)
			{
				StringTokenizer st1 = new StringTokenizer(line, " &<!?=-_:;,.'(abcdefghijklmnopqrstuvwxyz)|ABCDEFGHIJKLMNOPQRSTUVWXYZ\"*/[^>]*>");
				printToken(st1);
			}
			br.close();
			isr.close();
			fis.close();
		}
		catch(FileNotFoundException e)
		{
			System.err.println("No file.");
		}
		catch(IOException e)
		{
			System.err.println(e);
		}
		while(keys.hasNext())
		{
			String key = keys.next();
			int value = hm.get(key);
			//if(key == temp)
				//System.out.println("키 값 : "+ key + " : " + value);
		}
	}
	
	public static void printToken(StringTokenizer st)
	{
		if(st.countTokens() != 0)
			System.out.println("토큰 수 : " + st.countTokens());
		
		while(st.hasMoreTokens())
		{
			System.out.print(st.nextToken() + " ");
			//hm.put(st.nextToken(), st.countTokens());
		}
		System.out.println();
	}
	
	
	
	

}
