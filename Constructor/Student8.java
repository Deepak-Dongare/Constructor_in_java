package Constructor;

import java.util.Scanner;

class DemoStudet{
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class Student8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc=new Scanner(System.in);
		System.out.println("Enter Id");
		int a=sc.nextInt();
		System.out.println("Enter name");
		String s=sc.next();
		DemoStudet t=new DemoStudet();
		t.setId(a);
		t.setName(s);
	int i=t.getId();
	System.out.println(i);
		String n=t.getName();
		System.out.println(n);
		
		

	}

}
