package CarDevelopmentProject;

public class Swift implements Car{
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
