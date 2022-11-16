package p1;

public class A 
{

public  String Rvs(String Z)

{
//String Y=null;	
String c=null;
String[]M=Z.split(" ");
String P=M[1];
String[]Q= P.split("");
int V= Q.length;


for(int j=Q.length-1;j>=0;j--)
{
	c=Q[j];
	System.out.print( Q[j]);

}
System.out.println (" the size of the string is " +V);
return c;

}

public static void main(String[] args) 
	{
	
String B= "The Enemy Line";

A X2= new A();
X2.Rvs(B);
	}
}


