package Exercise4;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataRead 
{
	public static void main(String[] args) 
	{
		String test;
		double test2;
		double total=0;
		try 
		{
			for(int i=0;i<6;i++)
			{
				String files="File"+i+".txt";
				DataInputStream dis = new DataInputStream(new FileInputStream(files));
				while(dis.available()>0)
				{
					test=dis.readUTF();
					System.out.print( test + " \t ");
					test=dis.readUTF();
					System.out.print( test + " \t ");
					test=dis.readUTF();
					System.out.print( test + " \t \n");
					for(int j=0;j<6;j++)
					{
						test2=dis.readDouble();
						System.out.print( test2 + " \t ");
						total += test2;									
					}
					double averageRainrate = total / 6;
					String formattedAverage = String.format("%.1f", averageRainrate);	
					System.out.print("\nAverage rain fall rate is " + formattedAverage + "%");	
					total=0;
					System.out.print(" \n\n");
				}
			}
		} 
		catch (Exception ex) 
		{
			ex.printStackTrace();
		}
	}
}
