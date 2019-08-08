package Constructor;

import java.util.Scanner;

class DemoStudent{
//	DemoStudent s=new DemoStudent();
	
	int q,w,e;
	//long per;
	static double b;
	 
	 DemoStudent(){
		 System.out.println("default Constructor ");
		 getMark();
	 }
	 DemoStudent(int a)
	 {
		 System.out.println(" parameterized Constructor ");
		 
	 }	
	void   getMark(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter java mark:::");
		int j=sc.nextInt();
		this.q=j;
		System.out.println("enter HTML mark:::");
		int h=sc.nextInt();
		this.w=h;
		System.out.println("Enter AdvJava mark:::");
		int a=sc.nextInt();
		this.e=a;
		display();
      calculateMark();
         
		
	}
	double   calculateMark()
	{
		int total =q+w+e;
		
		double pers=(total*100)/300;
		//System.out.println(pers);
		return b=pers;
		
		
		
		
	}
	void display(){
		System.out.println("Student  java Mark="+q);
		System.out.println("Student AdvJava Mark="+w);
		System.out.println("Student Html mark="+e);
		
	}
	 
		 
	 
 }
public class HWStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new DemoStudent();
		

		System.out.println(DemoStudent.b);
		

	}

}
	