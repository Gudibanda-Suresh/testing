package CarDevelopmentProject;

public class CarDevelop {
	public static void main(String[]ar) {
		Driver d=new Driver();
		d.drive(new Swift());
		System.out.println("-______________-");
		d.drive(new Audi());
		System.out.println("-______________-");
		d.drive(new BenZ());
		
	}

}
