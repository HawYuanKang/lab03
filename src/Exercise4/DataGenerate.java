package Exercise4;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataGenerate 
{
	public static void main(String[] args) 
	{
		String stationid[]= {"2222003","2222005","2225044","2125002","2321006","2222002"};
		String stationname[]= {"Klebang Besar","Klebang Besar D/S","Sg. Chohong","Telok Rimba","Ladang Lendu","Durian Tunggal"};
		String stationdistrict[]= {"Melaka Tengah","Melaka Tengah","Jasin","Jasin","Alor Gajah","Alor Gajah"};
		double datarains[][]= {{7.0,0.0,0.0,4.0,0.0,0.0}
							,{7.0,0.0,0.0,4.0,0.0,0.0}
							,{15.0,0.0,0.0,25.0,0.0,0.0}
							,{13.0,0.0,1.0,0.0,0.0,0.0}
							,{0.0,0.0,0.0,0.0,0.0,0.0}
							,{9.0,0.0,0.0,7.0,0.0,0.0}};
		try
		{
			for(int i=0;i<6;i++)
			{
				String files="File"+i+".txt";	
				DataOutputStream dos = new DataOutputStream(new FileOutputStream(files));
				dos.writeUTF(stationid[i]);
				dos.writeUTF(stationname[i]);
				dos.writeUTF(stationdistrict[i]);
					for(int j=0;j<6;j++)
					{
						dos.writeDouble(datarains[i][j]);
					}
					dos.flush();
				dos.close();
			}
			}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}