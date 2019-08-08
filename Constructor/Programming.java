package Constructor;

import java.util.Scanner;

class DemoProgramming{
	String  s;
	
DemoProgramming(){
		s="I love" ;
		
	}
	DemoProgramming(String n){
		//s="I love " ;
	//	this.s=n;
	s +=n;
		
		
		
	}
	
	void print(){
System.out.println(s);		
	}
	
}
public class Programming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		DemoProgramming d=new DemoProgramming();
		System.out.println("Enter String ");
		String a=sc.nextLine();
		DemoProgramming d1=new DemoProgramming(a);
		d1.print();
		
		

	}

}
