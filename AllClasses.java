package CarDevelopmentProject;

interface Car1 {
	void start();

	void accelerate(); // abstract methods

	void stop();

}

class Swift1 implements Car1 {// implementation class
	@Override
	public void start() {
		System.out.println("Engine Starts With Key");

	}

	@Override
	public void accelerate() {
		System.out.println("Fully Clutch");

	}

	@Override
	public void stop() {
		System.out.println("With Break");

	}

}

class Audi1 implements Car1 {// implementation class
	@Override
	public void start() {
		System.out.println("Starts with Button");
	}

	@Override
	public void accelerate() {
		System.out.println("Half-clucth");

	}

	@Override
	public void stop() {
		System.out.println("Button stop");
	}
	public void autoDrive() {
		System.out.println("Auto Drive System....");	// specific method
	}
}

class BenZ1 implements Car1 {// implementation class
	@Override
	public void start() {
		System.out.println("Starts with Sensor");
	}

	@Override
	public void accelerate() {
		System.out.println("No Clutch");
	}

	@Override
	public void stop() {
		System.out.println("Stops With Sensor");
	}

	public void bluetooth() {// specific method
		System.out.println("Listening Songs");
	}

}

class Driver1 {
	void drive(Car1 car) {
		car.start();
		car.accelerate();
		car.stop();
	}

	void accessBluetooth(Car1 car) {
		if(car instanceof Audi1) {
			Audi1 a=(Audi1) car;
			a.autoDrive();
		}
		if (car instanceof BenZ1) {
			BenZ1 b = (BenZ1) car;
			b.bluetooth();
		}
		

	}

}

public class AllClasses {
	public static void main(String[] ar) {
		Driver1 d = new Driver1();
		d.drive(new Swift1());
		System.out.println("-________________________________________________-");
		d.drive(new Audi1());
		System.out.println("-________________________________________________-");
		d.drive(new BenZ1());
		System.out.println("-________________________________________________-");
		d.accessBluetooth(new Audi1());
		d.accessBluetooth(new BenZ1());
	
		
		
	}

}
