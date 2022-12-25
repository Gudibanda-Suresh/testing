package CarDevelopmentProject;

public class Audi implements Car  {
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
}
