package telran.reflection.sportsman;

public class Runner implements Sportsman {
int distance;

	public Runner(String distance) {
	super();
	this.distance = Integer.parseInt(distance);
}

	@Override
	public void action() {
		System.out.printf("I'm running %s km distance",distance );

	}

}
