package p1;

public class c1 {

String abc(int b)
{
	String s="KSRTC";
	s=s.concat("B");
	return s+b;
}
	public static void main(String[] args)
	{
	c1 x=new c1();
		String r=x.abc(20);
	System.out.println(r);

	}

}
