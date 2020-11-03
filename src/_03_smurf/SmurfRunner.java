package _03_smurf;

public class SmurfRunner {
public static void main(String[] args) {
	Smurf handySmurf = new Smurf("Handy Smurf");
	handySmurf.eat();
	System.out.println(handySmurf.getName());
	Smurf PapaSmurf = new Smurf("Papa Smurf");
	System.out.println(PapaSmurf.getName());
	System.out.println(PapaSmurf.getHatColor());
	System.out.println(PapaSmurf.isGirlOrBoy());
	Smurf Smurfette = new Smurf("Smurfette");
	System.out.println(Smurfette.getName());
	System.out.println(Smurfette.getHatColor());
	System.out.println(Smurfette.isGirlOrBoy());
	
}
}
