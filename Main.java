package boxMatching;

public class Main {
	public static void main(String[] args) {
		Fighter marc = new Fighter("Marc", 15, 90, 96, 0);
		Fighter alex = new Fighter("Alex", 10, 90, 100, 0);
		Ring r = new Ring(marc, alex, 90, 100);
		r.run();
	}

}
