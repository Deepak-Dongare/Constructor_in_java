package Constructor;

class DemoSt{
	String name;
	DemoSt()
	{
		
		name="Unknown";
		//System.out.println("Unknown");
	}
	DemoSt(String  s){
		this.name=s;
	}
	void display() {
		
		System.out.println(name);
		//System.out.println(name);
	}
	
	
	
	
}
public class Student4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DemoSt s=new DemoSt("Deepak");
		DemoSt s1=new DemoSt();
		s.display();
		s1.display();
		
		

	}

}
