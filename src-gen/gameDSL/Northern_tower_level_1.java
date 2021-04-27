package gameDSL;
public class Northern_tower_level_1 extends Room {
	
	static private Northern_tower_level_1 instance = new Northern_tower_level_1();
	
	public static Northern_tower_level_1 getInstance() {
		return instance;
	}
	
	private Northern_tower_level_1() {
		super("Northern Tower level 1");
	}
	
	public void setPaths() {
		paths.add(new Path(Nowhere.getInstance(),					
		"Door"
));
		
		paths.add(new Path(Northern_tower_level_2.getInstance(),					
		"Stairs"
		, new Key()
							));
		
	}
	public void setItems() {
		items.add(new Key());	
		items.add(new Sword());	
	}
}
