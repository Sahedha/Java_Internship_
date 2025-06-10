import java.util.*
class Vehicle{
	Scanner sc=new Scanner(System.in);
	String color;
	String name;
	int vno;
	
	Vehicle(String color, String name, int vno){
		this.color=color;
		this.name=name;
		this.vno=vno;
	}
	public static void start(){
		System.out.println(name +" Started.");
	}
	public static void disp(){
		System.out.println("Vehicle color :" +color+"	and Vehicle number is: "+vno+".");
}
class Car extends Vehicle{
	Car(String color, String name, int vno){
		super(color , name , vno);
	}
	@override
	void start(){
		System.out.println(name+ " car Starts with a key.");
	}
	
}
class Bike extends Vehicle{
	Bike(String color, String name, int vno){
		super(color , name , vno)
	}
	@override
	void start(){
		System.out.println(name + " bike starts with a key and a kick");
	}

}
// Main class demonstrating polymorphism
public class VehicleExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter vehicle color: ");
        String color = sc.next(); 

        System.out.print("Enter vehicle name: ");
        String name = sc.next(); 

        System.out.print("Enter vehicle number: ");
        int vno = sc.nextInt();

        System.out.print("Choose Vehicle Type (Car/Bike): ");
        String type = sc.next().toLowerCase(); // Convert input to lowercase

        Vehicle myVehicle;

        if (type.equals("car")) {
            myVehicle = new Car(color, name, vno);
        } else if (type.equals("bike")) {
            myVehicle = new Bike(color, name, vno);
        } else {
            System.out.println("Invalid vehicle type! Defaulting to generic Vehicle.");
            myVehicle = new Vehicle(color, name, vno);
        }

        myVehicle.start();
        myVehicle.disp();

        sc.close();
    }
}