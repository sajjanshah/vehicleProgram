/* create a  object named MyCar and call fullThrottle() and Speed method on MyCar object and run the program */

public class Car {

	public void fullThrottle(){
		System.out.println("the car is going as fast as it can!");
	}
	public void Speed (int maxSpeed){
		System.out.println("maxSpeed is "+ maxSpeed);
	}
	public static void main(String[] args){								  
		Car MyCar=new Car();
		MyCar.fullThrottle();
		MyCar.Speed(200);									 
	}		
}								 
								 
								  
								  