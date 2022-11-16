package p1;

public class B {

	public static void main(String[] args) 
	{
String a="the enemy line";
String[] b=a.split(" ");
String c=b[1];
//int m=c.length();
String[]d=c.split("");
//int f= d.length;
//String e=null;
for(int i=d.length-1;i>=0;i--)
{
	System.out.println(d[i]);
}
System.out.println( "the size is "+d.length);
	
	}

}
