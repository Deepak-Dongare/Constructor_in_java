package Constructor;

import java.util.Scanner;

class DemoAddAmount{
	
	int amount;
	DemoAddAmount(){
		amount=50;
		
	}
	DemoAddAmount(int a){
		amount=50;
		amount+=a;
		//System.out.println(amount );
		
	} 
	void display(){
		
		System.out.println(amount);
	}
}

public class HWAddAmount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoAddAmount h1=new DemoAddAmount();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter mony you want ");
		int a=sc.nextInt();
		DemoAddAmount h=  new DemoAddAmount(a);
		h1.display();
		h.display();
	      
		
		
		

	}

}
