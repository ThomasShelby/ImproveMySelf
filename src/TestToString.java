//====================================================================================================
//====================================VERSION_1(with"toString")=======================================
public class TestToString {

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
}
