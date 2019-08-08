package Constructor;


class Demo{
	
	int accountNo,  noOfWheels;
	 Demo(){
		 System.out.println("i am defualt Constructor");
		
	 }
	 Demo(int a,int b)
	 {
		 this();
		 System.out.println("i am parameter Constructor");
	 }
}
public class Cycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// d=new Demo(10,20);
		//Demo d1=new Demo();
		new Demo(10,20);

	}

}
