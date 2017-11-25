package character;

/*
 *  To improve this, look at the character sheet and add
 *  classes, members, and the like according to what we
 *  keep track of in game.
 *  
 *  For playing, use the dice roller I have already built.
 *  You can import it so that it is incorporated. You can
 *  even modify it so that it suites our purposes better.
 *  */
public class PlayerCharacter {

	protected String name;
	protected String age;
	protected String[] origin;
	protected String height;
	protected String weight;
	
	public PlayerCharacter() {
		
		// empty constructor generates a default character
		this( "Samus Aran",
			   "30", 
			   new String[] { "SR-388", "Galactic Federation Colony" }, 
			   "6'3", 
			   "193 lbs" );
	}
	
	public PlayerCharacter( String n, String a, String[] o, String h, String w ) {
		
		setName( n );
		setAge( a );
		setOrigin( o );
		setHeight( h );
		setWeight( w );
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String[] getOrigin() {
		return origin;
	}
	public void setOrigin(String[] origin) {
		this.origin = origin;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	
	
}
