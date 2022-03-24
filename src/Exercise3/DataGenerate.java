package Exercise3;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataGenerate 
{
	public static void main(String[] args) 
	{
		String outFile = "File1.txt";
		double rainrate[] = {7.0,0.0,0.0,8.0,0.0,0.0};
		
		try 
		{
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(outFile));
			for (int index = 0; index < 6; index++) 
			{
				dos.writeDouble(rainrate[index]);
				dos.flush();
			}
			dos.close();
		} 
		catch (Exception ex) 
		{
			ex.printStackTrace();
		}
	}
}