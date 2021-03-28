class Iron {
	Iron() {
		System.out.println("parent class constructor invoked");
	}
}
abstract class man
{
	abstract void add() ;
	public void sum() {
		
	}
}

interface I{
	void a();
	
	
}


class B3 implements  I {
	public void a() {
		System.out.println("B3");
	}
	B3() {
		super();
		System.out.println("child class constructor invoked");
	}

	B3(int a) {
		super();
		System.out.println("child class constructor invoked " + a);
	}

	{
		System.out.println("instance initializer block is invoked");
	}

	public static void main(String args[]) {
		B3 b1 = new B3();
		B3 b2 = new B3(10);
		//B3 b = (B3)new Iron();
		I i = new B3();
		i.a();
		B3 h = new B3();
		h.a();
	}
	
}