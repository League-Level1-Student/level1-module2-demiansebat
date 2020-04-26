package _03_smurf;

public class Smurfrunner {
	public static void main(String[] args) {
		Smurf Handy= new Smurf("Handy");
		Handy.eat();
		System.out.println(Handy.getName());
		Smurf Dad= new Smurf("Dad");
		Dad.eat();
		Dad.getHatColor();
		Dad.isGirlOrBoy();
		System.out.println(Dad.getName());
		Smurf Smurfette=new Smurf("Smurfette");
		Smurfette.eat();
		Smurfette.getHatColor();
		Smurfette.isGirlOrBoy();
		System.out.println(Smurfette.getName());
	}

}
