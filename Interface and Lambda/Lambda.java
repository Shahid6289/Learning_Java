// @FunctionalInterface
interface Car
{ 
	void drive();
}
public class Lambda{
	public static void main(String args[]){
		Car obj=()->System.out.println("Driving...");

		obj.drive();
	}
} 