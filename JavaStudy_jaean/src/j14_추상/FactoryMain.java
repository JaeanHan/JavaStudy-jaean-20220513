package j14_추상;

public class FactoryMain {

	public static void main(String[] args) {
		Factory samsung = new SamsungFactory();
		Factory lg = new LGFactory();
		
		Factory[] factories = new Factory[2];
		
		factories[0] = new SamsungFactory();
		factories[1] = new LGFactory();
		
		for(Factory factory : factories) {
			factory.start();
		}
		
		for(Factory factory : factories) {
			factory.stop();
		}
		
	}

}
