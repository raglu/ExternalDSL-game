package gameDSL;
public class Monster extends HostileNPC {
	
	public Monster(Room currentRoom) {
		super(currentRoom, "monster", 
		true
					,
		4
					,
		2
);
	
	}
}
