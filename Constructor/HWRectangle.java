package Constructor;

import java.util.Scanner;

class DemoRectangle{
	
	int length ;
	int breadth ;
	void calculate(){
		int area= length*breadth;
		System.out.println(area);
	}
	DemoRectangle(){
		length=0;
		breadth=0;
			
	}
	DemoRectangle(int a,int b){
		length=a;
		breadth=b;
	}
	DemoRectangle(int a){
		length=breadth=a;
		
	}
	
}
public class HWRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
	//	int length = a;
		//int breadth=b;
		DemoRectangle d=new DemoRectangle(a,b);
		DemoRectangle d1=new DemoRectangle(a);
		
		d.calculate();
		d1.calculate();
		
		

	}

}
