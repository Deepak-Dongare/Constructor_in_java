package Constructor;

class DemoTest{
	
	DemoTest(){
		method();
	}
	DemoTest(int a,int b){
		method(a);
		method(a,b);
		
	}
	void method(){
		
		System.out.println("i am defualt method");
		int n=100;
		for(int i=1;i<=n;i++)
		{
			if(i%2==0) {
				System.out.println("Odd Number::="+i);
				
			}
			else {
				System.out.println("Even Number"+i);
			}
		}
		
	}
	void method(int a) {
		System.out.println("single paramiter method");
		
		int n=7;
		  int f1 = 0, f2 = 1, i; 
	      
	        if (n < 1) 
	            return; 
	      
	        for (i = 1; i <= n; i++) 
	        { 
	            System.out.print(f2+" "); 
	            int next = f1 + f2; 
	            f1 = f2; 
	            f2 = next; 
	        } 
		
	}
	void method(int a,int b)
	{
		System.out.println("\n double paramiter method");
		
		for(int i=1;i<=100;i++) {
			int sum=+i;
			System.out.print(sum);
		}
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DemoTest dt=new DemoTest();
		DemoTest dt1=new DemoTest(10,20);
	}

}
