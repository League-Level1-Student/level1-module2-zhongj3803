package _02_sea_creature;

public class SeaCreatureRunner {
public static void main(String[] args) {
	SeaCreature spongebob = new SeaCreature("Spongebob");
	spongebob.eat();
	spongebob.laugh();
	SeaCreature squidward = new SeaCreature("Squidward");
	SeaCreature patrick = new SeaCreature("Patrick");
	String patrickName = patrick.getName();
	System.out.println(patrickName);
	String squidwardName = squidward.getName();
	System.out.println(squidwardName);
	patrick.eat();
	patrick.laugh();
	squidward.eat();
	squidward.laugh();
	
}
}
