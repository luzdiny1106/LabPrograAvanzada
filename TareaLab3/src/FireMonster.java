
public class FireMonster implements Monster{
	
	private String name;
	
	public FireMonster (String name){
		this.name = name;
	}
	
	public String attack(){
		return "Ataca: " + name ;
	}

}
