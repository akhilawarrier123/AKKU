package p1;

public class String8 {

	public static void main(String[] args) 
	{
String input="java";
int a=input.length();
String[]ab1= input.split("");
//char input[]=Str.toCharArray();
for(int i=0;i<ab1.length;i++)
{
	for(int j=i+1;j<ab1.length;j++)
	{
		if(i>j)
		{
			
		Object mn=ab[i];
		ab[i]=ab[j];
		ab[j]=mn;
	}
}
	}

}
}
//dbt