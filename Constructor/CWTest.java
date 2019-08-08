package Constructor;

class DemoTest1{
	
	DemoTest1(){
		this(1,2);
		
		System.out.println("i am frist Constructor");
		//this(1,2);
		
	}
	DemoTest1(int a,int b){
		this(1.0f,1.0f);
		System.out.println("i am second Constructor");
		
		
	}
	DemoTest1(float p,float q){
		this(2,1.0f);
		
		System.out.println("i am thread  Constructor");
		
		
	}
	DemoTest1(int ax,float by ){
		System.out.println("  i am fourth constructor");
		
	}
	
}
public abstract class CWTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new DemoTest1();

	}

}
