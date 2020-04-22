package _02_sea_creature;

public class earunner {
	public static void main(String[] args) {
		SeaCreature Spongebob= new SeaCreature("Spongebob");
		SeaCreature Patrick= new SeaCreature("Patrick");
		SeaCreature Squidward= new SeaCreature("Squidward");
		System.out.println(Patrick.getName());
		System.out.println(Squidward.getName());
		Spongebob.eat();
		Patrick.eat();
		Squidward.eat();
	}
	
}
