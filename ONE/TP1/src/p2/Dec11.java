package p2;

class Jan {
	public void methodA() {
		System.out.println("method of Class A");
	}
}

class Feb extends Jan {
	public void methodB() {
		System.out.println("method of Class B");
	}
}

class Mar extends Jan {
	public void methodC() {
		System.out.println("method of Class C");
	}
}

class Apr extends Jan {
	public void methodD() {
		System.out.println("method of Class D");
	}
}

public class Dec11 {

	public static void main(String[] args) {
		Feb x1= new Feb();
		Mar x2= new Mar();
		Apr x3=new Apr();
		x1.methodB();
		x2.methodC();
		x3.methodD();
		
		

	}

}
