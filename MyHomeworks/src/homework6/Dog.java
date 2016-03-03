package homework6;

public class Dog {

	private String name;
	private int age;
	private int weight;
	private int power;
	private int points;

	public Dog(String name, int age, int weight ){
		setName(name);
		setAge(age);
		setWeight(weight);
		power = this.age * this.weight;
	}

	public void setName(String name) {
		if (name.equals("")){
			System.out.println("Please, enter correct name for dog.");
		}else {
			this.name = name;
		}
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		if (age < 1 || age > 30){
			System.out.println("Please, enter valid age(from 1 to 30 years).");
		}else {
			this.age = age;
		}
	}

	public int getAge() {
		return age;
	}

	public void setWeight(int weight) {
		if (weight > 100 || weight < 1){
			System.out.println("Please, enter valid weight value (1-100kg)");
		}else {
			this.weight = weight;
		}
	}

	public int getWeight() {
		return weight;
	}

	public int getPower() {
		return power;
	}

	//method increments points
	public void addPoint(){
		points++;
	}
	//method gives current dog's points
	public int getPoints(){
		return points;
	}

	//comparing dog's power, winner take +1 point
	public void fight(Dog opponent){
		//if power is equal opponent will win too
		if(power <= opponent.getPower()){
			opponent.addPoint();
		} else {
			this.addPoint();
		}
	}
}
