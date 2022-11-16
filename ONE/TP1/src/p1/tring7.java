package p1;

public class tring7 {

	public static void main(String[] args)
	{
		String ab= "The Departed";
		String[] cd= ab.split(" "); //Corrected
		String ef=null;
		
		
		
		for(int i=0;i<cd.length;i++)// i should start from 0
		{
		 if(i==0)//Since if we dont know put the condition, ef value will be modify to latest value
		 {
			 
		 ef=cd[i];
		 }
		}
		System.out.print(ef);
	}
}

	
