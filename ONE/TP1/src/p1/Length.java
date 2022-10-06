package p1;

public class Length 
{

	static int customLength(String abc)
	{
		String[]vb=abc.split("");
		int count=0;
		for(int i=0;i<vb.length;i++)
		{
			if(i<vb.length)
			{
				count++;
				
			}
		}
	return count;
}
 
	
public static void main(String[] args) 
{
	String xc= "Bangalore";
	String[] vb=xc.split("");
	Length.customLength(xc);
	String mn= "Chennai";
	String[]op= abc.split("");
	Length.customLength(op);
	System.out.println(Length.customLength(op));
	//System.out.println(vb.length);
	//System.out.println(customLength("Chennai"));
	System.out.println(Length.customLength(xc));



}

}
