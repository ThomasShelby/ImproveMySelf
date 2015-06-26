//====================================================================================================
//====================================VERSION_1(with"toString")=======================================
/*public class TestToString {

	private String name;
	private String address;
	private int age;
	
	public TestToString(String n,String as,int a){
		name=n;
		address=as;
		age=a;
	}
	
	public String toString(){
		return "Name: "+name+"\tAddress: "+address+"\tAge: "+age;
	}
	
	public static void main(String[] args) {
		TestToString ob=new TestToString("Mykola","Lviv", 21);
		System.out.println(ob);
	}
}*/

//====================================================================================================
//====================================VERSION_2(Input method+ "toString")=============================
import java.util.Scanner;
public class TestToString{
	private String name;
	private String address;
	private int age;
	
	public void Input(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your name: ");
		name=sc.nextLine();
		System.out.println("Enter Your address: ");
		address=sc.nextLine();
		System.out.println("Enter Your age: ");
		age=sc.nextInt();
	}
	public String toString(){
		return "Name: "+name+"\nAddress: "+address+"\nAge: "+age; 
	}
	public static void main(String[] args) {
		TestToString dt=new TestToString();
		dt.Input();
		System.out.println(dt);
	}
}
