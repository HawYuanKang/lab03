package Exercise3;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataRead 
{
	public static void main(String[] args) 
	{
		String sourceFile = "File1.txt";
		try 
		{
			DataInputStream dis = new DataInputStream(new FileInputStream(sourceFile));

			double rainrate = 0;
			double totalrainrate = 0;
			int numberrecord = 0;
			
			System.out.println( "CHENG(TAMAN MERDEKA):");
			while(dis.available() > 0) 
			{
				rainrate = dis.readDouble();
				System.out.print( rainrate + " \t ");
				totalrainrate += rainrate;
				numberrecord ++;
			}
			dis.close();

			double averageRainrate = totalrainrate / numberrecord;
			String formattedAverage = String.format("%.1f", averageRainrate);
			System.out.print("\nAverage rain fall rate for " + (numberrecord) + " days : " + formattedAverage + "%");
		} 
		catch (Exception ex) 
		{
			ex.printStackTrace();
		}
	}
}
