
public class Main {
	public static void main(String[] args){
		Monster a1 , b1 , c1 ;
		
		a1 = new FireMonster(null);
		System.out.println(a1.toString());
		b1 = new StoneMonster("WaterMonster");
		System.out.println(b1.toString());
		c1 = new WaterMonster("StoneMonster");
		System.out.println(c1.toString());
		
	}

}
