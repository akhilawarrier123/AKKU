package p1;

public class replace 
{
	public static String Letter(String a, String e, String f)
	{

   String m=null;
   String v=null;
	String[]z=a.split("");

	for(int i=0;i<z.length;i++)
	{
		if(e.equals(z[i]))
		{
			m=z[i];
			z[i]=f;
			v=z[i];
		}	
		
		}
		
return v;

	}
	
public static void main(String[] args) 
	{
		
		
		replace.Letter("WELCOME","C","K");
		
		System.out.println(replace.Letter("WELCOME","C","K"));
		
	}

}
