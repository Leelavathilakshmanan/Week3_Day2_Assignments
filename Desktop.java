package week3_Day2Assignment1;

public class Desktop implements Hardware,Software{
 
	public void desktopModel() {
		System.out.println("Desktop Method");
	}
	public static void main(String[] args)
	{
		Desktop obj=new Desktop();
		obj.desktopModel();
		obj.hardwareResource();
		obj.softwareResource();
		obj.test(5);
	}
	public void softwareResource() {
		// TODO Auto-generated method stub
		System.out.println("Software Resource method");
	}
	public void hardwareResource() {
		// TODO Auto-generated method stub
		System.out.println("Hardware Resource Method");
		
	}
	public void test(int a) {
		// TODO Auto-generated method stub
		System.out.println("The test value : "+a);
		
	}
}
