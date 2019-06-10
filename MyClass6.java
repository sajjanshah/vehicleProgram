public class MyClass6{
	
	public static void main(String[] args) {
		A p1 = new A();
		p1.setname1("Alex");
		p1.setname1("Garry");
		p1.setname2("Rahul");
		p1.setname1("Alex");
		String name = p1.getname1();
		System.out.println(name);
		System.out.println(p1.getname2());
		System.out.println(p1.getname1());
		p1.setname1("Monte");
		p1.setName3();
		p1.setname2("Andrew");
	}
	
	
}		


class A {
	
	private String name1;
	private String name2;

	public void setname1(String x) {
		name1=x;
	}
	public void setname2(String x) {
		name2=x;
	}
	
	public String getname1(){
		return name1;
	}
	
	public String getname2(){
		return name2;
	}
		
	
}

class B extends A  {
	
	
}