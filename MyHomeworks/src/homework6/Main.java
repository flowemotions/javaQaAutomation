package homework6;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		Dog dog1 = new Dog("Maylo", 10, 5);
		Dog dog2 = new Dog("Jerry-Lee", 6, 9);
		Dog dog3 = new Dog("Frank", 4, 7);
		Dog dog4 = new Dog("Scooby Doo", 6, 8);
		Dog dog5 = new Dog("Rex", 8, 6);

		dog1.fight(dog2);
		dog1.fight(dog3);
		dog1.fight(dog4);
		dog1.fight(dog5);

		dog2.fight(dog3);
		dog2.fight(dog4);
		dog2.fight(dog5);

		dog3.fight(dog4);
		dog3.fight(dog5);

		dog4.fight(dog5);

		HashMap<String, Dog> winnersMap =  getMapOfWinners(dog1, dog2, dog3, dog4, dog5);

		printWinners(winnersMap);
	}

	//method calculates points and return table of final results
	public static HashMap<String, Dog> getMapOfWinners(Dog dog1, Dog dog2, Dog dog3, Dog dog4, Dog dog5) {
		//init ArrayList of competitors
		ArrayList<Dog> arrayList = new ArrayList<Dog>();
		//add dogs into ArrayList
		arrayList.add(dog1);
		arrayList.add(dog2);
		arrayList.add(dog3);
		arrayList.add(dog4);
		arrayList.add(dog5);
		//bubble sorting of ArrayList
		for (int i = 0; i < arrayList.size() - 1; i++) {
			for (int j = 0; j < arrayList.size() - 1 - i; j++) {
				if (arrayList.get(j).getPoints() < arrayList.get(j + 1).getPoints()) {
					Dog temp = arrayList.get(j);
					arrayList.set(j, arrayList.get(j + 1));
					arrayList.set(j + 1, temp);
				}
			}
		}
		//init HashMap
		HashMap<String, Dog> hashMap = new HashMap<String, Dog>();
		//add sorted Dog into HashMap according to place
		for (int i = 0; i < arrayList.size(); i++){
			hashMap.put(i + 1 + " место", arrayList.get(i));
		}
		return hashMap;
	}
	
	//method prints final results
	public static void printWinners(HashMap<String, Dog> map){
		String placeKey;
		for (int i = 0; i < map.size(); i++){
			placeKey = i + 1 + " место";
			System.out.println(placeKey + " занял - " + map.get(placeKey).getName() + " с общим количеством очков - " + map.get(placeKey).getPoints());
		}
	}
}
