package CarDevelopmentProject;

public class BenZ implements Car {
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

}
