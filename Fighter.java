package boxMatching;

public class Fighter {

	String name;
	int damage;
	int health;
	int weight;
	int dodge;

	public Fighter(String name, int damage, int health, int weight, int dodge) {
		this.name = name;
		this.damage = damage;
		this.health = health;
		this.weight = weight;

		if (dodge <= 100 && dodge >= 0) {
			this.dodge = dodge;
		} else {
			this.dodge = 0;
		}

	}

	public int hit(Fighter foe) {
		System.out.println("------------------");
		System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu.");

		if (foe.dodge()) {
			System.out.println(foe.name + " gelen hasarý savurdu.");
			return foe.health;
		}

		if (foe.health - this.damage < 0) {
			return 0;
		}

		return foe.health - this.damage;
	}

	public boolean dodge() {
		double randomValue = Math.random() * 100;
		return randomValue <= this.dodge;
	}
}
