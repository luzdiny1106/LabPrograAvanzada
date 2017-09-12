
public class WaterMonster implements Monster{
	
	private String name;
	
	public WaterMonster (String name){
		this.name = name;
	}
	
	public String attack(){
		return "Ataca: " + name;
	}

}
