
public class StoneMonster implements Monster{

	private String name;
	
	public StoneMonster (String name){
		this.name = name;
	}
	
	public String attack(){
		return "Ataca: " + name;
	}
}
